package controller;
/**
 * 继承的传递性
 */
public class Deom21 {
    String name;
    void sun(){

    }
}
class Aoo extends Deom21{
    int age;
    void sleep(){}
}
class Boo extends Aoo{
    String className;
    void eat(){}
}
class Coo extends Boo{
    String schoolName;
    void teach(){}
}
class Doo extends Coo{
    String salary;
    @Override
    void sun() {
        super.sun();
    }

    @Override
    void teach() {
        super.teach();
    }
    @Override
    void sleep() {
        super.sleep();
    }
}
