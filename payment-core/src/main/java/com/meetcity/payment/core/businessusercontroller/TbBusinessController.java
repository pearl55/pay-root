package com.meetcity.payment.core.businessusercontroller;

import com.meetcity.payment.core.api.merchant.TbBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by admin on 2017/9/6.
 */
@Controller
public class TbBusinessController {
    @Autowired
    private TbBusinessService tbBusinessService;
}
