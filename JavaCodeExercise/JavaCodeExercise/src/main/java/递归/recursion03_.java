package 递归;
//反转字符串的递归的写法
public class recursion03_ {
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("原始字符串：" + input);
        System.out.println("反转后的字符串：" + reversed);
    }
}
