package com.ui.program;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int length = scn.nextInt();

//        Declare array and initialize array
        int[] arr = new int[length];

        for(int i=0; i<arr.length; i++) {
            System.out.println("Enter the number");
            arr[i] = scn.nextInt();
        }

        System.out.println("Array before reverse: "+ Arrays.toString(arr));
        System.out.println("Array after reverse: ");
//        Printing array in reverse order
        for (int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + "\t");
        }

    }
}
