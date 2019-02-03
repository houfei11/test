package controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo7 {
    /**
     * map的键是不允许重复的，因为它的键是用set存储的，set集合里面不能有相同的元素，里面会自动进行过滤
     * java中的多态-----多态的定义-只能调用接口中覆盖的方法和属性
     * HashSet里面的元素是无序的
     */
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(20);
        for (Object setadd: set) {
            System.out.println(setadd);
        }
        // HashSet无序
        Set<Student> ager = new HashSet<>();
        Student student = new Student("xiaoming",10,"西安碑林区");
        Student student1 = new Student("wangming",20,"西安莲湖区");
        Student student2 = new Student("houfei",10,"西安胜多负少");
        Student student3 = new Student("www",30,"beijing");
        ager.add(student);
        ager.add(student1);
        ager.add(student2);
        ager.add(student3);
        for (Student ager11: ager) {
            System.out.println(ager11.getName()+"---------"+ager11.getAge()+"---------"+ager11.getAddress());
        }
        Integer age = 8;
        System.out.println(age.hashCode());
        // TreeSet
        Set<Dog> treeSet = new TreeSet<>(new Dog());
        treeSet.add(new Dog(11));
        treeSet.add(new Dog(12));
        treeSet.add(new Dog(9));
        treeSet.add(new Dog(3));
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+"-----------");
        }
    }
}
