package 回溯法;

import java.util.ArrayList;
import java.util.List;

public class Phone_number_corresponds_to_string {



    private static final String[] LETTERS = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };
    // 对应的映射数组
    public List<String> letterCombinations(String str){
        List<String> result =new ArrayList<>();
        if(str==null||str.isEmpty()){
            return result;
        }
        backtracking();
        return result;
    }

    public void backtracking(){

    }
}
class PhoneNumberLetterCombinations {
    // 数字对应的字母映射
    private static final String[] LETTERS = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder current, String digits, int index) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = LETTERS[digit - '0'];
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(result, current, digits, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        PhoneNumberLetterCombinations phoneNumber = new PhoneNumberLetterCombinations();
        String digits = "23";
        List<String> combinations = phoneNumber.letterCombinations(digits);
        System.out.println(combinations);
    }
}

