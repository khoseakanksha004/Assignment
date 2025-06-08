package com.linkcode.Ass1;

import java.util.Arrays;

public class MaxMin1DArray {
	public static void main(String[] args) {
        int[] array = {4, 2, 9, 6, 5, 1};
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

}
