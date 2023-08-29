package 字符串;
//字符串反转：将一个字符串反转，即逆序输出字符串中的字符。
public class String04_ {

    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println(reversedStr);
    }

    // 这个是和数组的操作是差不多的，但是比数组的操作多了一些字符串特有的操作
    // 字符串是不能被修改的，如果是需要将数据进行倒置的化，需要将其设置成字符数组


    public static String reverseString(String str){

        char [] chars=str.toCharArray();
        // 此时的str1就是可进行修改的和数组是一样的了
        int left = 0; // 左指针
        int right = chars.length - 1; // 右指针

        // 交换左右指针对应的字符，直到左右指针相遇
        while (left < right) {
            // 交换左右指针对应的字符
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // 更新左右指针的位置
            left++;
            right--;
        }

        // 将字符数组转换为字符串
        String reversedStr = new String(chars);

        return reversedStr;
    }


}
