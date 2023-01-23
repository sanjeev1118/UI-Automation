package com.app.problems.basic;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayOfIntersection {
    public static void main(String[] args) {
        intersection(new int[] {1,2,2,1}, new int[] {2,2});
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        int[] arr = new int[set1.size()];
        int index = 0;
        for(Integer no : set1) {
            if(set2.contains(no))
              arr[index++] = no;

        }

        return Arrays.copyOf(arr,index);
    }
}
