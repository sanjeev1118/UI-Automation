package com.app.problems.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IshomorphicString {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if( s.length() != t.length())
            return false;
        Map<Character,Character> map = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                if(map.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
            else {
                    if(map.containsValue(s.charAt(i)))
                        return false;
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        
        return true;
    }
}
