package com.azxx.demon;

import com.azxx.project.SpringTestBase;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class TestDITest extends SpringTestBase {

    @Autowired
    private TestDI testDI;

    @Test
    public void TestAdd(){
        TestDI test = new TestDI();
        Assert.assertEquals(4,test.add(1,2));
    }

    @Test
    public void TestAdd2(){
        Assert.assertEquals(3,testDI.add(1,2));
    }
}