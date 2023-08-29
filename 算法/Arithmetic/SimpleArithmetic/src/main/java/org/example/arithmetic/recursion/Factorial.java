package org.example.arithmetic.recursion;


// 这个类代表的是阶乘
public class Factorial {
    public static int factorial(int n){
        if(n==1) return 1; // 这个是递归的结束条件是什么
        else return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int c=5;
        int a=factorial(c);
        System.out.println(a);

    }
}
