package com.linkcode.Ass1;

public class Sum2D {
	 public static void main(String[] args) {
	        int[][] array = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int sum = 0;

	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array[i].length; j++) {
	                sum += array[i][j];
	            }
	        }

	        System.out.println("Sum of 2D array elements: " + sum);
	    }

}
