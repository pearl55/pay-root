package com.meetcity.payment.channel.endpoint.vo;

public class QueryMerchantVo {

    private String channelAgentId;
    private String channelAgentApiKey;
    private String channelMerchantId;

    public String getChannelAgentId() {
        return channelAgentId;
    }

    public void setChannelAgentId(String channelAgentId) {
        this.channelAgentId = channelAgentId;
    }

    public String getChannelAgentApiKey() {
        return channelAgentApiKey;
    }

    public void setChannelAgentApiKey(String channelAgentApiKey) {
        this.channelAgentApiKey = channelAgentApiKey;
    }

    public String getChannelMerchantId() {
        return channelMerchantId;
    }

    public void setChannelMerchantId(String channelMerchantId) {
        this.channelMerchantId = channelMerchantId;
    }
}
