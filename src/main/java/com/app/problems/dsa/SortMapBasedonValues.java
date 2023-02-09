package com.app.problems.dsa;

import java.util.*;

public class SortMapBasedonValues {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("Math",98,"Data Structure",85,"Database",91,"Java",95,"Operation System",79,"Networking",80);


        List<Map.Entry<String,Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println("After Sorting-----");
        for (Map.Entry<String,Integer> entry: list) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }
}
