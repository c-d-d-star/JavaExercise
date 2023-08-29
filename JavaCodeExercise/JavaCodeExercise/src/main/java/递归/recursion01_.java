package 递归;
//计算阶乘：编写一个函数，使用递归算法计算给定数字的阶乘。
public class recursion01_ {
    public static void main(String[] args) {
        int a=10;
        int result=factorial(a);
        System.out.println(result);

    }
    public static int factorial(int n){
        if(n==1) return 1;
        else {
           return n*factorial(n-1);
        }
    }
}
