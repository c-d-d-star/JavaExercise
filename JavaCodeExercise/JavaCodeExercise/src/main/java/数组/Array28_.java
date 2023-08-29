package 数组;
/*
输入: nums = [-1,0,3,5,9,12], target = 9
        输出: 4
        解释: 9 出现在 nums 中并且下标为 4
*/
public class Array28_ {
    public static void main(String[] args) {
        int nums[]={-1,0,3,5,9,12};
        int target=9;
        int result=violentSearch(nums,target);
        System.out.println(result);
    }

    public static int violentSearch(int []arr,int target){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]==target) return i;
        }
        return 0;
    }

    // 这道题目考察的就是二分法

}
