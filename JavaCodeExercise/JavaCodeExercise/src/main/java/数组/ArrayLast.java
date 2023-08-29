package 数组;

public class ArrayLast {

    public static int countLastArray(int[] nums){
        int maxsum=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
           int current=0;
           for(int j=i;j<nums.length;j++){
                current+=nums[j];
               if(current>maxsum){
                 maxsum=current;
               }
           }
       }
        return maxsum;
    }

    public static int findMaxSubArraySum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // 在当前元素和当前元素加上前面子数组和中选择较大的值作为新的当前和
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // 更新最大子数组和
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = findMaxSubArraySum(nums);
        int sum=countLastArray(nums);
        System.out.println("最大子数组的和是：" + maxSum);
        System.out.println("最大子数组的和是：" + sum);
    }

}
