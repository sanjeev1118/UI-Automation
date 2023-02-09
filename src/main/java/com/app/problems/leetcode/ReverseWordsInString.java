package com.app.problems.leetcode;

public class ReverseWordsInString {
    public static void main(String[] args) {
//        String s = "the sky is blue";
        String s = "  hello world  ";
//        String s = "a good   example";

        System.out.println("Output:- "+ reverseWords(s));
    }
    public static String reverseWords(String s) {
       String[] arr = s.trim().split("(\s+)");
        System.out.println("Length of String: "+ arr.length);
       StringBuffer sb = new StringBuffer();

       for(int i=arr.length-1; i>=0; i--) {
           sb.append(arr[i] + " ");
       }
       return sb.toString().trim();
    }
}
