package 查找.排序;

public class BubblleSearch {
    public static void main(String[] args) {
        int []arr={4,7,3,2,6,1,5};
        bubbleSearch(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void bubbleSearch(int []arr){
        int n=arr.length;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j <n-1-i; j++) {
                if(arr[j]<arr[j+1]) swap(arr,j,j+1);  // 数组交换的时候是需要将原始的下表传递进去的而不是传递的是原始的元素
            }

        }
    }
    public static void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}

//外层循环（i的循环）控制需要进行的排序轮数，每一轮都会将当前未排序部分的最大元素放到正确的位置上。
//内层循环（j的循环）用于比较相邻元素并进行交换，将较大的元素向右移动。
//随着每一轮的进行，已经排序好的元素会逐渐增加，所以在内层循环中不需要比较已经排序好的部分。因此，内层循环的终止条件可以是 j < n - 1 - i，其中 n 是数组长度，i 是外层循环的当前轮数。
//通过这个终止条件，可以减少不必要的比较操作，提高冒泡排序算法的效率。