package com.meetcity.payment.core.service.agent;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.meetcity.payment.core.api.agent.ChannelAgentApi;
import com.meetcity.payment.core.common.Response;
import com.meetcity.payment.core.common.ResponseBuilder;
import com.meetcity.payment.core.dao.ChannelAgentMapper;
import com.meetcity.payment.core.model.agent.ChannelAgent;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@Slf4j
public class ChannelAgentApiImpl implements ChannelAgentApi {

    @Autowired
    private ChannelAgentMapper channelAgentMapper;

    @Override
    public Response<ChannelAgent> createChannelAgent(ChannelAgent channelAgent) {
        log.debug("create channel agent : {}", JSON.toJSONString(channelAgent));
        int id = channelAgentMapper.insert(channelAgent);
        log.debug("create channel agent return :{}", id);
        return ResponseBuilder.success(channelAgent);
    }

    @Override
    public Response<ChannelAgent> findChannelAgentById(String channelAgentId) {
        if (StringUtils.isNotEmpty(channelAgentId)) {
            ChannelAgent example = new ChannelAgent();
            example.setChannelAgentId(channelAgentId);
            ChannelAgent agent = channelAgentMapper.selectOne(example);
            if (agent == null) {
                return ResponseBuilder.success();
            } else {
                return ResponseBuilder.success(agent);
            }
        }
        return null;
    }
}
