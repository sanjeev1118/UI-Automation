package com.app.problems.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayConcatenationValue {
    public static void main(String[] args) {
        int[] arr = {5,14,13,8,12};
        System.out.println(findTheArrayConcVal(arr));
    }
    public static long findTheArrayConcVal(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int concatenation = 0;
     for(int num : nums) {
         list.add(num);
     }

     while(list.size()>0) {
         if(list.size()==1) {
             concatenation += list.get(0);
             list.remove(0);
         } else {

             int num = Integer.parseInt(list.get(0) + "" + list.get(list.size()-1));
             concatenation += num;
             list.remove(0);
             list.remove(list.size()-1);
         }
     }
     return concatenation;
    }
}
