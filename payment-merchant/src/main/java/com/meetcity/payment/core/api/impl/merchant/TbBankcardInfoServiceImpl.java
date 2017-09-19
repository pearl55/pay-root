package com.meetcity.payment.core.api.impl.merchant;


import com.meetcity.payment.core.api.impl.mapper.TbBankcardInfoMapper;
import com.meetcity.payment.core.api.merchant.TbBankcardInfoService;
import com.meetcity.payment.core.model.merchant.TbBankcardInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/9/6.
 */
@Service
public class TbBankcardInfoServiceImpl implements TbBankcardInfoService {
    @Autowired
    private TbBankcardInfoMapper tbBankcardInfoMapper;

    @Override
    public void updateTbBankcardInfo(TbBankcardInfo tbBankcardInfo) {
        tbBankcardInfoMapper.updateTbBankcardInfo(tbBankcardInfo);
    }
}
