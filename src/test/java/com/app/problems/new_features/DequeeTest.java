package com.app.problems.new_features;

public class DequeeTest {
    public static void main(String[] args) {
        String s = "ab cde"; // edc ba  // ab cde
        char[] arr = s.toCharArray();
        char[] result = new char[arr.length];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == ' ')
                result[i] = ' ';
        }

        int index = 0;
        for(int i=arr.length-1; i>=0; i--) {
            if(arr[i] == ' ')
                continue;
            if(result[index] == ' ')
                index++;
            result[index++] = arr[i];
        }

        System.out.println(String.valueOf(result));
    }
}
