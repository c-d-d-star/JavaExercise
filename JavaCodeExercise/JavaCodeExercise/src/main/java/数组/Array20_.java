package 数组;
//寻找对称的数组：给定一个包含 n 个整数的数组，要求判断它是否是是对称的，即前端和后端的元素是否相等。

public class Array20_ {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 2, 1};

        System.out.println("arr1 是对称数组: " + symmetryArray(arr1));
        System.out.println("arr2 是对称数组: " + symmetryArray(arr2));
        System.out.println("arr3 是对称数组: " + symmetryArray(arr3));
    }

    public static Boolean symmetryArray(int []arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        for (int i = 0; i < n; i++) {
            if(arr[left]!=arr[right]){
                return false; // 编写相等的情况下会出现错误
            }else{
                left++;
                right--;
            }

        }


        return true;
    }
}
