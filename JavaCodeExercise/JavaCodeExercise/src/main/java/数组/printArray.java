package 数组;

import java.util.Arrays;

public class printArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]); // 1 2 3 4 5
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]); // 1 2 3 4
            // 数组的个数缺少一个那么就会少一个数字
            // 此时的数组的元素的打印就是会少掉一个
        }
        int []arr1={1,2,3,4};
        int []arr2={2,3,4,56};

        arrayCopy(arr1,arr2);
    }


    // 数组拷贝
    public static  void arrayCopy(int []nums1,int []nums2){
        int n=nums1.length+nums2.length;
        int []arr=new int[n];
        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
