package controller;

import java.util.Comparator;
import java.util.Objects;

public class Dog  implements Comparator {
    private int age;

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }

    public Dog(int age) {
        this.age = age;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Dog s1=(Dog)o1;
        Dog s2=(Dog)o2;

        if(s1.age>s2.age)
            return 1;
        else if(s1.age<s2.age)
            return -1;
        else return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age;
    }

    @Override
    public int hashCode() {

        return Objects.hash(age);
    }

}
