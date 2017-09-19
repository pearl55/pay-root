package com.meetcity.payment.core.alipaycontroller;


import com.meetcity.payment.core.api.merchant.TbAlipayTradeService;
import com.meetcity.payment.core.model.merchant.TbAlipayTrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lenovo on 2017/9/8.
 */
@Controller
@RequestMapping("/AlipayTrade")
public class TbAlipayTradeController {

    @Autowired
    private TbAlipayTradeService tbAlipayTradeService;

    @RequestMapping("/findAlipayTrade")
    @ResponseBody
    public List<TbAlipayTrade> findAlipayTrade(){
        List<TbAlipayTrade> alipayTrade = tbAlipayTradeService.getAlipayTrade();
        return alipayTrade;
    }
}
