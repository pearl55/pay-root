package com.meetcity.payment.core.api.merchant;


import com.meetcity.payment.core.model.merchant.TbWechatTrade;

import java.util.List;

/**
 * Created by lenovo on 2017/9/7.
 */
public interface TbWechatTradeService {
    public List<TbWechatTrade> getWechatTrade();
}
