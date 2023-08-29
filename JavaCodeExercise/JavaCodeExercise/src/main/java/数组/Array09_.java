package 数组;
//给定一个包含 n 个整数的数组，要求将所有奇数放在前面，所有偶数放在后面，并保持奇数和偶数之间的相对顺序不变。

public class Array09_ {
    public static void main(String[] args) {
        int []arr={2,1,4,6};
        swapElement(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }



    public static void swapElement(int []arr){

        int left=0;
        int n=arr.length;
        // 判度每一个数字是否是奇数
        for (int i = 0; i < n; i++) {
            if(arr[i] %2 != 0) {

                    int temp=arr[left];
                    arr[left]=arr[i];
                    arr[i]=temp;
                    left++;
                }
            }

        }

//public static void moveOddEven(int[] nums) {
//    int left = 0;   // 左指针，指向当前奇数应该放置的位置
//
//    for (int right = 0; right < nums.length; right++) {
//        if (nums[right] % 2 != 0) {
//            if (left != right) {
//                // 将奇数放置到左指针的位置，并将左指针向后移动一位
//               swap(nums[left],nums[right]);
//            }
//            left++;
//        }
//    }
//}
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    // 数组当中的元素之间的交换是怎么样的
}
