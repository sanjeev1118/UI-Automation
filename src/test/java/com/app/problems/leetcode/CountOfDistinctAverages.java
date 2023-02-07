package com.app.problems.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountOfDistinctAverages {
    public static void main(String[] args) {
        int[] arr = {9,5,7,8,7,9,8,2,0,7};
        System.out.println("Distict Average "+distinctAverages(arr));
    }
    public static int distinctAverages(int[] nums) {
        sort(nums);
        System.out.println(Arrays.toString(nums));
        int i=0, j=nums.length-1;
        Set<Float> set = new HashSet<>();

        while (i<j) {
            float avg = (float) (nums[i] + nums[j])/2;
            System.out.println(avg);
            set.add(avg);
            i++;
            j--;
        }
        return set.size();
    }

    public static void sort(int[] nums) {
        for (int i=0; i<nums.length-1; i++) {
            for(int j=0; j<nums.length-1-i; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
