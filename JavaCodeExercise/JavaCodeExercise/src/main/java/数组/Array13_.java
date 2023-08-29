package 数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//三数之和：给定一个包含 n 个整数的数组和一个目标值，要求找出所有三个数的和等于目标值的三元组。
// 找到的数值采用的是集合的形式来进行存储的
public class Array13_ {


    public static List<List<Integer>> findElement(int []nums, int target){
        List<List<Integer>> result = new ArrayList<>();
        // 首先是对于数组进行排序
        Arrays.sort(nums);

        int n = nums.length;
        /*
         遍历数组，固定第一个数
         for循环第二个位置的取值是和元素的个数有关系的
         对于数组长度为 n，我们固定第一个数后，剩下的两个数的索引范围应该是 [i+1, n-1]。因此，i 的取值范围应该是 [0, n-3]，即 i < n-2。

          这是因为我们在固定第一个数后，还需要找到剩下两个数，
          所以第二个数的索引范围是 [i+1, n-2]，
          第三个数的索引范围是 [i+2, n-1]。
          如果 i 的值大于 n-3，那么剩下的索引范围就为空，无法找到两个数，因此需要限制 i 的范围为 i < n-2。
        */

        //        固定住第一个数
        for (int i = 0; i < n - 2; i++) {
            // 跳过重复的数
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = n - 1;
            /*
             这三个指针设置的方式是怎么样的
             1.一个是从起始的位置开始出发
             2.一个是从起始位置后面的元素开始出发
             3.一个是从数组的最后的元素开始出发
             三个指针的安排是怎么样的
            */

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    // 找到符合条件的三元组
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // 跳过重复的数
                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    while (left < right && nums[right] == nums[right - 1])
                        right--;

                    // 移动指针
                    left++;
                    right--;
                } else if (sum < target) {
                    // 和小于目标值，移动左指针
                    left++;
                } else {
                    // 和大于目标值，移动右指针
                    right--;
                }
            }
        }

        return result;
    }

    }

