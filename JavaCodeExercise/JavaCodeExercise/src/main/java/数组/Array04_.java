package 数组;

import java.util.Arrays;

//删除元素：给定一个包含 n 个整数的数组和一个目标值，要求找出数组中和为目标值的两个整数，并删除它们。
public class Array04_ {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = removeTwoSumElements(nums, target);
        System.out.println("Modified Array: " + Arrays.toString(result));//int a=removeTwoSumElements1(nums, target);
    }

    public static int[] removeTwoSumElements(int[] array, int target) {
        // 两个指针
        int left = 0;
        int right = array.length - 1;
        int sum = 0;
        // 这个就是数组里面的双指针
        int index=0;

        while (left < right) {
            sum = array[left] + array[right];
            if (sum == target) {
                int[] result = new int[array.length - 2];// 这个是减去两个数组的
                for (int i = 0; i < array.length; i++) {
                    if (i != left && i != right) {
                        result[index++] = array[i];
                    }
                }
                return result;

            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
            // 这个是怎么弄的，双指针是怎么样进行移动的
        }
        return array;// 没有找到元素两个之后，就返回两个数组
    }


//    public static int removeTwoSumElements1(int[] array, int target) {
//        int left = 0;
//        int right = 1;
//        int sum = 0;
//        for ( left  = 0; left  < array.length-1; left ++) {
//            for (right = 1; right <array.length-1 ; right++) {
//                if(array[left]+array[right]==target) return left;
//            }
//
//        }
//        return -1;

//    }
}
// 采用的是双指针的形式
