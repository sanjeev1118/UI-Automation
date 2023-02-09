package com.app.problems.dsa;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateCharacters {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
//        printDuplicatesUsingMap(str);
        printDuplicatesWithoutUsingMap(str);
    }

    private static void printDuplicatesUsingMap(String str) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        System.out.println(map);

        Set<Map.Entry<Character,Integer>> entries = map.entrySet();
        for (Map.Entry<Character,Integer> entry : entries) {
            if(entry.getValue()>1)
                System.out.println(entry.getKey() +": "+ entry.getValue());
        }
    }

    private static void printDuplicatesWithoutUsingMap(String str) {
        int count;
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            count = 1;
            for(int j=i+1; j<str.length(); j++) {
                if(c != '#') {
                   if( str.charAt(j) == c)
                       count++;
                }
            }
            if (c != '#')
                System.out.println(c + ": " + count);
            str = str.replace(c,'#');
        }
    }
}
