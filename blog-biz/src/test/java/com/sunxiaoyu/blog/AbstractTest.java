package com.sunxiaoyu.blog;

/**
 * Created by linker on 14-5-21.
 */

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试基类
 *
 * @author tiantian.gao
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath*:/config/spring/local/context-mybatis.xml"})
@Ignore
public abstract class AbstractTest {

    public void notNull(Object obj) {
        assert null != obj;
    }

    public void isNull(Object obj) {
        assert null == obj;
    }

}
