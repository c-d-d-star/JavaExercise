package Selection_;

import java.util.Arrays;

public class Selection {
    public static void Sort(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;// 这里的下表正好是可以进行移动的
            for (int j = i + 1; j < a.length; j++) {
                if (gater(a[minIndex], a[j])) {
                    minIndex = j;
                }

            }
            //不是和最小的元素进行跟换的，而是更换的数组的下表的位置
            // 此时j就是用来找最小的数组的下表的
            each(a, i, minIndex); //进行方法的书写的时候是不需要将自己的这个名字给写出来的
        }
    }

    private static void each(Comparable[] a, int j, int i) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static boolean gater(Comparable c1, Comparable c2) {
        return c1.compareTo(c2) > 0;
    }
}


class Test {
    public static void main(String[] args) {
        Integer[] a = {4,6,8,7,9,2,10,1};
        Selection.Sort(a);
        System.out.println(Arrays.toString(a)); } }

