package 字符串;
import java.util.Stack;
public class StringDecode_ {
        public String decodeString(String s) {
            Stack<Integer> numStack = new Stack<>();
            Stack<String> strStack = new Stack<>();


            //采用的是数字栈和字符栈
            StringBuilder currentString = new StringBuilder();

            int num = 0;

            for (char c : s.toCharArray()) {
                /* Character.isDigit(c)
                * 判断是否是十进制的数字
                *
                * */
                if (Character.isDigit(c)) {
                            num = num * 10 + (c - '0');
                    /*
                    char c1 = '5';
                    char c2 = 'A';

                    boolean isDigit1 = Character.isDigit(c1); // true，因为字符 '5' 是一个数字
                    boolean isDigit2 = Character.isDigit(c2); // false，因为字符 'A' 不是一个数字
                    char c = '5';
                    int num = 0;
                    num = num * 10 + (c - '0');
                    等价于 num = 0 * 10 + (53 - 48) = 0 + 5 = 5
                    System.out.println("num: " + num);
                    输出：num: 5
                                 * */
                } else if (c == '[') {
                            numStack.push(num);
                            strStack.push(currentString.toString());
                            /*
                            * toString() 方法用于将 StringBuilder 对象转换成一个字符串，然后将这个字符串压入栈 strStack 中。
                            *                     * */
                            num = 0;//这个是为了避免累计计算
                            currentString = new StringBuilder();
                } else if (c == ']') {
                            int repeatTimes = numStack.pop();
                            StringBuilder decodedString = new StringBuilder(strStack.pop());

                            for (int i = 0; i < repeatTimes; i++) {
                                decodedString.append(currentString);
                            }

                            currentString = decodedString;
                } else {
                            currentString.append(c);
                }
            }

            return currentString.toString();
        }

        public static void main(String[] args) {
            StringDecode_ decoder = new StringDecode_();
            String encodedString = "9[a2[c]]";
            String decodedString = decoder.decodeString(encodedString);
            System.out.println("Decoded String: " + decodedString);
        }
    }


