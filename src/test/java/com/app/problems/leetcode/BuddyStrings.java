package com.app.problems.leetcode;

public class BuddyStrings {
    public static void main(String[] args) {
        String s = "ab";
        String goal = "ab";
        System.out.println(buddyStrings(s,goal));
    }

    public static boolean buddyStrings(String s, String goal) {
        for(int i=0; i<s.length(); i++) {
            for(int j=0; j<s.length(); j++) {
                if(i != j) {
                    if(swapChars(s,i,j).equals(goal))
                        return true;
                }
            }
        }
        return false;
    }

    public static String swapChars(String s, int i, int j) {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }
}
