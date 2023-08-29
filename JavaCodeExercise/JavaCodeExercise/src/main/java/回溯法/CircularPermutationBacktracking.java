package 回溯法;

import java.util.ArrayList;
import java.util.List;
//圆排列问题
public class CircularPermutationBacktracking {

    public List<List<Integer>> circularPermute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPermutation = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, currentPermutation, used, result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> currentPermutation, boolean[] used, List<List<Integer>> result) {
        if (currentPermutation.size() == nums.length) {
            // 找到了一个圆排列，收集结果集
            result.add(new ArrayList<>(currentPermutation));
            return; // 推出函数
        }
        // 元素集合
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                // 选择当前元素加入圆排列
                currentPermutation.add(nums[i]);
                used[i] = true;
                backtrack(nums, currentPermutation, used, result);
                // 回溯，撤销当前选择
                currentPermutation.remove(currentPermutation.size() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        CircularPermutationBacktracking circularPermutation = new CircularPermutationBacktracking();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = circularPermutation.circularPermute(nums);
        System.out.println("Circular Permutations: " + result);
    }
}
