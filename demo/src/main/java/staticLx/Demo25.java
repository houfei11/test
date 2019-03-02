package staticLx;
/**
 * 访问修饰符
 */
public class Demo25 {
    public int a;  // 任何类
    protected int b;  // 本人，子类，同包类；
    int c;          // 本类，同包类
    private int d;  // 本类
    void show(){
        a = 1;
        b = 2;
        c = 3;
        d = 4;
    }
}
class Ioo{
    void show(){
        Demo25 deom = new Demo25();
        deom.a = 1;
        deom.b = 2;
        deom.c = 3;
        // deom9.d = 4;  编译错误；
    }
}