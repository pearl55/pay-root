package com.meetcity.payment.core.api.merchant;


import com.meetcity.payment.core.model.merchant.TbBankcardInfo;

/**
 * Created by admin on 2017/9/6.
 */
public interface TbBankcardInfoService {
    /**
     * 银行卡信息修改
     * @param tbBankcardInfo
     */
    void updateTbBankcardInfo(TbBankcardInfo tbBankcardInfo);
}
