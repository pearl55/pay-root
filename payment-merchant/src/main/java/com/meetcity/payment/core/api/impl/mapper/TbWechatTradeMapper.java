package com.meetcity.payment.core.api.impl.mapper;


import com.meetcity.payment.core.model.merchant.TbWechatTrade;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 查询所有行业类型
 * Created by lenovo on 2017/9/7.
 */
@Mapper
@Component
public interface TbWechatTradeMapper {
    List<TbWechatTrade> getWechatTrade();
}
