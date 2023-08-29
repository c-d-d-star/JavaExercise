package 字符串;

public class String14_ {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // 检查是否超出范围
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            result = result * 10 + digit;
        }
        return result;
    }
    public static void main(String[] args) {
        String14_ reverseInteger = new  String14_();
        int x = -12345000;
        int reversed = reverseInteger.reverse(x);
        System.out.println("Reversed: " + reversed); // Output: 54321
    }
}

/*
    int digit = x % 10;: 这行代码用于取出 x 的末位数字。x % 10 的结果是 x 除以 10 的余数，即 x 的末位数字。这里使用 digit 变量来保存取出的末位数字。

        x /= 10;: 这行代码用于去掉 x 的末位数字。x /= 10 等价于 x = x / 10，它会将 x 除以 10，并将结果赋值给 x，从而去掉 x 的末位数字。

        if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {: 这行代码用于检查反转后的结果是否超出了 32 位有符号整数的正数范围。Integer.MAX_VALUE 是 32 位有符号整数的最大值，所以 Integer.MAX_VALUE / 10 是 Integer.MAX_VALUE 除以 10 的结果。如果 result 大于 Integer.MAX_VALUE / 10，说明 result 已经超出了最大范围，无论再加上一个末位数字都会溢出。另外，如果 result 等于 Integer.MAX_VALUE / 10 且 digit 大于 7（即下一位数字大于 7），也会导致结果溢出。因为在最大范围的情况下，最后一位不能超过 7。

        return 0;: 如果发现反转后的结果超出了范围，就立即返回 0，表示结果无效。

        if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {: 这行代码用于检查反转后的结果是否超出了 32 位有符号整数的负数范围。Integer.MIN_VALUE 是 32 位有符号整数的最小值，所以 Integer.MIN_VALUE / 10 是 Integer.MIN_VALUE 除以 10 的结果。如果 result 小于 Integer.MIN_VALUE / 10，说明 result 已经超出了最小范围，无论再加上一个末位数字都会溢出。另外，如果 result 等于 Integer.MIN_VALUE / 10 且 digit 小于 -8（即下一位数字小于 -8），也会导致结果溢出。因为在最小范围的情况下，最后一位不能小于 -8。

        return 0;: 如果发现反转后的结果超出了范围，就立即返回 0，表示结果无效。
*/
