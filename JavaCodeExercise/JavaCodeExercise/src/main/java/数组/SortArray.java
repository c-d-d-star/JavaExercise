package 数组;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArray {
    public static void main(String[] args) {
        int []arr={7,6,5,4,3,2,1};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 无序的数组经过有序数组是可以进行直接排序的
    }





}

class addArray{
    public static void main(String[] args) {
        // 集合当中添加数组元素

        int []arr={1,2,3,4};
        List <Integer>list=new ArrayList();
        List<List<Integer>> result=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
            result.add(list);
        }
        for (int a:list) {
            System.out.println(list);
        }
    }
}
