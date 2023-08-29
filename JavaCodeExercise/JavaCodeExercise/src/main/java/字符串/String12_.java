package 字符串;

public class String12_ {


        public int reverse(int x) {

            if(x>0){
                String numberString = String.valueOf(x);   // 这么把数字转换成字符串
                for (int i = numberString.length()-1; i >0 ; i--) {
                    char digitChar = numberString.charAt(i);  // 获取当前位置上的字符
                    int digit = Character.getNumericValue(digitChar);  // 将字符转换为数字
                    return digit;
                }
            }else{
                String numberString = String.valueOf(x);
                for (int i = numberString.length()-1; i >0 ; i--) {
                    char digitChar = numberString.charAt(i);  // 获取当前位置上的字符
                    int digit = Character.getNumericValue(digitChar);  // 将字符转换为数字
                    return -digit;
                }

            }
            return 0;
        }
    }

