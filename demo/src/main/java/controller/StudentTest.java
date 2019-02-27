package controller;

import entity.data.Student;

/**
 * 测试类
 * @author Administrator
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "wang";
        student.age = 18;
        student.address = "tongchuan";
        student.sayHi();
        student.study();
        student.sing();
    }
}
