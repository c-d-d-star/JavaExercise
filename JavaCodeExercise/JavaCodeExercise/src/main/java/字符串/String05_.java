package 字符串;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//字符串匹配：在一个字符串中查找指定的子串是否存在。
public class String05_ {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = "World";
        int index = str.indexOf(substr);
        boolean contains = index != -1;
        System.out.println(contains);
/*
        方式二：
        String str = "Hello, World!";
        String substr = "World";
        int index = str.indexOf(substr);
        boolean contains = index != -1;
        System.out.println(contains);
*/


/*
        方式三：
        String str = "Hello, World!";
        String regex = "W.*ld";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        boolean matches = matcher.find();
        System.out.println(matches);  // 输出: true
*/
    }
}
