package com.meetcity.payment.core.api.agent;


import com.meetcity.payment.core.model.agent.TbAgent;

/**
 * Created by 任彩雨 on 2017/9/5.
 */

public interface AgentLoginService {

    TbAgent AgentLogin(TbAgent tbAgent);//代理商登录

    void updateDateIp(TbAgent tbAgent);//修改登录Ip和时间
}
