package com.app.problems.basic;

public class ValidPalindrom {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        String res = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(isPalindrome("  "));
        System.out.println(res);
    }

    public static boolean isPalindrome(String s) {
        for (int i=0,j=s.length()-1; i<j&&j>i; i++,j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}
