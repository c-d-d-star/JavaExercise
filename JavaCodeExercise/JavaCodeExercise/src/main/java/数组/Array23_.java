package 数组;
//唯一元素：给定一个包含n 个整数的数组，要求找出其中只出现一次的数字。

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Array23_ {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 4, 4, 5, 5};
        List<Integer> uniqueElements =findUniqueElements(nums);

        System.out.println("只出现一次的数字：");
        for (int num : uniqueElements) {
            System.out.println(num);
        }

    }

    public static List<Integer> findOneElemnet(int []arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        List list=new ArrayList();
        while (left<right){
           if(arr[left]==arr[right]) {
               left++;
               right--;
           }else{
               list.add(arr[left]);
               list.add(arr[right]);

           }
        }
        return list;
    }

    public static int findUniqueElement01(int[] arr) {
        int uniqueNum = 0;
        for (int num : arr) {
            uniqueNum ^= num;
        }
        return uniqueNum;
    }


    public static List<Integer> findUniqueElements(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // 统计每个数字的出现次数
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        /*
countMap.put(num, countMap.getOrDefault(num, 0) + 1) 是使用 Java 中的 HashMap 的方法来统计每个数字出现的次数。
countMap.getOrDefault(num, 0) 用于获取键 num 对应的值，如果键不存在，则返回默认值 0。+ 1 用于增加键 num 对应的值，即将其出现次数加一。
countMap.put(num, countMap.getOrDefault(num, 0) + 1) 将键 num 对应的值更新为加一后的结果。
这样，我们就能够在哈希表 countMap 中统计每个数字出现的次数。

例如，对于数组 {1, 2, 2, 3, 3, 4, 4, 5, 5}，在第一个循环中，通过遍历数组，我们会将数字作为键，其出现次数作为值，存储在哈希表 countMap 中。
        * */

        List<Integer> uniqueElements = new ArrayList<>();
        // 遍历数组，将只出现一次的数字添加到列表中
        // 维护了两个数据结构，一个是数组，一个是集合
        for (int num : arr) {
            if (countMap.get(num) == 1) {
                uniqueElements.add(num);
            }
        }

        // Map集合是Key、Value，其中Key是唯一的但是Value是不唯一的
//        key在Map里面是唯一的但是value可以重复，一个key对应一个value。

        return uniqueElements;
    }
}



