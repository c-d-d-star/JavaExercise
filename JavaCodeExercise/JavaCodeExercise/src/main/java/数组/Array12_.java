package 数组;
//寻找旋转排序数组中的最小值：给定一个旋转排序数组，要求找出其中的最小值。
// 数组当中寻找最小的值，采用的是二分法
//旋转数组的定义是什么：这个就是数组和旋转没有关系
public class Array12_ {




    public static int  FindMinimumInRotatedSortedArray(int []nums){
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // 最小值在右半部分
                left = mid + 1;
            } else {
                // 最小值在左半部分或者当前位置
                right = mid;
            }
        }
        // 循环结束时，left和right指向最小值的位置
        return nums[left];
    }


}

// 此时的回文数组是怎么样的
