package 数组;
//移动元素：给定一个包含 n 个整数的数组，要求将所有负数移到所有非负数的前面。
public class Array07_ {


    //    public static void findElement(int []arr){
//        int i=0;
//        int j=1;
//        for ( i = 0; i < arr.length; i++) {
//           while(i<j){
//               if(arr[j]<0) {
//                   swap(i,j);
//                   j++;
//               }else {
//                   i++;
//               }
//           }
//        }
//
//
//        }
//    private static void swap( int i, int j) {
//        int temp = i;
//        i = j;
//        j = temp;
//    }
//    }
    public void moveNegatives(int[] nums) {
        int left = 0;   // 左指针，指向当前负数应该放置的位置

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] < 0) {
                if (left != right) {
                    // 将负数放置到左指针的位置，并将左指针向后移动一位
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                }
                left++;
            }
        }
    }
}

//双指针算法一般都是从不同方向进行出发的，从相同的方向出发的例子比较少见
// 同一方向的就是快慢指针的操作
// 没有经过数组的求和的操作就是一个指向前面和前面的一个
