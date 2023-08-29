package 字符串.压栈与解压站;

import java.util.Deque;
import java.util.LinkedList;

public class Decode_Code {



    // 这个就是不能一股脑的进行压栈的操作1
/*
    public static String decodeString01(String str){

        int n=str.length();

        Deque<String> stack =new LinkedList<>();

        char arr[]=str.toCharArray();

        for(int i=0;i<n;i++){
            stack.add(String.valueOf(arr[i]));
        }

        StringBuilder current = new StringBuilder();

        while(!stack.isEmpty()){

            String st=stack.pop();

            if(st.equals("[")){
                StringBuilder decoded = new StringBuilder();
                while (!stack.isEmpty() && !stack.peek().equals("]")) {
                    decoded.insert(0, stack.pop());
                }
                stack.pop();
                if (!stack.isEmpty() && stack.peek().equals("[")) {
                    stack.pop(); // Remove the "[" character
                    int repeat = Integer.parseInt(stack.pop()); // Get the repeat count
                    // Rest of your code...
                    String decodedString = decoded.toString();
                    for (int j = 1; j < repeat; j++) {

                        decoded.append(decodedString);
                    }
                    stack.push(decodedString);
                }



            }else {
                current.insert(0, st);
            }

        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }
    public static String decodeString01(String str) {
        int n = str.length();
        Deque<String> stack = new LinkedList<>();
        char[] arr = str.toCharArray();

        for (int i = 0; i < n; i++) {
            stack.push(String.valueOf(arr[i]));
        }

        StringBuilder current = new StringBuilder();

        while (!stack.isEmpty()) {
            String st = stack.pop();
            if (st.equals("[")) {
                StringBuilder decoded = new StringBuilder();
                while (!stack.isEmpty() && !stack.peek().equals("]")) {
                    decoded.insert(0, stack.pop());
                }
                stack.pop(); // Remove the "[" character
                int repeat = Integer.parseInt(stack.pop()); // Get the repeat count
                String decodedString = decoded.toString().repeat(repeat);
                stack.push(decodedString);
            } else {
                current.insert(0, st);
            }
        }

        return current.toString();
    }
    public static void main(String[] args) {
        String encodedStr = "3[a]2[bc]";
        String decodedStr = decodeString01(encodedStr);
        System.out.println("Encoded string: " + encodedStr);
        System.out.println("Decoded string: " + decodedStr);
    }
*/


    //    public static String decodeString(String str) {
//        int n = str.length();
//        Deque<String> stack = new LinkedList<>();
//        char[] arr = str.toCharArray();
//
//        for (int i = 0; i < n; i++) {
//            char c = arr[i];
//            if (Character.isDigit(c)) {
//                int numStart = i;
//                while (i < n && Character.isDigit(arr[i])) {
//                    i++;
//                }
//                int repeat = Integer.parseInt(str.substring(numStart, i));
//                stack.push(String.valueOf(repeat));
//                i--; // Move i back to the last digit of the number
//            } else if (c == ']') {
//                StringBuilder decoded = new StringBuilder();
//                while (!stack.isEmpty() && !stack.peek().equals("[")) {
//                    decoded.insert(0, stack.pop());
//                }
//                stack.pop(); // Remove the "[" character
//                int repeat = Integer.parseInt(stack.pop()); // Get the repeat count
//                String decodedString = decoded.toString().repeat(repeat);
//                stack.push(decodedString);
//            } else {
//                stack.push(String.valueOf(c));
//            }
//        }
//
//        StringBuilder result = new StringBuilder();
//        while (!stack.isEmpty()) {
//            result.insert(0, stack.pop());
//        }
//
//        return result.toString();
//    }
public static String decodeString(String str) {
    int n = str.length();
    Deque<String> stack = new LinkedList<>();
    char[] arr = str.toCharArray();

    for (int i = 0; i < n; i++) {
        char c = arr[i];
        if (Character.isDigit(c)) {
            int numStart = i;

            while (i < n && Character.isDigit(arr[i])) {
                i++;
                // 如果说数字并不是一位数字的话，就需要进行两位数以上的操作了
            }
            int repeat = Integer.parseInt(str.substring(numStart, i));
            // 这个就是数字的截取的操作

            stack.push(String.valueOf(repeat));
            i--; // Move i back to the last digit of the number

        } else if (c == ']') {
            StringBuilder decoded = new StringBuilder();
            while (!stack.isEmpty() && !stack.peek().equals("[")) {
                decoded.insert(0, stack.pop());
            }

            stack.pop(); // Remove the "[" character

            int repeat = Integer.parseInt(stack.pop()); // Get the repeat count

            String decodedString = decoded.toString();
            for (int j = 1; j < repeat; j++) {
                decoded.append(decodedString);
            }
            stack.push(decoded.toString());
        } else {
            stack.push(String.valueOf(c));
            /* stack.push(String.valueOf(c));
            这行代码的意思是将一个字符（c）转换为字符串，
            然后将这个字符串压入栈中。 */
        }
    }

    StringBuilder result = new StringBuilder();
    while (!stack.isEmpty()) {
        result.insert(0, stack.pop());
    }

    return result.toString();
}

    public static void main(String[] args) {
        String encodedStr = "10[3[a]2[bc]";
        String decodedStr = decodeString(encodedStr);
        System.out.println("Encoded string: " + encodedStr);
        System.out.println("Decoded string: " + decodedStr);
    }

    public static String decode(String  str){

        int n=str.length();

        Deque<String> stack=new LinkedList<>();

        // 将字符串转换成字符的数组
        char [] arr=str.toCharArray();

        for(int i=0;i<n;i++){
            char c=arr[i];
            int startNums=0;
            if(Character.isDigit(arr[i])){
                while(Character.isDigit(arr[i])&&i<n){
                    i++;
                }
                int repeat=Integer.parseInt(str.substring(startNums,i));
                stack.push(String.valueOf(repeat));
                i--;
            } else if (c==']') {
               StringBuilder st= new StringBuilder();
               while (!stack.isEmpty()&&stack.peek().equals('[')){
                   st.insert(0,stack.pop());

               }
                stack.pop();

               int repeat= Integer.parseInt(stack.pop());
                String strr=st.toString();
                for (int j = 0; j <repeat ; j++) {
                    st.append(strr);
                }

                stack.push(strr);
            }else{
                stack.push(String.valueOf(c));
            }
        }


        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }
        return sb.toString();
    }
}
