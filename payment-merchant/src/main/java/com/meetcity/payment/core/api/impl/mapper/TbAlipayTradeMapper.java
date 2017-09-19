package com.meetcity.payment.core.api.impl.mapper;


import com.meetcity.payment.core.model.merchant.TbAlipayTrade;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lenovo on 2017/9/8.
 */
@Mapper
@Component
public interface TbAlipayTradeMapper {
    List<TbAlipayTrade> getAlipayTrade();
}
