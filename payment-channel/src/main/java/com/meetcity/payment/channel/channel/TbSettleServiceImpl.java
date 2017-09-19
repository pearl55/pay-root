package com.meetcity.payment.channel.channel;

import com.meetcity.payment.channel.mapper.TbSettleMapper;
import com.meetcity.payment.core.api.channel.TbSettleService;
import com.meetcity.payment.core.model.batch.TbSettle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 朱梦光 on 2017/9/7.查询结算交易Service
 */
@Service
@Transactional
public class TbSettleServiceImpl implements TbSettleService {
    @Autowired
    private TbSettleMapper tbSettleMapper;

    @Override
    public List<TbSettle> selectSettleList(TbSettle settle) {

        return tbSettleMapper.selectSettleList(settle);
    }
}
