package controller;

/**
 * super关键字，它是一个指代变量，用于在子类中指代父类对象。
 * 只能用于子类的构造函数和实例方法中，不能用于子类的类（静态）方法中。原因是super指代的是一个父类的对象，
 * 它需要在运行时被创建，而静态方法是类方法，它是类的一部分。当类被加载时，方法已经存在，但是这时候父类对象还没有被初始化。
 */
public class Deom15 {
    public String name = "小头爸爸";
    public boolean hasMoney = false;

    public Deom15(int age) {
        this.age = age;
    }


    /**
     * 睡觉方法
     */
    public void sleeping(){
        System.out.println("爸爸已经睡觉了");
    }

    /**
     * 工作的方法
     */
    public void working(){
        System.out.println("爸爸正在工作...");
    }
}
