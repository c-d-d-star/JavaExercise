package 字符串;

public class StringBase2_ {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("");
        str.append('c');
        str.append("d");
        str.capacity();
        System.out.println(str);
        System.out.println(str.charAt(0));


        System.out.println(str.substring(1));
    }
}
