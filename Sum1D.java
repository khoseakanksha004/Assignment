package com.linkcode.Ass1;

public class Sum1D {
	public static int sum1D(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum of 1D array: " + sum1D(arr));
    }

}
