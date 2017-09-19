package com.meetcity.payment.core.api.merchant;


import com.meetcity.payment.core.model.merchant.TbAlipayTrade;

import java.util.List;

/**
 * Created by lenovo on 2017/9/8.
 */
public interface TbAlipayTradeService {
    List<TbAlipayTrade> getAlipayTrade();
}
