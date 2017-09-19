package com.meetcity.payment.core.api.impl.merchant;

import com.meetcity.payment.core.api.impl.mapper.TbBusinessMapper;
import com.meetcity.payment.core.api.merchant.TbBusinessService;
import com.meetcity.payment.core.model.merchant.TbBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务类业务层实现类
 * Created by admin on 2017/9/6.
 */
@Service
public class TbBusinessServiceImpl implements TbBusinessService {
    @Autowired
    private TbBusinessMapper tbBusinessMapper;

    @Override
    public void updateTbBusiness(TbBusiness tbBusiness) {
        tbBusinessMapper.updateTbBusiness(tbBusiness);
    }
}
