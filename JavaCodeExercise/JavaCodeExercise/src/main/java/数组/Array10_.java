package 数组;
//给定两个升序排列的数组，要求将它们合并成一个升序排列的数组。
public class Array10_ {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6, 8};

        int[] merged = mergeSortedArrays(nums1, nums2);

        System.out.println("Merged Array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }


    public static int[] mergeSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merged = new int[n1 + n2];  // 合并后的数组
        int i = 0;  // nums1 的索引
        int j = 0;  // nums2 的索引
        int k = 0;  // 合并数组的索引

        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }
        // 多个数组就没有考虑for循环来做了

        // 将剩余的元素添加到合并数组中
        while (i < n1) {
            merged[k] = nums1[i];
            i++;
            k++;
            // 下表的移动才能将元素添加进去
        }

        while (j < n2) {
            merged[k] = nums2[j];
            j++;
            k++;
        }

        return merged;
    }
}


//    public static  int [] mergeSortedArrays(int []arr1,int []arr2){
//        int arr1lengtn= arr1.length;
//        int arr2length=arr2.length;
//        int length=arr1.length+arr2.length;
//        int [] arr=new int[length];
//        // 控制循环变量的话还是采用的是两个变量来做
//        for (int i = 0; i < arr1.length; i++) {
//            if(arr1[i]<arr2[i]){
//                arr[i]=arr1[i];
//            }
//        }
//        while (arr1.length<arr2.length){
//            arr[arr2length-arr1lengtn]=arr2[arr2length-arr1lengtn];
//        }
//        while (arr1.length>arr2.length){
//            arr[arr1lengtn-arr2length]=arr2[arr1lengtn-arr2length];
//        }
//        return arr;
//    }
//}

// 1.两个数组的话，采用的是一个下标量是不合适的
// 采用的是两个下标量
// 为了让数组能够运行操作，可以采用的是while 有自己的编码的习惯
// 有第三个数组的时候也是需要将下表给标记出来的，出现多个数组的时候不要只是局限与一个数组下表

