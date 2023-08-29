package 字符串;

public class StringBase03_ {

    public static void main(String[] args) {
        String s="CDDcdd";
        char[] a=s.toCharArray(); // 利用字符串数组来接受toCharArray的方法是转换成字符串数组
        a[1]='w';
        System.out.println(s);




        int []arr={1,2,3,4,5,6};
        for (int i = 0; i <arr.length -1; i++) {
            System.out.println(arr[arr[i]]);
        }

    }
}
