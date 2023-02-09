package com.app.problems.leetcode;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctNumbersOnBoard {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(distinctIntegers(n));
    }
    public static int distinctIntegers(int n) {
        Set<Integer> board = new HashSet();
        board.add(n);

        for(int day=0; day<(1 << 9); day++) {
            Set<Integer> newNumbers = new HashSet<>();
            for(int x : board) {
                for(int i=1; i<=n; i++) {
                    if(x%i == 1)
                        newNumbers.add(i);
                }
            }
            board.addAll(newNumbers);
        }

        return board.size();
    }
}
