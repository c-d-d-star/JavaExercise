package 数组;

//给你一个整数数组 nums ，请计算数组的 中心下标 。
//计算中心的下表
// 数组在Java中怎么来进行传递
//采用的设计

public class Array_ {

    static int[] array = {1, 2, 3, 4, 5};

    public static void main(String[] args) {

        System.out.println(intpivotIndex(array));
    }

    public static int intpivotIndex(int[] array) {
        int totalSum=0;
        int totalLeftSum=0;
        for (int i = 0; i < array.length-1; i++) {
            totalSum+=array[i];
        }

        // 接下来就是判度每一个数组下表是否是中心下标
        for (int i = 0; i < array.length-1; i++) {
            // 这个是为了找到所有的数组下表是否是中心下标
            // 此时array就是中心下表的位置
            int rightSum = totalSum - totalLeftSum - array[i];
            if(rightSum==totalLeftSum){
                return i;
            }
            totalLeftSum+=array[i];
        }
        return -1;
    }
}

// 应该是判断每一个下表是否是中心数组的下表


