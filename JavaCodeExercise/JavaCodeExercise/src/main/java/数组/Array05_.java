package 数组;
//寻找峰值：给定一个包含 n 个整数的数组，要求找出其中的峰值，即大于其左右相邻数的正整数。

public class Array05_ {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int peakIndex = findPeakElement(nums);
        int peakValue = nums[peakIndex];
        System.out.println("峰值为: " + peakValue);
    }


        public static int findPeakElement( int[] arr){
            int left = 0;
            int right = arr.length - 1;
            int mid = left + (right - left) / 2;

            while (left < right) {
                if (arr[mid] < arr[mid + 1]) left = mid + 1;
                else {
                    right = mid;
                }
            }
            return left;

    }


}
