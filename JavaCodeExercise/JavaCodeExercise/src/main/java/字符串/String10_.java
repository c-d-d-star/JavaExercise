package 字符串;
//5. 最长回文子串
public class String10_ {


    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
            /*
            *
 在这段代码中，if (len > end - start) 是用来判断当前找到的回文子串的长度 len 是否大于之前找到的最长回文子串的长度 end - start。

如果当前找到的回文子串更长，那么我们需要更新最长回文子串的起始位置 start 和结束位置 end。

start = i - (len - 1) / 2：将起始位置 start 更新为当前中心点 i 减去回文子串长度 len 的一半（整数除法取整）。
end = i + len / 2：将结束位置 end 更新为当前中心点 i 加上回文子串长度 len 的一半。
这样，通过更新 start 和 end，我们能够得到当前找到的最长回文子串的起始位置和结束位置。

这段代码的目的是在遍历字符串时，不断更新最长回文子串的起始和结束位置，以便记录下最长的回文子串的范围。在遍历结束后，我们可以根据 start 和 end 的值来提取最长回文子串并返回。
           * */
        }

        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {
        String input = "babad";
        String result = longestPalindrome(input);
        System.out.println("Longest palindrome substring: " + result);
    }


}
