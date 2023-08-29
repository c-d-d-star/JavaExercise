package 查找.排序;

public class SelectSort {

    //选则排序
    public void selectSort(int []nums){
        int maxIndex=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j =1; j <nums.length ; j++) {
                if(nums[i]>nums[maxIndex]){
                    maxIndex=j;
            }
                swap(nums,j,maxIndex);
            }
        }
    }

    public static void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
