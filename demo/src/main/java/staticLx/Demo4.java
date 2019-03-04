package staticLx;

/**
 * 多态：意义，同意类型的引用指向不同对象时，有不同的意义(行为的多态)
 * 强制类型转换，成功的条件有两个：1.引用所指向的对象，就是该类型 2.引用所指向的对象，实现了该接口
 */
public class Demo4 {
    public static void main(String[] args) {
        Doo doo = new Eoo(); // 向上造型
        Eoo doo1 = (Eoo) doo; // 引用所指向的对象，就是该类型
        Inter1 inter1 = (Inter1) doo; // 引用所指向的对象实现了该接口
        Foo foo = (Foo) doo; // ClassCastException类型转换异常
        if (doo instanceof Foo) { // false
            Foo foo1 = (Foo) doo;
        }
    }
}
interface Inter1{

}
class Doo{

}
class Eoo extends Doo implements Inter1{

}
class Foo extends Doo{

}