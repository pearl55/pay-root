package com.meetcity.payment.channel.channel;


import com.meetcity.payment.channel.mapper.TbOrderMapper;
import com.meetcity.payment.core.api.channel.TbOrderService;
import com.meetcity.payment.core.model.order.TbOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ${崔帅} on 2017/9/6.
 */
@Service
public class TbOrderServiceImpl implements TbOrderService {
    @Autowired
    private TbOrderMapper tbOrderMapper;

    @Override
    public List<TbOrder> findAll(TbOrder order){
        return tbOrderMapper.select(order);
    }


}
