package com.app.problem_conding;

import java.util.Scanner;

public class ReverseString1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scn.next();
        StringBuilder sb = new StringBuilder();

        for(int i=str.length()-1; i>=0; i--) {
           sb.append(str.charAt(i));
        }
        System.out.println("String after reverse: "+ sb.toString());
    }
}
