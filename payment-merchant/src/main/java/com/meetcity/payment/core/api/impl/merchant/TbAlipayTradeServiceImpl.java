package com.meetcity.payment.core.api.impl.merchant;


import com.meetcity.payment.core.api.impl.mapper.TbAlipayTradeMapper;
import com.meetcity.payment.core.api.merchant.TbAlipayTradeService;
import com.meetcity.payment.core.model.merchant.TbAlipayTrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/9/8.
 */
@Service
public class TbAlipayTradeServiceImpl implements TbAlipayTradeService {

    @Autowired
    private TbAlipayTradeMapper tbAlipayTradeMapper;

    @Override
    public List<TbAlipayTrade> getAlipayTrade() {
        List<TbAlipayTrade> alipayTrades = tbAlipayTradeMapper.getAlipayTrade();
        if(alipayTrades != null && alipayTrades.size() > 0){
            return alipayTrades;
        }
        return null;
    }
}
