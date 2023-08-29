package 查找.排序;
import java.util.Arrays;
public class ShellSort {



    public static  void shellSort(int[]arr){
        int n=arr.length;
        // 分成几个gap
        for(int gap=n/2;gap>0;gap/=2){
            //在数组中的gap内进行遍历
            for(int i=gap;i<n;i++){
                // 采用交换的方式采取零时变量
                int temp = arr[i];
                int j;
                // Shift elements that are greater than temp towards the right
                // 在gap里面进行排序
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
            }
        }
    }



    public static void shellSort02(int []arr){

        int n=arr.length;
        for(int gap=n/2;gap>0;gap/=2){
            for(int i=gap;i<n;i++){
                int j=i;
                int temp=arr[i];
               while(j >= gap && arr[j - gap] > temp){
                   arr[j]=arr[j-gap];
                   j-=gap;
               }
               arr[j]=temp;
            }
        }
    }


}





class ShellSort01 {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        shellSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void shellSort(int[] arr) {
        int n = arr.length;
        // 初始的间隔设定为数组长度的一半
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // 在每个间隔内执行插入排序
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                // 对子序列进行插入排序
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
        }
    }
}

