package 贪心.分发饼干;


import java.util.Arrays;

public class FindContentChildren {

    public static int findContentChildren(int[] g, int[] s){
        Arrays.sort(g); // 代表的是胃口孩子
        Arrays.sort(s);// 代表的是饼干的数量

        int index=s.length-1;
        int result=0; // 储存的是结果值

        //将两个数组进行排序操作
        for (int i = s.length-1; i> 0; i--) {
            if(index>0&&s[index]>=g[i]){
                result++;
                index--;
            }
        }
        return result;

    }
}
