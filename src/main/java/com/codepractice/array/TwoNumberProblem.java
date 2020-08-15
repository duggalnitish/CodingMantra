package com.codepractice.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoNumberProblem {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("enter total number of test cases: ");
        int testCases = Integer.parseInt(bufferedReader.readLine());
        while(testCases-->0){

            System.out.print("enter array size: ");
            int arraySize = Integer.parseInt(bufferedReader.readLine());
            System.out.print("target: ");
            int target = Integer.parseInt(bufferedReader.readLine());

            int[] numberArray = new int[arraySize];
            System.out.print("enter array number: ");
            String arrayNumbers = bufferedReader.readLine();
            String[] numberArr = arrayNumbers.split(" ");
            for(int i = 0 ; i< numberArr.length; i ++){
                numberArray[i] = Integer.parseInt(numberArr[i]);
            }
            int[] output = TwoNumberProblem.twoSum(numberArray, target);

            System.out.println(Arrays.toString(output));
        }

    }

    public static int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length < 2) {
            return null;
        }
        int[] output = new int[2];
        Map<Integer, Integer> targetNumberMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (targetNumberMap.get(nums[i]) != null) {
                output[0] = targetNumberMap.get(nums[i]);
                output[1] = i;
                break;
            } else {
                targetNumberMap.put(target - nums[i], i);
            }
        }

        return output;

    }
}
