package 数组;
//判断是否存在环：给定一个包含 n 个整数的数组，要求判断是否存在一个环，即是否存在两个下标 i 和 j，满足 i != j 且 nums[i] == nums[j]。


import java.util.HashSet;
import java.util.Set;

public class Array19_ {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2};
        boolean hasCycle = containsCycle(nums);

        if (hasCycle) {
            System.out.println("存在环");
        } else {
            System.out.println("不存在环");
        }
    }

    public static Boolean containsCycle(int []nums){
        Set<Integer> set=new HashSet<>(); // 这个就是set集合
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if(set.contains(nums[i])) return true;
        }
        return false;
    }

// 这个是找到重复的元素
//    public static Boolean findElement(int []nums){
//        int n=nums.length;
//        for (int i = 0; i < n; i++) {
//            for (int j =i+1; j <n ; j++) {
//                if(nums[i] == nums[j]) return true;
//            }
//        }
//        return false;
//    }
}
