package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectqba1 {

        Projectqba1Delegate projectqba1Delegate = new Projectqba1Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectqba1Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}