package Comparable_use;

public class Student  implements Comparable<Student> {
    private String username;
    private int age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //这个就是早重写自己返回时，字符串的格式是怎么样的
    @Override
    public String toString() {
        return "Student{" + "username='" + username + '\'' + ", age=" + age + '}';

    }
    //自己来定义比较的大小是怎么样的
    //通过年龄来进行比较哪一个大哪一个小
    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
    }
}
