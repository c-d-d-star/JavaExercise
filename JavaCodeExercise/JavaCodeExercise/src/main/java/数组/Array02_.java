package 数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
public class Array02_ {
    public static void main(String[] args) {
        int [][] intervals={{1,2},{2,3},{4,5,6}};
//        System.out.println(intervals.length);    3
    }




    public static int[][] merge(int[][] intervals){
        // 首选判度是否是intervals是单个的
        if(intervals.length<1) return intervals; //不需要进行排列 里面的数组只有一个
        // 按照区间的起始位置进行排序
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // 此时里面的数组就是排好序的
        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];


        //sort的三种用法
        //1.直接是传入的是数组
        //2.传入数组，然后传入的是下表位置有哪些 sort(array,int fromIndex, int toIndex)这种形式是对数组部分排序，也就是对数组a的下标从fromIndex到toIndex-1的元素排序，注意：下标为toIndex的元素不参与排序哦！
        //3.自定义的比较规则
        return intervals;
    }
}
