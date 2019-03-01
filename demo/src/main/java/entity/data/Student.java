package entity.data;

/**
 * @author Administrator
 */
public class Student {
    public String name;
    public int age;
    public String address;

    public Student(){

    }
    public Student(String name, int age, String address) {
    }

    public void study(){
        System.out.println(name + "在学习");
    }
    public void sayHi(){
        System.out.println("大家好我叫：" + name + "，今年" + age + "岁了"+"家住"+address);
    }
    public void sing(){
        System.out.println(name + "会唱歌！！");
    }
}
