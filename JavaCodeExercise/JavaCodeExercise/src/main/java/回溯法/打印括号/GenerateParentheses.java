package 回溯法.打印括号;

import java.util.ArrayList;
import java.util.List;

//public class GenerateParentheses {
//
//    public List<String> generateParenthesis(int n) {
//        List<String> result = new ArrayList<>();
//        generate(result, "", 0, 0, n);
//        return result;
//    }
//
//    private void generate(List<String> result, String current, int open, int close, int max) {
//        if (current.length() == max * 2) {
//            result.add(current);
//            return;
//        }
//
//        if (open < max) {
//            generate(result, current + "(", open + 1, close, max);
//        }
//        if (close < open) {
//            generate(result, current + ")", open, close + 1, max);
//        }
//    }
//
//
//
//
//    public static void main(String[] args) {
//        GenerateParentheses generator = new GenerateParentheses();
//        int n = 10; // 代表生成括号的对数
//        List<String> result = generator.generateParenthesis(n);
//        System.out.println(result);
//    }
//}

class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result =new ArrayList<>();

        backtracing(result,new StringBuilder() ,0,0,n);

        return result;

    }

    public void backtracing(List<String>result,StringBuilder current ,int open,int close ,int max){
        if(current.length()==max*2){
            result.add(current.toString());
            return;
        }

        if(open<max){
            current.append('(');
            backtracing(result,current,open+1,close,max);
            current.deleteCharAt(current.length() - 1);
        }
        if(close<open){
            current.append(')');
            backtracing(result,current,open,close+1,max);
            current.deleteCharAt(current.length() - 1);
        }

    }

    public static void main(String[] args) {
        Solution generator = new Solution();
        int n = 3; // 代表生成括号的对数
        List<String> result = generator.generateParenthesis(n);
        System.out.println(result);
    }
}

