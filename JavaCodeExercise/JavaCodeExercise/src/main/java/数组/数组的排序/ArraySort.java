package 数组.数组的排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySort {

    public static int [] sortedSquares(int[] nums) {

        int n=nums.length;
        int arr[] =new int [n];
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr);

        return arr;
    }

    public static void main(String[] args) {
        int [] nums={-1,2,3,-4,1};

        int [] arr =sortedSquares(nums);


        for(int i:arr){
            System.out.println(i);
        }
    }
}
