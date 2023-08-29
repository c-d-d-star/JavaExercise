package 数组;
//填充数组：给定一个包含 n 个空字符串的数组和一个整数 k，要求将所有空字符串替换为长度为 k 的字符串。

public class Array18_ {
    public static void main(String[] args) {
        String str = "Hello world! This is a test.";
        String k = "****";
        String modifiedStr = findElement(str, k);
        System.out.println(modifiedStr);
    }


    // 此时k定义的是长度为k的字符串
    public static String findElement(String str, String k) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ') {
                result.append(k);
            }else{
                result.append(str.charAt(i));
            }


        }
        return result.toString(); // 这里面要加上toString方法

    }
}
