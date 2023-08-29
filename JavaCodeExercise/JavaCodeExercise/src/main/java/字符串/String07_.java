package 字符串;
//去重
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

//字符串统计
public class String07_ {

    public static void main(String[] args) {

        String inputString = "abracadabra";
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                // 字符已经在map中，增加计数
                charCountMap.put(c, charCountMap.get(c) + 1);

                // 这个里面的charCountMap是名字
            } else {
                // 字符第一次出现，计数设为1
                charCountMap.put(c, 1);
            }

            /* HashMap里面的key是不能重复的，但是是value是可以重复的
            *
            *  */
        }

// 输出字符出现次数
        for (char c : charCountMap.keySet()) {
            int count = charCountMap.get(c);
            System.out.println("字符 " + c + " 出现了 " + count + " 次");
        }
    }



}
