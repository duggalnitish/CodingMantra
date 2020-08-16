package com.codepractice.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseIntegerTest {

    @Test
    public void testCasePositiveNumber(){
        int x = 123;
        ReverseInteger reverseInteger = new ReverseInteger();
        assertEquals(321, reverseInteger.reverseInteger(x));
    }

    @Test
    public void testCaseNegativeNumber(){
        int x = -10123;
        ReverseInteger reverseInteger = new ReverseInteger();
        assertEquals(-32101, reverseInteger.reverseInteger(x));
    }

    @Test
    public void testCaseTrailingZerosPositive(){
        int x = 5431000;
        ReverseInteger reverseInteger = new ReverseInteger();
        assertEquals(1345, reverseInteger.reverseInteger(x));
    }

    @Test
    public void testCaseTrailingZerosNegative(){
        int x = -561280100;
        ReverseInteger reverseInteger = new ReverseInteger();
        assertEquals(-1082165, reverseInteger.reverseInteger(x));
    }

    @Test
    public void testCaseLargeInteger(){
        int x = 1111111119;
        ReverseInteger reverseInteger = new ReverseInteger();
        assertEquals(0, reverseInteger.reverseInteger(x));
    }

    @Test
    public void testCaseBaseTest(){
        int x = 0;
        ReverseInteger reverseInteger = new ReverseInteger();
        assertEquals(0, reverseInteger.reverseInteger(x));
    }
}
