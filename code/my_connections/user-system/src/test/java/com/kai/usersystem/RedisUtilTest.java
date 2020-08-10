package com.kai.usersystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import util.redis.RedisUtil;


@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisUtilTest {

    @Autowired
    RedisUtil redisUtil;

    @Test
    public void testRedisUtil(){
        String name = "kaikai";
        redisUtil.set("name", name);
        System.out.println(redisUtil.get("name"));
    }


}
