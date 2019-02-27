package entity.data;

/**
 * 员工类
 */
public class Emp {
    String name;
    int age;
    double salaty;
    public void print(){
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("工资：" + salaty);
    }
}
