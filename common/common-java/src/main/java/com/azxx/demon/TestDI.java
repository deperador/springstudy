package com.azxx.demon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class TestDI {

    //注入配置中的值
    @Value("${jdbc.driver}")
    private String testproperteis;

    private static final Logger logger = LogManager.getLogger(TestDI.class);

    public TestDI() {
        System.out.println(">>>>>>>>> enter TestDI class constructor");
    }

    public int add(int a ,int b){
        return a+b;
    }

    public void testMethod(){
        System.out.println(this.testproperteis);
    }

}
