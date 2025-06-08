package com.linkcode.Ass1;

public class LargestSmallestArray {

	 public static void findSecondLargestSmallest(int[] arr) {
	        if (arr.length < 2) {
	            System.out.println("Array should have at least 2 elements.");
	            return;
	        }

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;
	        int smallest = Integer.MAX_VALUE;
	        int secondSmallest = Integer.MAX_VALUE;

	        for (int num : arr) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }

	            if (num < smallest) {
	                secondSmallest = smallest;
	                smallest = num;
	            } else if (num < secondSmallest && num != smallest) {
	                secondSmallest = num;
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("No second largest element found.");
	        } else {
	            System.out.println("Second largest element: " + secondLargest);
	        }

	        if (secondSmallest == Integer.MAX_VALUE) {
	            System.out.println("No second smallest element found.");
	        } else {
	            System.out.println("Second smallest element: " + secondSmallest);
	        }
	    }


	 public static void main(String[] args) {
	        int[] arr = {10, 20, 4, 45, 99};
	        findSecondLargestSmallest(arr);
	    }

}
