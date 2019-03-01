package controller;

public class Deom22 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.a = 2;
        tiger.say();
        // tiger.b; //编译错误 父类不能访问子类
        Foo foo = new Foo();
        foo.b = 1;
        foo.show();
        foo.a = 1;
        foo.say();  // 正确  子可以访问父类
        Tiger tiger1 = new Foo();
        tiger1.a = 1;
        tiger1.say();
        // tiger1.b; // 编译错误 父类的引用只能访问父类的成员
    }
}
class Tiger{
    int a;
    void say(){

    }
}
class Foo extends Tiger{
    int b;
    void show(){

    }
}
