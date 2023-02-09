package com.app.problems.leetcode;

import java.util.*;

public class MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};

        System.out.println(Arrays.toString(findRestaurant(list1,list2)));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list = new ArrayList<String>();
        Map<String,Integer> map = new HashMap<>();
        int minsum = Integer.MAX_VALUE;

        for(int i=0; i<list1.length; i++) {
            map.put(list1[i],i);
        }
        for(int j=0; j<list2.length; j++) {
            if(map.containsKey(list2[j])) {
                int sum = map.get(list2[j]) + j;
                if(sum<minsum) {
                    minsum = sum;
                    list.clear();
                    list.add(list2[j]);
                } else if(sum == minsum) {
                    list.add(list2[j]);
                }
            }
        }
        int i=0;
        String[] result = new String[list.size()];
        for(Object o : list.toArray()) {
            result[i++] = (String)o;
        }

        return result;
    }
}
