package staticLx;

/**
 * 内部类：成员内部类：不太常用 1.类中套类，外面的叫外部类，里面的叫内部类
 * 2.只服务于外部类，对外不具备可见性 3.内部类对象通常只在外部类中创建
 * 4.内部类中可以直接访问外部类成员 5.内部类中有个隐士的引用
 */
public class Demo5 {
    public static void main(String[] args) {
        Koo koo = new Koo();
        // Goo goo = new Goo();  编译错误 只服务于外部类，对外不具备可见性
    }
}
class Test{
    void show(){
        Koo koo = new Koo();
        // Goo goo = new Goo(); // 编译错误
    }
}
class Koo{ // 外部类
    private int a;
    Goo show(){
        Goo goo = new Goo();
        return new Goo();
    }
    class Goo{ // 内部类 --- Koo的成员 不是独立的类
        void test(){
            System.out.println(a); //正确 内部类中可以直接访问外部类成员
            System.out.println(Koo.this.a); // 默认加了外部类.this
            // System.out.println(this.a); 编译错误
        }
    }
}
class Outer{
    private int time;
    private Inner inner;
    Outer(int time){
        this.time = time;
        inner = new Inner();
        inner.timeInc();
    }
    public void printTime(){
        System.out.println(time);
    }
    class Inner {
        public void timeInc(){
            time ++;
        }
    }
}

