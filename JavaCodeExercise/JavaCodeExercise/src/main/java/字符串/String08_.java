package 字符串;
//最大的公共前缀，是有多个数组进行最长公共子前缀的匹配
public class String08_ {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0]; // 将第一个字符串作为初始前缀、

        for(int i=1;i< strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }

//        for (int i = 1; i < strs.length; i++) {
//            while (!strs[i].startsWith(prefix)) {
//                // 若当前字符串不以前缀开头，则缩小前缀长度，继续匹配
//                prefix = prefix.substring(0, prefix.length() - 1);
//            }
//            // 循环遍历，然后在循环的进行列表里面的元素
//        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String commonPrefix = longestCommonPrefix(strs);
        System.out.println("最长公共前缀：" + commonPrefix);
    }
}
