package 数组;


    class Solution {

            public static String longestCommonPrefix(String[] strs) {

                String preFix=strs[0]; // 假设最长公共子前缀就是第一个元素

                for(int i=0;i<strs.length;i++){
                    int j=0;
                    while(j<preFix.length()&&j<strs[i].length()&&strs[i].charAt(j)==preFix.charAt(j)){
                        j++;
                    }
                    preFix= preFix.substring(0,j);
                }
                return preFix;

            }

        public static void main(String[] args) {
            String[]cdd={"cdd","cddddd","cddfgfdhdkdk"};
            String result=longestCommonPrefix(cdd);
            System.out.println();
        }
    }

