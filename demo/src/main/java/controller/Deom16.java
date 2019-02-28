package controller;

import entity.data.Student;

/**
 * 引用类型之间画等号
 * @author Administrator
 */
public class Deom16 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "huoyingrenzhe";
        Student stu1 = stu;
        stu1.name = "haizeiwang";
        System.out.println(stu.name);
    }
}
