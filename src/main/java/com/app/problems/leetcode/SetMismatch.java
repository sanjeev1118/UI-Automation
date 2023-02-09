package com.app.problems.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {2,2};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] nums) {
        int[] temp = new int[nums.length];
        int[] result = new int[2];

        for(int i=0; i<temp.length; i++) {
            temp[i] = i+1;
        }
        for(int i=0; i<temp.length; i++) {
            if(temp[i] - nums[i] != 0) {
                result[0] = nums[i];
                result[1] = temp[i];
                break;
            }
        }

        return result;
    }
}
