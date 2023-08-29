package org.example.arithmetic.search;

public class ShellSort {
    public static void sort(int arr[]) {
        //控制增量，每次增量都是一半
        for(int step=arr.length/2;step>0;step/=2){
            //从增量处开始计算，但是比较的时候是可以比较到最开始的元素的
            for(int i=step;i<arr.length;i++){
                int temp=arr[i];
                int j=i;
                while(j-step>0&&temp>arr[j-step]){
                    arr[j]=arr[j-step];
                    j-=step;
                }
                arr[j]=temp;
            }
        }
    }

}
