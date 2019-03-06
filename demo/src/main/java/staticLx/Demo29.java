package staticLx;

/**
 * 接口: 1.是一个标准、规范  遵守标准，就能干某件事 2.由interface定义
 *       3.只能包含常量和抽象方法 4.接口不能被实例化 5.接口都是需要被实现的(可以被理解为继承)
 *       必须重写接口中的所有抽象方法 6.一个类可以实现多个接口，用逗号分离，若又继承又实现时，
 *       则先继承后实现 7.接口可以继承接口
 * 应用场景：类对类--------继承；
 *          接口对接口------继承；
 *          类和接口--------实现；
 * @author Administrator
 */
public class Demo29 {
    public static void main(String[] args) {
        Intter1 o; //正确
        // new Intter2(); // 编译错误 接口不能被实例化
    }
}
interface Intter1{
    public static final int NUM = 5;
    public abstract void show();
    double PI = 3.14159; // 默认public static final   数据默认为常量；
    void Car1(); // 默认public abstract
    // int add; 编译错误
    // public void say(){}  //  编译错误；
}
interface Intter2{
    void a();
    void b();
}

abstract class Boo2{
    abstract void c();

    public abstract void say();
}

class Aoo extends Boo2 implements Intter1,Intter2{

    @Override
    public void a() {
    }
    @Override
    public void b() {
    }

    @Override
    void c() {

    }

    @Override
    public void show() {

    }

    @Override
    public void Car1() {

    }

    @Override
    public void say() {

    }
}
interface inter3{
    void d();
}
interface inter4 extends inter3{
    void e();
}
class Coo implements inter4{

    @Override
    public void d() {

    }

    @Override
    public void e() {

    }
}





