package com.linkcode.Ass1;

public class ZerosArray {

	public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;
                nonZeroIndex++;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0};

        System.out.println("Original Array:");
        printArray(arr);

        moveZerosToEnd(arr);

        System.out.println("Array after moving zeros to end:");
        printArray(arr);
    }

}
