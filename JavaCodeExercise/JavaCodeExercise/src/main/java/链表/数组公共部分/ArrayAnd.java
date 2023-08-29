package 链表.数组公共部分;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAnd {

    public static int [] arrayAnd(int[] nums1,int[] nums2){


        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int [] arr = new int[0];

        int index1=0;
        int index2=0;
        // 怎么样考虑
        ArrayList<Integer> commonElements = new ArrayList<>();




        for(;index1<nums1.length;index1++){
            if(nums1[index1]==nums2[index2]){
                commonElements.add(nums1[index1]);
            }else {
                index2++;
            }
        }

        return arr;
    }
}
