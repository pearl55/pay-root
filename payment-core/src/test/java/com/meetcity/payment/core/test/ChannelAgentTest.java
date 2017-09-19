package com.meetcity.payment.core.test;

import com.meetcity.payment.core.CoreApplication;
import com.meetcity.payment.core.common.ChannelAgentConstants;
import com.meetcity.payment.core.dao.ChannelAgentMapper;
import com.meetcity.payment.core.model.agent.ChannelAgent;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CoreApplication.class)// 指定spring-boot的启动类
@Slf4j
public class ChannelAgentTest {

    @Autowired
    private ChannelAgentMapper channelAgentMapper;

    @Test
    public void testCreateAgentChannel() {
        ChannelAgent channelAgent = new ChannelAgent();
        channelAgent.setChannelAgentId(ChannelAgentConstants.ID_PREFIX + "0001");
        channelAgent.setApiKey("ABCDEFG");
        channelAgent.setChannelAgentName("测试通道代理商");
        channelAgent.setChannelAgentSettleFee("0.0038");
        int id = channelAgentMapper.insert(channelAgent);
        log.info("Test create channelAgent : {}", id);
    }
}
