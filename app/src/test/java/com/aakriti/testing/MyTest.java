package com.aakriti.testing;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class MyTest {


    @Test
    public void  checkTwoNo(){
         Arithmetic arithmetic = new Arithmetic();
            float expected = 5;
            float actual = arithmetic.add(2,3);

            assertEquals (expected, actual);

    }
}
