package com.basic.log;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * locate com.basic.log
 * Created by 79875 on 2017/5/15.
 */
public class TestLogback {
    private Logger logger= LoggerFactory.getLogger(TestLogback.class);

    @Test
    public void testInfo(){
        logger.info("hello my log");
    }

    @Test
    public void testdebug(){
        logger.debug("hello my log");
    }

    @Test
    public void testwarn(){
        logger.warn("hello my log");
    }

    @Test
    public void testerror(){
        logger.error("hello my log");
    }

    @Test
    public void testmark(){
        logger.info("hello my dear {} {}","baby","ARE 有 all right");
    }
}
