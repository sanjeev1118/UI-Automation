package com.app.problems.basic;

public class ReverseString2 {
    private static String str = "This is a cow"; // op - woc a si sihT

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split(" ");

        for(int i=arr.length-1; i>=0; i--) {
            String word = arr[i];
            for(int j=word.length()-1; j>=0; j--) {
                sb.append(word.charAt(j));
            }
            sb.append(" ");
        }
        System.out.println("Before: "+str);
        System.out.println("After: "+sb.toString());
    }
}
