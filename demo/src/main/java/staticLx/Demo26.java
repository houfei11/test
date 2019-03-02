package staticLx;
/**
 * static的演示
 * @author Administrator
 */
public class Demo26 {
    public static void main(String[] args) {
        Loo loo = new Loo();
        loo.show();
        Loo loo1 = new Loo();
        loo1.show();
        Loo loo2 = new Loo();
        loo2.show();
        System.out.println(Loo.b); // 建议通过类名来访问
        System.out.println(loo.b); // 不建议用过引用来访问
        Moo.test();//静态方法通过类名访问
        Noo noo = new Noo();
        Noo noo1 = new Noo();
        Noo noo2 = new Noo();
    }
}
class Moo{
    int a;
    static int b;
    void show(){
        a = 1;
        b = 2;
    }
    static void test(){
        // a = 1;  编译报错
        b = 2;
    }
}
class Loo{
    int a;
    static int b;
    Loo(){
        a++;
        b++;
    }
    void show(){
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
class Joo{
    int c;  // 实例变量 --- 对象点来访问
    static int d;  //静态变量 --- 类名点来访问
    void show(){  // 实例方法 --- this
        c++;
        d++;
    }
    static void test(){  //静态方法
        // c++; 编译错误，在静态方法中不能直接访问实例成员变量
        d++;
    }
}
class Noo{
    static{
        System.out.println("静态块");
    }
    Noo(){
        System.out.println("构造方法");
    }
}
