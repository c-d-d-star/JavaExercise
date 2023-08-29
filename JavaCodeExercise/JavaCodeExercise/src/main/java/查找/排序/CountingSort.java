package 查找.排序;


import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 9, 3, 3, 1};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        countingSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void countingSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // 不需要排序
        }

        // 找出数组中的最大值和最小值，以确定统计数组的大小
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        // 统计数组，用于记录每个元素出现的次数
        int[] countArray = new int[max - min + 1];

        // 统计元素出现的次数
        for (int num : arr) {
            countArray[num - min]++;
        }

        // 根据统计数组重新构建有序数组
        int index = 0;
        // 计数数组的下表进行移动
        for (int i = 0; i < countArray.length; i++) {
            while (countArray[i] > 0) {
                arr[index] = i + min;
                index++;
                countArray[i]--;
            }
        }
    }
}

