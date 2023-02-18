package com.app.problems.basic;

public class ReverseStringUsingRecursion {
    public static void main(String[] args) {
        String str = "Sanjeev";
        reverse(str);
    }

    public static void reverse(String str) {
        if(str == null || str.isEmpty())
            return;
        char c = str.charAt(str.length()-1);
        System.out.print(c + "\t");
        str = str.substring(0,str.length()-1);
        reverse(str);
    }
}
