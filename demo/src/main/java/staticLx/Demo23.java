package staticLx;

public class Demo23 {
    public static void main(String[] args) {
        Aoo aoo = new Aoo();
        aoo.show();
        Boo boo = new Boo();
        boo.show();
        Aoo aoo1 = new Boo();
        aoo1.show();
        // 重载看引用，重写看对象
        Goo goo = new Goo();
        Eoo eoo = new Foo(); // 向上造型
        goo.test(eoo);
    }
}
class Aoo{
    void show(){
        System.out.println("父类show");
    }
}
class Boo extends Aoo{
    @Override
    void show(){
        super.show();
        System.out.println("子类show");
    }
}
class Coo{
    void sayHi(){}
    double show(){
        return 0.1;
    }
    Coo Test(){
        return null;
    }
    Doo say(){
        return null;
    }
}
class Doo extends Coo{
    @Override
    void sayHi() {  // void是必须相同
        super.sayHi();
    }
    @Override
    double show(){  // 返回值基本数据类型必须相同
        return 2.2;
    }
    Doo test(){     // 引用小于父类
        return null;
    }
    // Coo say(){return null;}  引用大于父类报错，引用类型是必须小于或者等于父类
}

/**
 * 方法的重载演示
 */
class Goo{
    void test(Eoo eoo){
        System.out.println("父类参数");
        eoo.show();
    }
    void test(Foo foo){
        System.out.println("子类参数");
        foo.show();
    }
}

/**
 * 方法的重写
 */
class Eoo{
    void show(){
        System.out.println("我是父类");
    }
}
class Foo extends Eoo{
    @Override
    void show(){
        System.out.println("我是子类");
    }
}
