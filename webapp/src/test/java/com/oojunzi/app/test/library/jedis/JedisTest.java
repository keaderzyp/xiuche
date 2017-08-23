package com.oojunzi.app.test.library.jedis;

import org.junit.Test;

import com.oojunzi.app.core.feature.cache.redis.RedisCache;
import com.oojunzi.app.core.feature.test.TestSupport;

import javax.annotation.Resource;

/**
 * JedisTest : 测试 jedis 功能
 *
 * @author michael
 * @since 2015-03-20 10:32
 */
public class JedisTest extends TestSupport {


    @Resource
    private RedisCache redisCache;


    @Test
    public void testSet() {
        redisCache.cache("anchor", "michael", 1 * 60 * 24);
    }

    @Test
    public void testGet() {
        System.out.printf(redisCache.get("anchor"));
    }
}
