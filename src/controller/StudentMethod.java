package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * ArrayList集合储存学生练习
 */
public class StudentMethod {
    public final static void saveStudent(ArrayList list){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student st = new Student();
            System.out.println("请输入第"+(i+1)+"个学生的姓名：");
            st.name = sc.next();
            System.out.println("请输入第"+(i+1)+"个学生的年龄：");
            st.age = sc.nextInt();
            list.add(st);
        }
    }
    public final static void printStudent(ArrayList list) {
        for(int i = 0; i < list.size(); i++) {
            Student stu = (Student) list.get(i);
            System.out.println("学生姓名：" + stu.name + "学生年龄：" + stu.age);
        }
    }
    //创建一个随机获取学生集合的类
    public final static void randomStudent(ArrayList list) {
        Random ran = new Random();
        int index = ran.nextInt(list.size());
        Student stu = (Student) list.get(index);
        System.out.println("今天值日的同学是：" + stu.name);
    }
}

