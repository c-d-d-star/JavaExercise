package 递归;
//斐波那契数列：编写一个函数，使用递归算法生成给定位置的斐波那契数列。
public class recursion02_ {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // 递归结束条件返回的就是想要返回的数字
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int position = 6;
        int result = fibonacci(position);
        System.out.println("第 " + position + " 个斐波那契数为：" + result);
    }
}
