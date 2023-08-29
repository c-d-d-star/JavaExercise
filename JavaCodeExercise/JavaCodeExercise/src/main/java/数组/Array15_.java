package 数组;
//寻找最小的 k 个数：给定一个包含 n 个整数的数组和一个整数 k，要求找出数组中最小的 k 个数。
//寻找最小的 5 个数：给定一个包含 13 个整数的数组和一个整数 5，要求找出数组中最小的 5 个数。

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Array15_ {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1, 7, 5, 3};
        int k = 3;
        List<Integer> smallest = findMin(arr, k);
        // 打印结果
        System.out.println("最小的" + k + "个数为: " + smallest);
    }



    public static List<Integer> findMin(int []arr,int target){
        int n=arr.length;
        Arrays.sort(arr);
        List<Integer> list=new ArrayList();
        for (int i = 0; i < target; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    // 可以采用优先队列的方式来进行计算
    public static List<Integer> findKSmallest(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();

        // 使用优先队列（最小堆）来存储最小的k个数
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // 将数组中的元素加入最小堆
        for (int num : arr) {
            minHeap.offer(num);
        }

        // 取出最小的k个数
        for (int i = 0; i < k; i++) {
            result.add(minHeap.poll());
        }
        // 这个是经过的是最小的堆的运算然后是将元素重新给放出来

        return result;
    }
}
