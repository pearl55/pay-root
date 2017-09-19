package com.meetcity.payment.core.api.agent;

import com.meetcity.payment.core.common.Response;
import com.meetcity.payment.core.model.agent.ChannelAgent;

/**
 * Created by Administrator on 2017/9/11.
 */
public interface ChannelAgentApi {

    /**
     * 创建通道代理商
     * @param channelAgent
     * @return
     */
    Response<ChannelAgent> createChannelAgent(ChannelAgent channelAgent);

    Response<ChannelAgent> findChannelAgentById(String channelAgentId);
}
