package com.jc;

import com.jc.springBootDemo.SpringBootDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
public class SpringBootDemoApplicationTests {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringBootDemoApplicationTests.class);
    @Test
    public void contextLoads() {
        System.out.println("test");
        LOGGER.info("test1");
    }

}
