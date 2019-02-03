package controller;

public class Student {
    int age;
    String name;
    private String address;


    public Student() {
    }
    public Student(String xiaoming, int i, String xian) {
        this.name = xiaoming;
        this.age = i;
        this.address = xian;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
