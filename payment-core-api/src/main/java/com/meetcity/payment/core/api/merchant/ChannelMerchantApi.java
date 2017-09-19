package com.meetcity.payment.core.api.merchant;

import com.meetcity.payment.core.common.Response;
import com.meetcity.payment.core.model.merchant.ChannelMerchant;

/**
 * Created by Administrator on 2017/9/11.
 */
public interface ChannelMerchantApi {
    Response<ChannelMerchant> findChannelMerchantByAgentAndMerchantId(String agentId, String merchantId);
    Response<ChannelMerchant> addChannelMerchant(ChannelMerchant channelMerchant);
}
