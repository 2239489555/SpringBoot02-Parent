package com.fx;

import com.fx.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 成东日  2020/2/6.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class SpringBootTest1 {
    @Autowired
    private TestService testService;
    @Test
    public void setTestService(){
        testService.test();
    }
}
