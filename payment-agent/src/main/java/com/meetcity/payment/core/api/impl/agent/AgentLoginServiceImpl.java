package com.meetcity.payment.core.api.impl.agent;


import com.meetcity.payment.core.api.agent.AgentLoginService;
import com.meetcity.payment.core.api.mapper.AgentLoginMapper;
import com.meetcity.payment.core.model.agent.TbAgent;
import com.meetcity.payment.core.model.util.DateUtil;
import com.meetcity.payment.core.model.util.IpUtils;
import com.meetcity.payment.core.model.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by 任彩雨 on 2017/9/5.
 */
@Service
public class AgentLoginServiceImpl implements AgentLoginService {

   @Autowired
   private RedisTemplate<Object, Object> redisTemplate;

    @Autowired
    private AgentLoginMapper agentLoginMapper;

    @Override
    public TbAgent AgentLogin(TbAgent tbAgent) {
        //将MD5加密
        if (tbAgent.getPassword() != null && tbAgent.getPassword() != "") {
            String md5Encode = MD5Util.MD5Encode(tbAgent.getPassword());
            tbAgent.setPassword(md5Encode);
        }
        TbAgent agentLogin = agentLoginMapper.AgentLogin(tbAgent);
        if (agentLogin != null) {
            String yyyYmmddHHmmss = DateUtil.getYYYYmmddHHmmss();//调用时间
            String realIp = IpUtils.getRealIp();//得到Ip
            agentLogin.setLastIp(realIp);
            agentLogin.setLastLoginTime(yyyYmmddHHmmss);//设置当前登录的时间
            agentLoginMapper.updateDateIp(agentLogin);
        }
        return agentLogin;
    }

    @Override
    public void updateDateIp(TbAgent tbAgent) {

    }


}
