package org.example;

public class FastSlow {
    public static void main(String[] args) {
        int []arr={1,2,2,3,3,4,4,5};
        int i=remove(arr);
        System.out.println(i);
    }
    public  static int remove(int [] arr){
        int fast=1; // 块指针
        int slow=0; // 慢指针
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[slow]==arr[fast]){
                fast++;
            }else{
                slow++;
                arr[slow]=arr[fast];
                fast++;
            }
        }
        return slow+1;
        // 对于数组的遍历操作来说是需要防止数组下表越界的操作的
    }
}
