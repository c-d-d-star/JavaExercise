package 数组;
//寻找最长的连续子数组和：给定一个包含 n 个正整数的数组，要求找出其中最长的连续子数组，使得子数组中所有数的和最大。
public class Array22_ {





    public static int findMaxSub(int []arr){
        int n= arr.length;
        int totalsum=0;
        int totalleftsum=0;
        int left=0;
        int maxSum = Integer.MIN_VALUE;;
        for (int i = 0; i <n ; i++) {
            totalsum+=arr[i];
        }
        for (int i = 0; i < n; i++) {
           int totalright=totalsum-totalleftsum-arr[left];
           if(totalsum>=totalright-arr[left]){
               left++;
               totalleftsum+=arr[left];
           }else{
                   maxSum = Math.max(maxSum, totalright);
           }

        }
       return maxSum;
    }


    public static int findMaxSubarraySum(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];  // 最大和初始化为第一个元素
        int currentSum = nums[0];  // 当前和初始化为第一个元素

        for (int i = 1; i < n; i++) {
            // 更新当前和
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // 更新最大和
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        int [] nums01={-2,2,3,6};
        int maxSubarraySum = findMaxSubarraySum(nums01);
        int maxSubarraySum01 = findMaxSub(nums01);
        System.out.println("最大连续子数组和：" + maxSubarraySum);
        System.out.println("最大连续子数组和：" + maxSubarraySum01);
    }
}
