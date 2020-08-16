package com.codepractice.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseInteger {

    /*
    *
    * Given a 32-bit signed integer, reverse digits of an integer.
    *
    * Example 1:
    *   Input: 123
    *   Output: 321
    * Example 2:
    *   Input: -123
    *   Output: -321
    * Example 3:
    *   Input: 120
    *   Output: 21
    * NOTE: Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
    * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
    *
    * */

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the total number of test cases that you wish to run: ");
        int totalTestCase = Integer.parseInt(bufferedReader.readLine());
        ReverseInteger reverseInteger = new ReverseInteger();
        while(totalTestCase-->0){
            System.out.println("Please enter the value of Integer that you wish to reverse: ");
            int value = Integer.parseInt(bufferedReader.readLine());
            int result = reverseInteger.reverseInteger(value);
            System.out.println("input: " + value);
            System.out.println("output: " + result);
        }
        int value = Integer.MAX_VALUE;
        Integer integer = value * value;
        value = value*value;
        System.out.println(integer);
        System.out.println(value);
    }
    public int reverseInteger(int value){
        if(value == 0){
            return 0;
        }

        boolean isNumberNegative = value < 0;

        if(isNumberNegative){
            value = -value;
        }
        int lastDigit = value%10;
        while(lastDigit==0){
            value = value/10;
            lastDigit = value%10;
        }
        long result = 0;

        while( value!=0){
            lastDigit = value%10;
            value = value/10;
            result = result*10 + lastDigit;
            if(isValueOverflown(result)){
                return 0;
            }
        }

        return isNumberNegative? -(int)result: (int) result;
    }

    private static boolean  isValueOverflown(long value){
        return value > Integer.MAX_VALUE || value < Integer.MIN_VALUE;
    }
}
