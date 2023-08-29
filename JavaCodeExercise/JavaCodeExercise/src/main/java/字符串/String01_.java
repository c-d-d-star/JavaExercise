package 字符串;

//判度字符串是回文字符串
public class String01_ {



//    去除空格等影响因素
        public static boolean isPalindrome(String str){
            // 去除字符串中的空格和标点符号
            String cleanedStr = str.replaceAll("[\\s\\p{Punct}]", "").toLowerCase();
            int left = 0;
            int right = cleanedStr.length() - 1;
            while (left < right) {
                if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
}
