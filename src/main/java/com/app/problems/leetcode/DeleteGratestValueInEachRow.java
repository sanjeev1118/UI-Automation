package com.app.problems.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DeleteGratestValueInEachRow {
    public static void main(String[] args) {
        int[][] grid = {{1,4,2},{3,3,1}};
        System.out.println(deleteGreatestValue(grid));
    }

    public static int deleteGreatestValue(int[][] grid) {
        int result = 0;
        for (int i=0; i<grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        for (int i=0; i<grid[0].length; i++) {
            int max = 0;
            for(int j=0; j<grid.length; j++) {
                 max = Math.max(max, grid[j][i]);
            }
            result += max;
        }
        return result;
    }
}
