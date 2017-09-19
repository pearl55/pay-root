package com.meetcity.payment.core.service.merchant;

import com.alibaba.dubbo.config.annotation.Service;
import com.meetcity.payment.core.api.merchant.ChannelMerchantApi;
import com.meetcity.payment.core.common.Response;
import com.meetcity.payment.core.common.ResponseBuilder;
import com.meetcity.payment.core.common.ResponseCode;
import com.meetcity.payment.core.dao.ChannelMerchantMapper;
import com.meetcity.payment.core.model.merchant.ChannelMerchant;
import com.meetcity.payment.core.service.id.IDService;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import static com.meetcity.payment.core.common.ChannelMerchantConstants.MERCHANT_STATUS_INIT;

@Service
public class ChannelMerchantApiImpl implements ChannelMerchantApi {

    @Autowired
    private ChannelMerchantMapper channelMerchantMapper;
    @Autowired
    private IDService idService;

    @Override
    public Response<ChannelMerchant> findChannelMerchantByAgentAndMerchantId(String agentId, String merchantId) {
        if (StringUtils.isNotEmpty(agentId) && StringUtils.isNotEmpty(merchantId)) {
            ChannelMerchant example = new ChannelMerchant();
            example.setAgentId(agentId);
            example.setChannelMerchantId(merchantId);
            ChannelMerchant channelMerchant = channelMerchantMapper.selectOne(example);
            if (channelMerchant != null) {
                return ResponseBuilder.success(channelMerchant);
            }
        }
        return ResponseBuilder.fail(ResponseCode.FAIL, "参数错误");
    }

    public Response<ChannelMerchant> addChannelMerchant(ChannelMerchant channelMerchant) {
        if (channelMerchant != null) {
            long merchantId = idService.nextMerchantId();
            channelMerchant.setMerchantId(String.valueOf(merchantId));
            channelMerchant.setApiKey(RandomStringUtils.randomAscii(16));
            channelMerchant.setMerchantStatus(MERCHANT_STATUS_INIT);
            int row = channelMerchantMapper.insert(channelMerchant);
            if (row == 1) {
                return ResponseBuilder.success(channelMerchant);
            }
            return ResponseBuilder.fail(ResponseCode.FAIL, "插入商户错误");
        }
        return ResponseBuilder.fail(ResponseCode.FAIL, "参数错误");
    }
}
