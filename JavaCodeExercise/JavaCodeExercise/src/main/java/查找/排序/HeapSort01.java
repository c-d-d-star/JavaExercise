package 查找.排序;

import java.util.Arrays;

import static 查找.排序.HeapSort01.heapSort01;

public class HeapSort01{


    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        heapSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    public static void  heapSort(int[]arr){
        int n=arr.length;
        // 首先从最后的非叶子节点进行排序
        for(int i=n/2-1;i>0;i--){
            heapSort01(arr,0,i);
        }
        // 进行整体的堆排序
        for (int i = n-1; i >0 ; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapSort01(arr,i,0);

        }
    }

    // 输入的是数组、数组的个数，当前位置的非叶子节点
    public static void heapSort01(int []arr,int n,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(arr[left]>arr[largest]&&left<n){
            largest=left;
        }
        if(arr[right]>arr[largest]&&right<n){
            largest=right;
        }
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            // 交换之后防止对结构破坏
            heapSort01(arr,n,largest);
        }




    }





}

class HeapSort {

    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        heapSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build a max heap (rearrange the array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
            System.out.println("构建最大堆");
        }

        // One by one extract an element from the heap
        // 一个一个个从中将元素取出来

       for (int i = n - 1; i >= 0; i--) {
           // Move current root (maximum element) to the end
           int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
           System.out.println(arr[i]);
           System.out.println("这个是堆排序的过程");

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);// 重新调整堆
        }
    }


    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is the size of the heap
    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}


