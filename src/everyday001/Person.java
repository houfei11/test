package everyday001;

import java.io.Serializable;
import java.util.List;

/**
 * 该类用于测试作为对象流读写对象使用
 * 当一个类要被对象流读写，那么必须实现java.io.Serializable接口
 * @author Administrator
 */
public class Person implements Serializable {
    private String name;
    private int age;
    private String gender;
    /**
     * transient关键字是用来修饰属性的
     * 当被修饰后，该类的实例在使用oos进行对象序列化时，该属性值被忽略，从而达到对象"瘦身"的目的
     */
    private transient List<String> otherInfo;

    public Person() {
    }

    public Person(String name, int age, String gender, List<String> otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    /**
     * 当一个方法中使用throw抛出一个异常时，就要在方法上使用throws声明该类异常的抛出以通知调用者解决
     * @param age
     * @throws Exception
     */
    public void setAge(int age) throws Exception{
        if (age < 0 || age > 100){
            throw new Exception("年龄不合法！！");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(List<String> otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + otherInfo +
                '}';
    }
}
