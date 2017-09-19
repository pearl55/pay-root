package com.meetcity.payment.core.api.impl.agent;


import com.meetcity.payment.core.api.agent.Bank;
import com.meetcity.payment.core.api.agent.BankService;
import com.meetcity.payment.core.api.mapper.BankMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/9/8.
 */
@Service
public class BankServiceImpl implements BankService {
    @Autowired
    private BankMapper bankMapper;

    @Override
    public List<String> findBankName() {
        return bankMapper.findBankName();
    }

    @Override
    public List<Bank> findByBankName(Bank bank) {
        return bankMapper.findByBankName(bank);
    }

    @Override
    public String findBankNo(String bankSubName) {
        return bankMapper.findBankNo(bankSubName);
    }
}
