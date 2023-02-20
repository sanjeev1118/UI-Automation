package com.app.problems.dsa;

public class MaxSumOfConsecutiveElements {
    public static void main(String[] args) {
//        int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int[] arr = {100,200,300,400};
        int k = 2;
        //Output = 700
        System.out.println(maxSum(arr,k));
    }

    private static int maxSum(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<=arr.length-k; i++) {
            int sum = arr[i];
            for (int j= i+1; j<i+k; j++) {
                sum += arr[j];
            }
            if(maxSum < sum)
                maxSum = sum;
        }
        return maxSum;
    }

}
