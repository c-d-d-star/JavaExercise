package Comparable_Test;

import Comparable_use.Student;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setUsername("zhangsan");
        stu1.setAge(17);

        Student stu2 = new Student();
        stu2.setUsername("lisi");
        stu2.setAge(19);
        Comparable max = getMax(stu1, stu2);
        System.out.println(max);
        int j=getMin(3,4);
        System.out.println(j);
    }
    public static Comparable getMax(Comparable c1, Comparable c2){
        int cmp =c1.compareTo(c2);
        if(cmp>=0) return c1;
        else  return c2;
    }
    //Comparable对象：Comparable表示可被排序的，实现该接口的类的对象自动拥有排序功能。
    public static int getMin(int i,int j){
        return (i>j)?i:j;
    }
}
