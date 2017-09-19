package com.meetcity.payment.channel.endpoint.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import com.meetcity.payment.channel.endpoint.common.SignatureUtil;
import com.meetcity.payment.channel.endpoint.common.response.SignResponse;
import com.meetcity.payment.channel.endpoint.validate.VoValidator;
import com.meetcity.payment.channel.endpoint.vo.ChannelMerchantVo;
import com.meetcity.payment.channel.endpoint.vo.QueryMerchantVo;
import com.meetcity.payment.core.api.agent.ChannelAgentApi;
import com.meetcity.payment.core.api.merchant.ChannelMerchantApi;
import com.meetcity.payment.core.common.Response;
import com.meetcity.payment.core.model.agent.ChannelAgent;
import com.meetcity.payment.core.model.merchant.ChannelMerchant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolation;
import java.util.Map;
import java.util.Set;

import static com.meetcity.payment.channel.endpoint.common.response.Code.*;

/**
 * Created by Administrator on 2017/9/11.
 */
@RestController
@Slf4j
public class ChannelMerchantController {

    @Reference
    private ChannelAgentApi channelAgentApi;
    @Reference
    private ChannelMerchantApi channelMerchantApi;

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 通道商户入网接口
     *
     * @return
     */
    @RequestMapping(value = "/v1/merch/add", method = RequestMethod.POST)
    @ResponseBody
    public SignResponse addChannelMerchant(@RequestBody ChannelMerchantVo channelMerchantVo) {
        log.info("channel merchant add : {}", JSON.toJSONString(channelMerchantVo));
        //参数校验
        Set<ConstraintViolation<ChannelMerchantVo>> result = VoValidator.validate(channelMerchantVo);
        if (!result.isEmpty()) {
            StringBuilder msg = new StringBuilder("参数错误:");
            result.forEach(cv -> {
                msg.append(cv.getMessage());
            });
            log.warn("add channel merchant params error , data : {} , msg : {}", JSON.toJSONString(channelMerchantVo), msg.toString());
            return SignResponse.fail(PARAM_ERROR, msg.toString());
        }
        //验签
        ChannelAgent agent = null;

        String agentId = channelMerchantVo.getAgentId();

        Response<ChannelAgent> response = channelAgentApi.findChannelAgentById(agentId);
        if (response.isSuccess() && response.getData() != null) {
            agent = response.getData();
        }

        if (agent == null) {
            return SignResponse.fail(AGENT_NOT_FOUND, "代理商信息不存在");
        }

        boolean sign = SignatureUtil.checkSign(JSON.toJSONString(channelMerchantVo), agent.getApiKey());
        if (!sign) {
            return SignResponse.fail(SIGN_ERROR, "签名错误");
        }

        Response<ChannelMerchant> channelMerchantResponse = channelMerchantApi.findChannelMerchantByAgentAndMerchantId(agentId,channelMerchantVo.getMerchantId());
        if(channelMerchantResponse.isSuccess() && channelMerchantResponse.getData() != null){
            return SignResponse.fail(MERCHANT_ID_EXISTS, "商户号已存在");
        }

        //入库
        ChannelMerchant channelMerchant = new ChannelMerchant();
        channelMerchant.setChannelMerchantId(channelMerchantVo.getMerchantId());
        channelMerchant.setAgentId(channelMerchantVo.getAgentId());
        channelMerchant.setAccountName(channelMerchantVo.getAccountName());
        channelMerchant.setAccountType(channelMerchantVo.getAccountType());
        channelMerchant.setAddress(channelMerchantVo.getAddress());
        channelMerchant.setAlliedBankNo(channelMerchantVo.getAlliedBankNo());
        channelMerchant.setBankCard(channelMerchantVo.getBankCard());
        channelMerchant.setBankName(channelMerchantVo.getBankName());
        channelMerchant.setBankSubName(channelMerchantVo.getBankSubName());
        channelMerchant.setBusinessAddress(channelMerchantVo.getBusinessAddress());
        channelMerchant.setCity(channelMerchantVo.getCity());
        channelMerchant.setContact(channelMerchantVo.getContact());
        channelMerchant.setCityName(channelMerchantVo.getCityName());
        channelMerchant.setContactEmail(channelMerchantVo.getContactEmail());
        channelMerchant.setContactPhone(channelMerchantVo.getContactPhone());
        channelMerchant.setDistrictName(channelMerchantVo.getDistrictName());
        channelMerchant.setIsCapped(channelMerchantVo.getIsCapped());
        channelMerchant.setLegalId(channelMerchantVo.getLegalId());
        channelMerchant.setLegalName(channelMerchantVo.getLegalName());
        channelMerchant.setLicenseNo(channelMerchantVo.getLicenseNo());
        channelMerchant.setMerchantBizName(channelMerchantVo.getMerchantBizName());
        channelMerchant.setMerchantName(channelMerchantVo.getMerchantName());
        channelMerchant.setPayChannel(channelMerchantVo.getPayChannel());
        channelMerchant.setProvince(channelMerchantVo.getProvince());
        channelMerchant.setProvinceName(channelMerchantVo.getProvinceName());
        channelMerchant.setRate(Double.valueOf(channelMerchantVo.getRate()));
        channelMerchant.setServicePhone(channelMerchantVo.getServicePhone());
        channelMerchant.setSettleMode(channelMerchantVo.getSettleMode());
        channelMerchant.setT0Extra(Double.valueOf(channelMerchantVo.getT0Extra()));
        channelMerchant.setT0Rate(Double.valueOf(channelMerchantVo.getT0Rate()));
        channelMerchant.setT0Status(channelMerchantVo.getT0Status());
        Response<ChannelMerchant> insertResponse = channelMerchantApi.addChannelMerchant(channelMerchant);
        if(!insertResponse.isSuccess() || insertResponse.getData() == null){
            return SignResponse.fail(UNKNOWN_ERROR, "商户保存失败");
        }
        channelMerchant = insertResponse.getData();
        //入队列(消费端在channel模块中,报备完成后会异步通知通道回调地址告知报备完成)
        redisTemplate.convertAndSend("channel_merchant",channelMerchant);
        //返回
        Map<String,String> data = Maps.newHashMap();
        data.put("merchantId",channelMerchant.getMerchantId());
        data.put("apiKey",channelMerchant.getApiKey());
        return SignResponse.success(data,agent.getApiKey());
    }

    @RequestMapping(value = "/v1/merch/query", method = RequestMethod.POST)
    @ResponseBody
    public SignResponse queryChannelMerchant(@RequestBody QueryMerchantVo queryMerchantVo) {
        log.info("query channel merchant : {}", JSON.toJSONString(queryMerchantVo));
        //验签
        //查询
        //返回
        return SignResponse.success();
    }


    @RequestMapping(value = "/v1/merch/update", method = RequestMethod.POST)
    @ResponseBody
    public SignResponse updateChannelMerchant(@RequestBody ChannelMerchantVo queryMerchantVo) {
        log.info("update channel merchant : {}", JSON.toJSONString(queryMerchantVo));
        //验签
        //入库
        //入队列(消费端在channel模块中,报备完成后会异步通知通道回调地址告知报备完成)
        //返回
        return SignResponse.success();
    }
}
