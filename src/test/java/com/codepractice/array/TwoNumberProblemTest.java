package com.codepractice.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;

public class TwoNumberProblemTest {

    @Test
    public void test01() {
        int[] arr = {10, 4, 5, 10, 1, 3};
        int [] result = {0,3};
        String _result = Arrays.toString(result);
        assertEquals(_result, Arrays.toString(TwoNumberProblem.twoSum(arr, 20)));
    }

    @Test
    public void test02() {
        int[] arr = {11, -4, 124, 112, 11, 35};
        int [] result = {1,2};
        String _result = Arrays.toString(result);
        assertEquals(_result,Arrays.toString(TwoNumberProblem.twoSum(arr, 120)));
    }

    @Test
    public void test03() {
        int[] arr = {-1, 1, 0, 12, 4, 1};
        int [] result = {0,2};
        String _result = Arrays.toString(result);
        assertEquals(_result,Arrays.toString(TwoNumberProblem.twoSum(arr, -1)));
    }
}
