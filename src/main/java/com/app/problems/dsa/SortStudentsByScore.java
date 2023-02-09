package com.app.problems.dsa;

import java.util.PriorityQueue;
import java.util.Queue;

public class SortStudentsByScore {
    public static void main(String[] args) {
        sortTheStudents();
    }

    public static int[][] sortTheStudents() {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(7);
        queue.offer(5);
        queue.offer(23);

        queue.stream().map(n -> n+1).forEach(n -> System.out.println(n));
        System.out.println(Thread.currentThread().isInterrupted());
        return null;
    }
}
