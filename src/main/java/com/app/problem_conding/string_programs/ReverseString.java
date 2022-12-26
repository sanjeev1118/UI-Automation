package com.app.problem_conding.string_programs;

import java.util.Collections;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello India!";
      /*  System.out.println("Reverse "+ reverseWithGenericApproach(str));
        System.out.println(reverseStringUsingBuffer(str));
        System.out.println(reverseStringUsingBuilder(str));*/
        System.out.println(reverseStringUsingStack(str));
    }

    public static String reverseStringUsingStack(String str) {
        Stack<Character> stack = new Stack<>();
        String reverse = "";

        for (int i=0; i<str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for(int i=0; i<stack.size(); i++) {
            reverse += stack.pop();
//            stack.pop();
        }
        return reverse;
    }

    public static String reverseWithGenericApproach(String str) {
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static String reverseStringUsingBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static String reverseStringUsingBuffer(String str) {
        return new StringBuffer(str).reverse().toString();
    }
}
