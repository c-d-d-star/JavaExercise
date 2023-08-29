package 字符串.整数反转1;

public class Integerinversion {

    public static int integerInversion(int x) {
        if (x > 0) {
            String s = String.valueOf(x);
            char[] chars = s.toCharArray();  // 将字符串进行转换的时候是需要将数组
            int left = 0;
            int right = chars.length - 1;
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            return Integer.parseInt(new String(chars));
        } else if (x < 0) {
            // Handle negative numbers (optional)
            return -integerInversion(-x);
        } else {
            return 0; // x is already 0
        }
    }

    public static void main(String[] args) {
        int num =114748364;
        int invertedNum = integerInversion(num);
        System.out.println("Original number: " + num);
        System.out.println("Inverted number: " + invertedNum);
    }
}
