package 贪心.区间覆盖问题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//区间覆盖问题：给定一组区间，找到最少的区间集合，覆盖所有的区间。Java
public class IntervalCover {

    public static int[][] intervalCover(int[][] intervals) {

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int end = Integer.MIN_VALUE;

        int n = intervals.length;

        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            int[] interval = intervals[i];
            if (interval[0] > end) {
                result.add(interval);
                end = interval[1];
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 4}, {3, 6}, {5, 7}, {8, 10}, {9, 12}};
        int[][] result = intervalCover(intervals);
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }


    }
}
