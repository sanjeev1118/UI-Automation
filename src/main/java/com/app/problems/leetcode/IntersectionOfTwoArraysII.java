package com.app.problems.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>();
        int[] result = new int[nums1.length];

        for(Integer no : nums1) {
            if(map1.containsKey(no))
                map1.put(no, map1.get(no)+1);
            else
                map1.put(no,1);
        }

        int counter = 0;
        for (Integer no : nums2) {
            if(map1.containsKey(no) && map1.get(no)>0) {
                result[counter++] = no;
                map1.put(no, map1.get(no)-1);
            }
        }
        return Arrays.copyOf(result,counter);
    }
}
