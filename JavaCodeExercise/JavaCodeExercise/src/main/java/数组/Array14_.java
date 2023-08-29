package 数组;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//寻找重复的数字：给定一个包含 n 个整数的数组，要求找出其中的重复数字，即在数组中出现次数大于等于 2 的数字。
public class Array14_ {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        LinkedList<Integer> duplicates = findDuplicates(nums);
        // 打印结果
        for (int num : duplicates) {
            System.out.println(num);
        }
    }
     public static LinkedList<Integer> findDuplicates(int []arr){
         LinkedList<Integer> list=new LinkedList<Integer>();
         int n=arr.length;
         int left=0;
         for (int i = 0; i <n ; i++) {
             // 从后面一个元素开始是可以下表进行加上1来实现的
             for (int j =i+1; j < n; j++) {
                 if(arr[i]==arr[j]&& !list.contains(arr[i])) list.add(arr[i]); // 这个怎么来去除掉重复的元素，不能是靠着集合本身来实现
                 // 这个最为重要的就是集合当中是不能包含原始的元素的
             }

         }
         return list;
     }
}
