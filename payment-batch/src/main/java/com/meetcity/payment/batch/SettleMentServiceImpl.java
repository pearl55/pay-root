package com.meetcity.payment.batch;


import com.meetcity.payment.core.api.batch.SettleMentService;
import com.meetcity.payment.core.model.batch.SettleMent;
import com.meetcity.payment.mapper.SettleMentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ${崔帅} on 2017/9/12.
 */
@Service
public class SettleMentServiceImpl implements SettleMentService {
    @Autowired
    private SettleMentMapper settleMentMapper;

    @Override
    public void insertSettleMent(SettleMent settleMent){
        settleMentMapper.insertSettleMent(settleMent);
    }

}
