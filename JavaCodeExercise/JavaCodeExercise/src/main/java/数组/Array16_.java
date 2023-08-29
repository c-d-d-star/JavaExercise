package 数组;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//寻找最大的 k 个数：给定一个包含 n 个整数的数组和一个整数 k，要求找出数组中最大的 k 个数。
public class Array16_ {


    // 这个可以采用的是大根堆来计算啊

    public static void main(String[] args) {


    }

    public static List<Integer> findMax(int []arr,int target){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a); // 手动实现大根堆的方式
        List list=new ArrayList();
        for(int num:arr){
            maxHeap.offer(num);
        }
        for (int i = 0; i < target; i++) {
            list.add(maxHeap.poll());
        }
        return list;
    }
}
