package com.meetcity.payment.core.api.channel;


import com.meetcity.payment.core.model.order.TbProfit;

import java.util.List;

/**
 * @author 付德鹏
 * @version V1.0
 * @Title: 分润业务层接口
 * @Package
 * @date
 */
public interface TbProfitService {

    List<TbProfit> findProfitListToPage(TbProfit profit);
}
