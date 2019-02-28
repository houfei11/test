package controller;

/**
 *  补充遗漏
 * @author Administrator
 */
public class Deom14 {
    /**
     *  参数传递：
     *  形参：方法声明时，方法小括号内的参数
     *  实参: 调用方法时，实际传入的参数值
     *  java中传递值得机制:
     *  形参是基本数据类型的: 将实参的值传递给实参的基本数据类型的变量
     *  形参是引用数据类型的: 将实参的引用类型的值(即在堆空间中生成的首地址的值)传递给形参的引用类型的变量
     */
    public static void main(String[] args) {
        DateAdd add = new DateAdd();
        System.out.println("add.i是：" + add.i + "add.j是：" + add.j);
        Deom14 deom = new Deom14();
        deom.swap(add);
        System.out.println("add.i是：" + add.i + "add.j是：" + add.j);
    }
    public void swap(DateAdd add){
        int temp = add.i;
        add.i = add.j;
        add.j = temp;
    }
}
class DateAdd{
    int i = 10;
    int j = 5;
}