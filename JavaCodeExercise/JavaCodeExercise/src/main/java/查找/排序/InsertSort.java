package 查找.排序;


import java.util.Arrays;

// 插入排序是将元素向后面进行移动，将位置空出来将元素插入到里面
public class InsertSort {
    // 要把第一个元素插入到0这个位置上来



    public static void insertSort(int []nums){

        for(int i=1;i<nums.length;i++){
            int j=i-1;
            int current=nums[i];
            while(j>=0&&nums[j]>current){
                nums[j+1]=nums[j];
                j--;
            }
            nums [j + 1] = current;
        }

    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            // 将当前元素插入已排序的部分
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Original array: " + Arrays.toString(arr));
        insertSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
