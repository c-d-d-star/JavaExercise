package 查找.排序;


import java.util.Arrays;

// 对于冒泡排序的一种改进
public class QuickSort {

    // 这个是分治法的最好的应用
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // 选取最后一个元素作为基准元素
        int i = low - 1; // i 指向小于基准元素的最后一个元素的位置
//        System.out.println(arr[i]);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j); // 将小于基准元素的元素交换到左边
            }
        }

        swap(arr, i + 1, high); // 将基准元素交换到正确的位置
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Original array: " + Arrays.toString(arr));
        quickSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }



    public static void quickSort02(int []arr){
        quickSort02(arr,0,arr.length-1);

    }

    public static void quickSort02(int []arr,int low,int height){
        int privot=partition02(arr);
        quickSort02(arr,low,privot-1);
        quickSort(arr,privot+1,height);
    }
    public static int partition02(int []arr){
        int low=0;
        int height01=arr.length;
        int privot=arr[height01-1];
        int i=low-1;
        for (int j = low; j < arr.length; j++) {
            while(low<height01){
                if(arr[low]<privot){
                    swap(arr,j,i);
                   i++;
                }
        }

        }
        swap(arr,i,height01);
        return i+1;
    }

    /*
    * 这里出现了几个问题：

height 参数在 quickSort02 和 partition02 方法中代表的含义不一致。
* 在 quickSort02 中，height 应该表示终止索引（不包含在排序范围内），而在 partition02 中，height 实际上是数组的长度。

在 partition02 方法中的 for 循环，会导致无限循环。
* 因为 low 和 height 的值在循环中没有更新，所以条件 while (low < height) 始终为真，会一直执行循环内部的代码。

在 partition02 方法中，对 i 的更新不正确，应该是 i++ 而不是 j++。

在交换元素时调用的 swap 方法实际上是未定义的。正确的做法是在 quickSort02 方法中使用 swap 方法进行交换。
    *
    *
    *
    *
    *
    * */

}
