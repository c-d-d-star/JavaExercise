package 字符串;
//判断字符串是否为数字字符串
public class String02_ {


    // 采用是正则表达式
    public static boolean isNumericString(String str) {
        // 使用正则表达式匹配数字字符串
        return str.matches("-?\\d+(\\.\\d+)?");
    }

}
