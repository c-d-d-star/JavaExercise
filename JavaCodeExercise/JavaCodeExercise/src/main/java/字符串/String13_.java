package 字符串;

public class String13_ {

    public static void main(String[] args) {
        int num=123456;

        int temp=num;

        int count=0;// 记录的是nums的位数
        while(temp!=0){
            temp /= 10;
            count++;
        }
//        System.out.println(count);


        // 逐位取出数字并输出
        for (int i = count - 1; i >= 0; i--) {
            int digit = (num / (int) Math.pow(10, i)) % 10;
            System.out.println("Digit at position " + i + ": " + digit);
            System.out.println( digit);
        }


    }
}
