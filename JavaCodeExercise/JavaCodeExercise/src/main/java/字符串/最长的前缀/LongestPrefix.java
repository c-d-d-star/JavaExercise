package 字符串.最长的前缀;

public class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        int n = strs.length;
        int end = 0;

        for (int i = 0; i < prefix.length(); i++) {
            char currentChar = prefix.charAt(i);

            for (int j = 1; j < n; j++) {
                if (i >= strs[j].length() || currentChar != strs[j].charAt(i)) {
                    return prefix.substring(0, end);
                }
            }

            end++;
        }

        return prefix.substring(0, end);
    }


    public static void main(String[] args) {
        String[] strs = {"plower", "flow", "flight"};
        LongestPrefix solution = new LongestPrefix();
        String longestPrefix = solution.longestCommonPrefix(strs);
        System.out.println("Longest common prefix: " + longestPrefix);

    }
}

class Solution {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1; // 初始化进位为 1，表示要加一

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10; // 更新当前位的值
            carry = sum / 10;     // 更新进位
        }

        // 如果在数组遍历完后仍然有进位，需要创建新的数组来处理
        if (carry > 0) {
            int[] result = new int[n + 1];
            result[0] = carry;
            return result;
        }

        return digits;
    }

    public int[] plusOne01(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {1,2,3};
        Solution solution = new Solution();
        int[] arr = solution.plusOne01(digits);

        System.out.print("Result: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}



