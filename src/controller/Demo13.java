package controller;


/**
 *  面向过程
 * @author Administrator
 */
public class Demo13 {
    public static void main(String[] args) {
        String name = "小明";
        int age = 18;
        String salary = "1800";
        show(name, age, salary);
    }
    private static void show(String name, int age, String salary){
        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("工资: "+salary);
    }
}
