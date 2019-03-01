package controller;
/**
 * 继承，通过extends实现
 * java中的单一继承，一个子类只能继承一个父类
 */
public class Deom20 {
    String name;
    int age;
    String address;
    void eat(){}
    void sleep(){}

}
class Teacher extends Deom20{
    double salary;
    void teach(){

    }
    @Override
    void eat() {
        super.eat();
    }

    @Override
    void sleep() {
        super.sleep();
    }
}
class Student1 extends Deom20{
    String schoolName;
    void study(){

    }
    @Override
    void eat() {
        super.eat();
    }
}
