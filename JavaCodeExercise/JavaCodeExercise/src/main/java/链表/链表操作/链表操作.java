package 链表.链表操作;

public class 链表操作 {

}

class Solution {
    public static int subarraySum(int[] nums, int k) {
        int l=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                if(nums[i]+nums[j]==k){
                    l++;
                    continue;
                }

            }
            continue;
        }
        return l;

    }


    public static void main(String[] args) {
        int[] nums={1,1,1};
        int k=2;

        int result = subarraySum(nums,k);
        System.out.println(result);
    }
}
