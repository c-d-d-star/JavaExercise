package 贪心.区间覆盖问题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//活动选择问题：给定n个活动，每个活动有一个开始时间和结束时间，选择尽可能多的活动，使得所选活动的开始时间和结束时间不重叠。
public class ActivityChoice {




    public static int[][] activityChoice(int [][] activity){


        int n= activity.length;

        Arrays.sort(activity,Comparator.comparingInt(a->a[1]));
        List<int[]> result=new ArrayList<>();

        int end=0;

        for (int i = 0; i <n ; i++) {
            int [] activities=activity[i];
            int minTime=activities[0];

            if(minTime>end){
                result.add(activities);
                end=activities[1];
            }

        }
        return result.toArray(new int[result.size()][]);






//        return null;
    }
}
