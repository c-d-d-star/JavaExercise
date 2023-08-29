//package 字符串;
//
//import java.util.Stack;
//
//public class writeStringDecode01 {
//
//
//
//
//    public String stringDecode(String str){
//
//
//        Stack numStack=new Stack();
//        Stack strStaxk=new Stack();
//        int num=0; //用来转换字符串的
//
//        StringBuilder current=new StringBuilder();
//        // 首先不知道str的长度
//        for (char s:str.toCharArray()) {
//            if(Character.isDigit(s)){
//                num=num*10+(s-'0');
//
//            } else if (s=='[') {
//                numStack.push(num);
//                strStaxk.push(s);
//                num=0;
//            } else if (s==']') {
//                int repeat=numStack.pop();
//                strStaxk.pop();
//
//
//            }else{
//                current.append(s);
//            }
//        }
//        return current.toString();
//    }
//}
