package com.meetcity.payment.core.service.id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class IDService {

    @Autowired
    private RedisTemplate redisTemplate;

    public long nextMerchantId() {
        return redisTemplate.opsForValue().increment("merchant_id", 1);
    }

    public long nextAgentId() {
        return redisTemplate.opsForValue().increment("agent_id", 1);
    }
}
