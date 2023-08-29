package 递归.计算数的n次方;

public class PowerCalculator {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        double halfPow = myPow(x, n / 2);

        if (n % 2 == 0) {
            return halfPow * halfPow;
        } else {
            return halfPow * halfPow * x;
        }
    }

    public static void main(String[] args) {
        PowerCalculator calculator = new PowerCalculator();
        double x = 2.0;
        int n = 10;
        double result = calculator.myPow(x, n);
        System.out.println(x + " 的 " + n + " 次幂为: " + result);
    }
}
