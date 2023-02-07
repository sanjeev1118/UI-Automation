package com.app.problems.hackerearth;

import java.util.Scanner;

public class PalindromicString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        boolean flag = true;

        for(int i=0,j=name.length()-1; i<j; i++,j--) {
            if(name.charAt(i) != name.charAt(j)) {
                flag = false;
                break;
            }
        }
         if(flag)
             System.out.println("YES");
         else
             System.out.println("NO");
    }
}
