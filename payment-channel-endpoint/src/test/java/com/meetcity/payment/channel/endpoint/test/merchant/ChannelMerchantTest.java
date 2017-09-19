package com.meetcity.payment.channel.endpoint.test.merchant;

import com.meetcity.payment.channel.endpoint.RestClient;
import com.meetcity.payment.channel.endpoint.common.SignatureUtil;
import com.meetcity.payment.channel.endpoint.vo.ChannelMerchantVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ChannelMerchantTest {

    @Test
    public void addChannelMerchant() throws Exception {
        ChannelMerchantVo vo = new ChannelMerchantVo();
        vo.setAgentId("CA0001");
        //vo.setMerchantId("CM100001");
        vo.setMerchantName("通道测试商户");
        vo.setMerchantBizName("通道测试商户");
        vo.setLegalId("4518162005158491");
        vo.setLegalName("张三");
        vo.setContact("张三");
        vo.setContactPhone("18518981371");
        vo.setContactEmail("18518981371@163.com");
        vo.setServicePhone("18518981371");
        vo.setPayChannel("WECHAT_OFFLINE");
        vo.setRate("0.0038");
        vo.setT0Status("N");
        vo.setIsCapped("N");
        vo.setSettleMode("T1_AUTO");
        vo.setAccountType("PERSONAL");
        vo.setAccountName("张三");
        vo.setBankCard("6226060625151651");
        vo.setBankName("中国工商银行");
        vo.setProvince("北京");
        vo.setCity("北京");
        vo.setBankSubName("顺义区支行");
        vo.setAlliedBankNo("11151200021");
        vo.setSign(SignatureUtil.getSign(vo,"ABCDEFG"));

        String response = RestClient.getClient().postForObject("http://127.0.0.1:8080/v1/merch/add", vo, String.class);
        log.info("response : {}", response);
    }
}
