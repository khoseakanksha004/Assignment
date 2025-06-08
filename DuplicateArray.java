package com.linkcode.Ass1;

public class DuplicateArray {

	public static int[] removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }

        int writeIndex = 1;

        for (int readIndex = 1; readIndex < arr.length; readIndex++) {
            if (arr[readIndex] != arr[readIndex - 1]) {
                arr[writeIndex] = arr[readIndex];
                writeIndex++;
            }
        }

        int[] result = new int[writeIndex];
        System.arraycopy(arr, 0, result, 0, writeIndex);

        return result;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 5};

        System.out.println("Original Array:");
        printArray(arr);

        int[] result = removeDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        printArray(result);
    }

        
}
