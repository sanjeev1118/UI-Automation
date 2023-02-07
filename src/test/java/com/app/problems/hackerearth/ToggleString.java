package com.app.problems.hackerearth;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the string");
        String name = scn.next();
        String result = "";
        for(int i=0; i<name.length(); i++) {
            char c = name.charAt(i);
            if(c>=65 && c<=90)
                result += Character.toLowerCase(c);
            else if(c>=97 && c<=122)
                result += Character.toUpperCase(c);
        }
        System.out.println(result);
    }
}
