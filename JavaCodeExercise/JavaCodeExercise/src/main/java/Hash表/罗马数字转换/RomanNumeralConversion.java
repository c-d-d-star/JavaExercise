package Hash表.罗马数字转换;

import java.util.HashMap;

public class RomanNumeralConversion {
}
class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            // Check if there is a next character
            if (i + 1 < s.length()) {
                char nextChar = s.charAt(i + 1);
                int nextValue = romanMap.get(nextChar);

                // Compare current and next values to determine if special subtraction is needed
                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                // If there is no next character, just add the current value to the result
                result += currentValue;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String romanNumber = "XXVII";
        int result = romanToInt(romanNumber);
        System.out.println("Roman Number: " + romanNumber);
        System.out.println("Integer Value: " + result);
    }
}
