package 数组;
//寻找单调递增的数对：给定一个包含 n 个整数的数组，要求找出所有满足 nums[i] < nums[i+1] 的数对 (i, i+1)。

import java.util.ArrayList;
import java.util.List;

public class Array21_ {
//    public static  List findElement(int []nums){
//        List list=new ArrayList();
//        int n=nums.length;
//        for (int i = 0; i < n; i++) {
//            if(nums[i]<nums[i+1])
//            {
//                list.add(i);
//                list.add(i+1);
//            }
//        }
//        return list;
//    }
public static List<Pair> findIncreasingPairs(int[] nums) {
    List<Pair> pairs = new ArrayList<>();
    int n = nums.length;
    for (int i = 0; i < n - 1; i++) {
        if (nums[i] < nums[i + 1]) {
            Pair pair = new Pair(i, i + 1); // 这个就是为了内联的样式是怎么样的
            pairs.add(pair);
        }
    }
    return pairs;
}

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 4, 5};
        List<Pair> result = findIncreasingPairs(nums);
        System.out.println("满足条件的数对：");
        for (Pair pair : result) {
            System.out.println(pair);
        }
    }

    static class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }
}
