package staticLx;

/**
 * 匿名内部类的演示
 */
public class Demo6 {
    public static void main(String[] args) {
        // 1.系统创建了Inter2的一个子类，没有名字
        // 2.为该子类创建了一个对象，叫o1
        // 3.大括号包括的是子类的类体
        Inter2 o1 = new Inter2(){

        };
        Inter2 o2 = new Hoo();
        Inter10 o10 = new Inter10() {
            @Override
            public void show() {
                System.out.println("showshow");
            }
        };
        o10.show();
    }
}
interface Inter2{

}
interface Inter10{
    public void show();
}
class Hoo implements Inter2{
    int a;
    void show(){
        System.out.println("我是show方法");
    }
}

/**
 * 匿名内部类：如果创建一个类的对象，并且对象只被创建一次，此时该类不必命名，成为匿名内部类
 */
interface Action{
    public void execute();
}
class Main{
    public static void main(String[] args) {
        Action ac = new Action() {
            @Override
            public void execute() {
                System.out.println("Hello,Word");
            }
        };
        ac.execute();
    }
}

