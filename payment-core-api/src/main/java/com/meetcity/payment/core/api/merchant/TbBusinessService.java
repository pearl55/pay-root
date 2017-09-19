package com.meetcity.payment.core.api.merchant;

import com.meetcity.payment.core.model.merchant.TbBusiness;

/**
 * 业务类业务层
 * Created by admin on 2017/9/6.
 */
public interface TbBusinessService {
    /**
     * 商户业务修改
     * @param tbBusiness
     */
    void updateTbBusiness(TbBusiness tbBusiness);
}
