package com.azxx.demon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;


@Component
public class TestDI {

    private static final Logger logger = LogManager.getLogger(TestDI.class);

    public TestDI() {
        System.out.println(">>>>>>>>> enter TestDI class constructor");
    }

    public int add(int a ,int b){
        return a+b;
    }

}
