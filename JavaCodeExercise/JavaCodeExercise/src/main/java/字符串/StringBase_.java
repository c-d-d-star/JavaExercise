package 字符串;

public class StringBase_ {
    public static void main(String[] args) {
        // initialize
        String s1 = "Hello World";
        System.out.println("s1 is \"" + s1 + "\"");
        String s2 = s1;
        System.out.println("s2 is another reference to s1.");
        String s3 = new String(s1);
        System.out.println("s3 is a copy of s1.");
        // compare using '=='
        System.out.println("Compared by '==':");
        // true since string is immutable and s1 is binded to "Hello World"
        System.out.println("s1 and \"Hello World\": " + (s1 == "Hello World"));
        // true since s1 and s2 is the reference of the same object
        System.out.println("s1 and s2: " + (s1 == s2));
        // false since s3 is refered to another new object
        System.out.println("s1 and s3: " + (s1 == s3));
        // compare using 'equals'
        System.out.println("Compared by 'equals':");
        System.out.println("s1 and \"Hello World\": " + s1.equals("Hello World"));
        System.out.println("s1 and s2: " + s1.equals(s2));
        System.out.println("s1 and s3: " + s1.equals(s3));
        // compare using 'compareTo'
        System.out.println("Compared by 'compareTo':");
        System.out.println("s1 and \"Hello World\": " + (s1.compareTo("Hello World") == 0));
        System.out.println("s1 and s2: " + (s1.compareTo(s2) == 0));
        System.out.println("s1 and s3: " + (s1.compareTo(s3) == 0));



//        String s11 = "Hello World";
//        s11[5] = ',';
//        System.out.println(s1);


        String s11 = "Hello World";
        char[] charArray = s11.toCharArray();
        charArray[5] = ',';
        String modifiedString = new String(charArray);
        System.out.println(modifiedString);




    }

}


// 字符比较
/* String 使用“==” 比较并不是在比较字符串内容, 而是比较两个引用是否是指向同一个对象。
* 字符串之间的创建一个是在堆中的一个位置，一个是在堆中的两个位置
* 字符串之间是否是相等的话，采用的是equal方法来进行比较的
String s1=’hello ‘
String s2=’hello ‘
s1.equals(s2)
*  */




// 字符修改
/*
* 字符串创建完毕之后是不能进行修改的，如果是想要修改，那么是可以将字符串转换成字符串数组，然后将其进行修改
*
*
* */
