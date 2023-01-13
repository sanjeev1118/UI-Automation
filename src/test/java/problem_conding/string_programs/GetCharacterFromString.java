package problem_conding.string_programs;

import java.util.Scanner;

public class GetCharacterFromString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scn.next();
        System.out.println("Enter the index");
        int i = scn.nextInt();
        System.out.println("Character at index "+ i + " is "+ getACharFromString(str,i));
        System.out.println("Character at index "+ i + " is "+ getCharFromString(str,i));
    }

    protected static char getCharFromString(String str, int index) {
        return str.charAt(index);
    }

    public static Character getACharFromString(String str,int index) {
        return str.toCharArray()[index];
    }

}
