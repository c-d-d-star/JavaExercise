package 回溯法;

import netscape.security.UserTarget;

import java.util.ArrayList;
import java.util.List;

public class CombinationComprehend01 {





    public static List<List<Integer>> ConbinationComprehen(int n, int k){
        List<List<Integer>> result= new ArrayList<>();

        List<Integer> current=new ArrayList<>();


        // 开始回溯
        backtrack(1,n, k,current,result);

        // 返回结果值
        return result;

    }

    private static void backtrack(int start, int n,int k, List<Integer> current, List<List<Integer>> result) {
        if(current.size()==k){
            result.add(new ArrayList<>(current));
            return;
        }

        // 然后开始进行循环进行遍历操作

        for(int i=start;i<=n;i++){
            current.add(i);
            backtrack(i + 1, n, k, current, result);
            current.remove(current.size() - 1);

        }



    }
    public static void main(String[] args) {
        CombinationComprehend01 combinations = new CombinationComprehend01();
        int n = 4;
        int k = 2;
        List<List<Integer>> result = combinations. ConbinationComprehen(n, k);
        System.out.println("Combinations: " + result);
    }
}
