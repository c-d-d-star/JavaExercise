package 字符串;

import java.util.HashSet;
import java.util.Set;

//. 无重复字符的最长子串
// 这些得采用一些数据结构来计算
public class String09_ {



     public static int withoutRepeatWord(String s) {


         int left = 0;
         int right = 0;
         int n = s.length();
         int maxLength=0;
         Set set = new HashSet();

         while (right < n) {

             if (!set.contains(s.charAt(right))) {
                 set.add(s.charAt(right));
                 maxLength = Math.max(maxLength, right - left + 1); // 这李就是最长的体现
                 right++;
             }else {
                 set.remove(s.charAt(left));
                 left++;
             }
         }
         return maxLength;
     }

}
