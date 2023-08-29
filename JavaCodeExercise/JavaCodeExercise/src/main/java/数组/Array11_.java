package 数组;
////子数组求和：给定一个包含 n 个整数的数组和一个整数目标值，要求找出所有长度为 k 的子数组，使得子数组中所有数的和等于目标值。
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Array11_ {
//    public static void main(String[] args) {
//
//        int[] nums = {1, 2, 3, 4, 5};
//        int k = 3;
//
//        Array11_  subarraySum = new Array11_ ();
//        List<List<Integer>> result = subarraySum.findSubarrays(nums, k);
//
//        System.out.println("Subarrays with sum " + k + ":");
//        for (List<Integer> subarray : result) {
//            System.out.println(subarray);
//        }
//
//    }
//
//    public List<List<Integer>> findSubarrays(int[] nums, int k) {
//        List<List<Integer>> result = new ArrayList<>();
//        int n = nums.length;
//
//        for (int i = 0; i <= n - k; i++) {
//            int sum = 0;
//            for (int j = i; j < i + k; j++) {
//                sum += nums[j];
//            }
//
//            if (sum == k) {
//                List<Integer> subarray = new ArrayList<>();
//                for (int j = i; j < i + k; j++) {
//                    subarray.add(nums[j]);
//                }
//                result.add(subarray);
//            }
//        }
//
//        return result;
//    }
//}
//
//
import java.util.ArrayList;
import java.util.List;

public class Array11_ {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1};
        int k = 3;

        Array11_ subarraySum = new Array11_();
        List<List<Integer>> result = subarraySum.findSubarrays(nums, k);

        System.out.println("Subarrays with sum " + k + ":");
        for (List<Integer> subarray : result) {
            System.out.println(subarray);
        }

    }

    public List<List<Integer>> findSubarrays(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k && right - left + 1 == k) {
                List<Integer> subarray = new ArrayList<>();
                for (int i = left; i <= right; i++) {
                    subarray.add(nums[i]);
                }
                result.add(subarray);
                sum -= nums[left];
                left++;
            }
        }

        return result;
    }
}

