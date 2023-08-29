package 字符串;

public class String_ {
    public static void main(String[] args) {
        String name="cdd cdd cddf";
        int length=ConntString(name);
        System.out.println(length);
    }


    public static int ConntString(String str){
        str.trim();// 去除掉两边的字符串
        int length=0;
        for (int i = str.length()-1; i >0 ; i--) {
            if(str.charAt(i)==' ') break;
            length++;
        }
        return length;
    }
}

//计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾)


class String01{
    public static void main(String[] args) {

        String c="cdd";
        System.out.println(c.isEmpty());

    }



}