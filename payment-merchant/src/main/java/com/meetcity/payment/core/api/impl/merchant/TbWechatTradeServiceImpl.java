package com.meetcity.payment.core.api.impl.merchant;


import com.meetcity.payment.core.api.impl.mapper.TbWechatTradeMapper;
import com.meetcity.payment.core.api.merchant.TbWechatTradeService;
import com.meetcity.payment.core.model.merchant.TbWechatTrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/9/7.
 */
@Service
public class TbWechatTradeServiceImpl implements TbWechatTradeService {

    @Autowired
    private TbWechatTradeMapper tbWechatTradeMapper;

    /**
     * 查询所有行业类型
     * @return
     */
    @Override
    public List<TbWechatTrade> getWechatTrade() {
        List<TbWechatTrade> wechatTrades = tbWechatTradeMapper.getWechatTrade();
        if(wechatTrades != null && wechatTrades.size() > 0){
            return wechatTrades;
        }
        return null;
    }
}
