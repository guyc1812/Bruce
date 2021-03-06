package com.avengers.bruce.Algorithm.leetCode.No1_TwoSum;

import java.util.Arrays;

public class Solution {

    private static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++)
                if ((numbers[i] + numbers[j])%target == 0) {
                    return new int[]{i, j};
                }
        }
        throw new IllegalArgumentException("No solution");
    }

    public static void main(String[] args) {
        int target = 9;
        int[] numbers = {2, 7, 11, 15};
        int[] result = twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
        // [0, 1]
    }
}
