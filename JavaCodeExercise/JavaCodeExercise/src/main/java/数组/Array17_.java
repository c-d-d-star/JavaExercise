package 数组;
//反转数组：给定一个包含 n 个整数的数组，要求将其反转。

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Array17_ {
    public static void main(String[] args) {
        int []arr={4,3,2,1};
        int [] newarr= reversalArray(arr);
//        for (int i = 0; i < newarr.length; i++) {
//            System.out.println(newarr[i]);
//        }
        reverseArray02(arr);



    }



    public static int[] reversalArray(int []arr){
        int n=arr.length;
        int [] newarr=new int [n];

        for (int i = n-1; i >=0 ; i--) {
            newarr[i]=arr[i];
        }

        return newarr;// 数组元素如果没有被复制那么就是为0

    }
    // 双指针怎么来进行操作的
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // 交换左右两个元素
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // 移动指针
            left++;
            right--;
        }
    }



    // 采用的队列的方式
    public static void reverseArray02(int[] arr){
        Stack stack=new Stack();
        for (int i = 0; i <arr.length ; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(stack.pop());
        }
        // 放到栈里面然后弹栈
    }

}
