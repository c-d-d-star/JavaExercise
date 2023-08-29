package 回溯法;

import java.util.ArrayList;
import java.util.List;

public class SubsetSumBacktracking {

    public boolean isSubsetSum(int[] nums, int target) {
        List<Integer> currentSubset = new ArrayList<>();
        return backtrack(nums, target, 0, currentSubset);
    }

    // 传入的参数进行解析
    private boolean backtrack(int[] nums, int remainingTarget, int startIdx, List<Integer> currentSubset) {
        if (remainingTarget == 0) {
            // 找到了满足条件的子集
            return true;
        }

        for (int i = startIdx; i < nums.length; i++) {
            if (remainingTarget - nums[i] >= 0) {
                // 选择当前元素加入子集
                currentSubset.add(nums[i]);
                if (backtrack(nums, remainingTarget - nums[i], i + 1, currentSubset)) {
                    return true;
                }
                // 回溯，撤销当前选择
                currentSubset.remove(currentSubset.size() - 1);
            }
        }

        return false; // 无解
    }

    public static void main(String[] args) {
        SubsetSumBacktracking subsetSum = new SubsetSumBacktracking();
        int[] nums = {2, 3, 7, 8, 10};
        int target = 11;
        boolean result = subsetSum.isSubsetSum(nums, target);
        System.out.println("Can find a subset with sum " + target + "? " + result);
    }
}



