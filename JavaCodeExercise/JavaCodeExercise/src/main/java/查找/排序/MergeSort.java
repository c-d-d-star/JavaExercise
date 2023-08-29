package 查找.排序;

import java.util.Arrays;

public class MergeSort {
}

class MergeSort02 {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array: " + Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Base case: the array is already sorted or empty
        }

        int n = arr.length;
        int[] temp = new int[n]; // Temporary array to hold merged sub-arrays

        mergeSortHelper(arr, 0, n - 1, temp);
    }

    private static void mergeSortHelper(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            // Divide the array into two halves and recursively sort them
            mergeSortHelper(arr, left, mid, temp);
            System.out.println("开始递归了左边---");
            mergeSortHelper(arr, mid + 1, right, temp);
            System.out.println("开始递归了右边！！！");
            // Merge the sorted halves
            merge(arr, left, mid, right, temp);
            System.out.println("完成过一次递归@@@");

            // Print the sorted sub-array
            System.out.println("Sorted sub-array from index " + left + " to " + right + ": " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
        }
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        // Copy the sub-arrays to the temporary array
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("开始进行排序了");

        int i = left; // Pointer for the left sub-array
        int j = mid + 1; // Pointer for the right sub-array
        int k = left; // Pointer for the merged array

        // Merge the two sub-arrays in sorted order
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left sub-array
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right sub-array
        while (j <= right) {
            arr[k] = temp[j];
            j++;
            k++;
        }
    }
}
