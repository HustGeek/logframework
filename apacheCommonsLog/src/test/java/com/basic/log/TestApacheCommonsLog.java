package com.basic.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 * locate com.basic.log
 * Created by 79875 on 2017/5/15.
 */
public class TestApacheCommonsLog {

    private Log LOG= LogFactory.getLog(TestApacheCommonsLog.class);

    @Test
    public void testInfo(){
        LOG.info("hello my log");
    }

    @Test
    public void testdebug(){
        LOG.debug("hello my log");
    }

    @Test
    public void testwarn(){
        LOG.warn("hello my log");
    }

    @Test
    public void testerror(){
        LOG.error("hello my log");
    }

    @Test
    public void testmark(){
        //LOG.info("hello my dear {} {}","baby","ARE 有 all right");
    }
}
