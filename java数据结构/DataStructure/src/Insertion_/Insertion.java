package Insertion_;

import Selection_.Selection;

import java.util.Arrays;

public class Insertion {
    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
              if(gater(a[j-1], a[j])) eatc(a,j-1,j);
            }
        }
    }

    private static void eatc(Comparable[] a, int i, int j) {
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t
;    }

    private static boolean gater(Comparable c1, Comparable c2) {
        return c1.compareTo(c2)>0;
    }
}
//第一个元素是有序的，从第二个元素开始，数组开始无序起来了，从第二个元素向前推

class Test {
    public static void main(String[] args) {
        Integer[] a = {4,6,8,7,9,2,10,1};
        Selection.Sort(a);
        System.out.println(Arrays.toString(a)); } }