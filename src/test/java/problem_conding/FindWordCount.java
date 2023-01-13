package problem_conding;

import java.util.Scanner;

public class FindWordCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter String to get word count..");
        String str = scn.nextLine();
        System.out.println(wordCountUsingSplitMethod(str));
        System.out.println(wordCountWithoutUsingSplitMethod(str));
    }

    public static int wordCountUsingSplitMethod(String str) {
        String[] arr = str.split(" ");
        return arr.length;
    }

    public static int wordCountWithoutUsingSplitMethod(String str) {
        if(str.isBlank())
            return 0;

        int count = 1;
        for(int i=0; i<str.length()-1; i++) {
            if((str.charAt(i) == ' ') && (str.charAt(i+1) != ' '))
                count++;

        }
        return count;
    }
}
