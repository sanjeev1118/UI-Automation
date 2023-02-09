package com.app.problems.new_features;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class LambdaFunction {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(90,100,30,20,10,5,500);
        workingWithStreamAPI(list);
    }

    public static void workingWithStreamAPI(List<Integer> list) {
        Stream<Integer> stream = list.stream();
        stream
                .sorted()
                .filter(n -> n%2 == 1)
                .map(n -> n+1)
                .forEach(n -> System.out.println(n+1));
    }

    public static void workingWithCursor(List<Integer> list) {
        //Print list objects using for loop
        System.out.println("Using For loop:-");
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //Print list elements using for each loop
        System.out.println("Using For Each loop:-");
        for(int no : list) {
            System.out.print(no + " ");
        }
        System.out.println();

        //Print list elements using list iterator
        System.out.println("Using ListIterator interface:-");
        ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        //Print list elements using iterator
        System.out.println("Using Iterator interface:-");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        //Print list elements using for each method
        System.out.println("Using for each method:- ");
        list.forEach(l -> System.out.print(l + " "));

    }
}
