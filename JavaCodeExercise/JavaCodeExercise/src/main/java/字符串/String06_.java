package 字符串;

import java.util.HashSet;
import java.util.Set;
//5.字符串去重：去除字符串中重复的字符，保留每个字符的第一个出现位置。
public class String06_ {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String result = removeDuplicates(str);
        System.out.println(result);  // 输出: Helo, Wrd!
    }

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();

        Set<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }

        return result.toString();
    }
}
