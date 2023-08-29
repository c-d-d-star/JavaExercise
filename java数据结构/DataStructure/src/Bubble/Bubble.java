package Bubble;

import java.util.Arrays;

public class Bubble {
    //将要排序的数组传递进来
    public static void sort(Comparable[] a){
        for (int i = a.length-1; i>0; i--) {
            for (int j = 0; j < a.length-1; j++) {
                if(greater(a[j],a[j+1])){
                    exch(a,j,j+1);
                }
            }

        }

    }

    private static void exch(Comparable[] a, int j, int i) {
        Comparable t = a[i]; a[i]=a[j]; a[j]=t;
    }

    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w)>0;

    }

}
class Test {
    public static void main(String[] args) {
        Integer[] a = {4, 5, 6, 3, 2, 1};
        Bubble.sort(a);
        System.out.println(Arrays.toString(a)); } }
