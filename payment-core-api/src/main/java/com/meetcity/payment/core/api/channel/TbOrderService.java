package com.meetcity.payment.core.api.channel;


import com.meetcity.payment.core.model.order.TbOrder;

import java.util.List;

/**    交易记录service
 * Created by ${崔帅} on 2017/9/6.
 */
public interface TbOrderService {

    List<TbOrder> findAll(TbOrder order);


}
