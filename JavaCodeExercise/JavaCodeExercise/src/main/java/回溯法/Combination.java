package 回溯法;


import java.util.ArrayList;
import java.util.List;


class Combination {
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> current = new ArrayList<>();

            // 开始回溯搜索
            backtrack(1, n, k, current, result);
            // 返回结果
            return result;
        }

        private void backtrack(int start, int n, int k, List<Integer> current, List<List<Integer>> result) {
            /*
                当 current 中已经有 k 个元素，将其加入结果集
            /*1: 这是一个整数参数，可能是用于指定当前回溯的起始状态或步骤的标志。具体取决于实际实现，可能需要查看完整的回溯函数代码才能确定其具体含义。

            n: 这是一个整数参数，表示可能的选择范围或问题的规模。在回溯算法中，通常表示问题的大小或搜索空间的大小。

            k: 这也是一个整数参数，可能是用于控制回溯过程的其他条件或限制。类似于第一个参数，具体含义可能需要查看完整的函数代码。

            current: 这是一个变量或数据结构，用于存储当前的状态或正在构建的解决方案。在回溯算法中，通常会对当前状态进行操作，并根据问题的要求进行更新。

            result: 这是一个变量或数据结构，用于存储最终的解决方案或满足问题条件的结果。在回溯算法中，当找到一个满足条件的解决方案时，将其存储在 result 中。
            *
            * * /
*/
            if (current.size() == k) {
                result.add(new ArrayList<>(current));
                return;
            }
            /*
            * 循环推出条件
            * 开始策略
            *（回溯就是递归）
            *
            * */
            // 从 start 开始搜索可能的组合
            // 开始循环递归
            for (int i = start; i <= n; i++) {
                current.add(i);
                // 递归搜索下一个数字的组合
                backtrack(i + 1, n, k, current, result);
                // 回溯，撤销当前选择，继续搜索下一个可能的组合
                current.remove(current.size() - 1);
            }
        }

        public static void main(String[] args) {
            Combination combinations = new Combination();
            int n = 4;
            int k = 2;
            List<List<Integer>> result = combinations.combine(n, k);
            System.out.println("Combinations: " + result);
        }
    }





