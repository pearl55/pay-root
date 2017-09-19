package com.meetcity.payment.core.model.agent;

import java.io.Serializable;

public class ChannelAgent implements Serializable{

    private String channelAgentId;
    private String apiKey;
    private String channelAgentName;
    private String channelAgentSettleFee;

    public String getChannelAgentId() {
        return channelAgentId;
    }

    public void setChannelAgentId(String channelAgentId) {
        this.channelAgentId = channelAgentId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getChannelAgentName() {
        return channelAgentName;
    }

    public void setChannelAgentName(String channelAgentName) {
        this.channelAgentName = channelAgentName;
    }

    public String getChannelAgentSettleFee() {
        return channelAgentSettleFee;
    }

    public void setChannelAgentSettleFee(String channelAgentSettleFee) {
        this.channelAgentSettleFee = channelAgentSettleFee;
    }
}
