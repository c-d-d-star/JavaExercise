package 字符串;

class ExcelColumnTitleToNumber{
    public int titleToNumber(String columnTitle) {

        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            int digitValue = columnTitle.charAt(i) - 'A' + 1;
            result = result * 26 + digitValue;
        }

        return result;
    }
    public static void main(String[] args) {
        ExcelColumnTitleToNumber converter = new ExcelColumnTitleToNumber();
        String columnTitle = "AB";
        int columnNumber = converter.titleToNumber(columnTitle);
        System.out.println("Column Number: " + columnNumber); // Output: 28
    }



}