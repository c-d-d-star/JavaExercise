package 数组;
////寻找缺失的数字：给定一个包含 n 个整数的数组，要求找出其中缺失的最小正整数。
//public class Array06_ {
//    public static void main(String[] args) {
//        int[] nums = {3, 4, -1, 1};
//        int missingNumber = findMissingNumer(nums);
//        System.out.println("缺失的最小正整数为: " + missingNumber);
//    }
//
//    public static int findMissingNumer(int []arr){
//        //首先进行数组的排序,不是单纯的进行排序
//        int n =arr.length;
//        for (int i = 0; i < arr.length; i++) {
//            while(arr[i]>0&arr[i]<=n&arr[arr[i]-1]!=arr[i]){
//                swap(arr,i,i+1);
//            }
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[j]!=j+1) return j+1;
//            }
//        }
//        return n+1;
//    }
//    public static void swap(int []arr,int a,int b){
//        int temp=arr[a];
//        arr[a]=arr[b];
//        arr[b]=temp;
//    }
//
//
//
//}
//
//// 一开始排序是想的是对的，然后是遍历数组，发现哪一个数
//// 利用的是数组下表元素比下表大1来进行解决的


public class Array06_  {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;

        // 第一次遍历，将每个数字归位到正确的位置上
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        // 第二次遍历，找到第一个位置上数字不正确的位置，即为缺失的最小正整数
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // 如果没有找到缺失的最小正整数，则说明数组中包含了所有正整数，返回 n+1
        return n + 1;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int missingNumber = findMissingNumber(nums);
        System.out.println("缺失的最小正整数为: " + missingNumber);
    }
}

