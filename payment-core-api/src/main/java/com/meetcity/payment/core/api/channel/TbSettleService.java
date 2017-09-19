package com.meetcity.payment.core.api.channel;


import com.meetcity.payment.core.model.batch.TbSettle;

import java.util.List;

/**
 * Created by 朱梦光 on 2017/9/7.
 */
public interface TbSettleService {

    /**
     * 查询交易信息
     * @param settle page row
     */
    List<TbSettle> selectSettleList(TbSettle settle);
}
