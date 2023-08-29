package 字符串;
/*
将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。

        比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
        P   A   H   N
        A P L S I I G
        Y   I   R

        之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
*/
public class String11_ {

    public String convert(String s, int numRows) {
    char [] arr=s.toCharArray();
    StringBuilder[] sb=new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i]=new StringBuilder();
        }
        int curRow = 0;// 跟踪当前位置初始化为 0。一开始应该放置在0这个位置
        boolean goingDown = false; // 判度是向上走还是向下走

        // 进行字符串的遍历
        for (char c : s.toCharArray()) {
            sb[curRow].append(c);

            // 判度向下还是向上
            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }
            //进行行号的变换
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : sb) {
            result.append(row);
        }

        return result.toString();

    }

}
