package 数组;
//找到数组中消失的数组

import java.util.ArrayList;
import java.util.List;

public class Array29_ {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Step 1: 遍历数组，将每个数对应的索引位置标记为负数
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            nums[index] = -Math.abs(nums[index]);
        }

        // Step 2: 遍历数组，找到所有大于 0 的索引值，它们对应的数字在原数组中缺失
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
