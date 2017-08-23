package com.oojunzi.app.test.bean;

import org.junit.Test;

import com.oojunzi.app.core.feature.test.TestSupport;

import javax.annotation.Resource;

/**
 * SpiderTest : 爬虫测试类
 *
 * @author michael
 * @since 2014-10-27 22:44
 */
public class SpiderTest extends TestSupport {

    @Resource
    private Spider spider;

    @Test
    public void testInjectSpider() throws Exception {
        System.out.println(spider);
    }
}
