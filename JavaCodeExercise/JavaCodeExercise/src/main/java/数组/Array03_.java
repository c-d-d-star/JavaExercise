package 数组;
//给定一个包含 n 个正整数的数组，要求找出其中的最长连续子数组，使得子数组中所有数的和大于等于给定的目标和。
// 数组当中的和或者是找到某一个元素，可以采用的是双指针的算法

public class Array03_ {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 9;
        int maxLength = findLongestSubarray(nums, target);
        System.out.println("Max Length of Subarray: " + maxLength);
    }

    public static int findLongestSubarray(int [] arry,int target){
        int left=0; // 这个是左指针
        int maxLength = 0; // 这个是返回的是最深的数组的长度是多少
        int right=0; // 这个是右指针
        int sum=0; // 记录的是求和的值
        for (right = 0; right < arry.length-1; right++) {
            sum+=arry[right];
            while(sum>target){
                maxLength = Math.max(maxLength, right - left + 1); // 现在开始求最小的子数组
                sum -= arry[left];
                left++;
            }
        }
        return maxLength;
    }

}
/*如果sum大于等于target，说明当前子数组的和大于等于目标和。 我们更新最长连续子数组的长度maxLength，并向右移动左指针left，将左边界元素从子数组中剔除，继续尝试寻找更短的子数组。*/
