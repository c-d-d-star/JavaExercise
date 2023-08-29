package 数组;
//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
public class Array01_ {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};// 数组已经是排序的了
        int target = 7;
        System.out.println(findIndex(array, target));
    }

    // 采用的是二分法来进行搜索
    public static int findIndex(int[] array, int target) {
        int left = 0;// 这个是定义的是指针
        int right = array.length - 1;
        int mid = left + (right - left) / 2;


        for (int i = 0; i < array.length - 1; i++) {
            if (array[mid] == target) return mid;
            else if (array[mid] < target) left = mid + 1;
            else {
                right = mid - 1;
            }
        }
        return left;

    }
}

// 数组当中的求和就是采用的是二分法来做的
