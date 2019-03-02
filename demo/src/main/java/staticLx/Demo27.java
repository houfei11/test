package staticLx;

/**
 * final的演示
 * @author Administrator
 */
public class Demo27 {
    public static void main(String[] args) {

    }
}
class Koo{  // final修饰变量，不能被改变
    final int a = 5; // 声明同时初始化
    final int b;
    Koo(){
        b = 8;
    }
    void show(){
        final int c; //
        // a = 55; 编译报错，final修饰的变量不能被改变
    }
}
class Poo{
    final void say(){}
    void test(){}
}
class Qoo extends Poo{
    // void say(){}  编译错误，final的方法不能被重写
    @Override
    void test(){}
}
final class Roo{
}
// class Soo extends Roo{} 编译错误，final修饰的类不能被继承
class Too{
}
final class Uoo extends Too{} // 正确 ，final修饰的类可以继承其他类

