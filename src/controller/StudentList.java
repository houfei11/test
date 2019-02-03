package controller;

import java.util.ArrayList;
public class StudentList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        StudentMethod sm = new StudentMethod();
        sm.saveStudent(list);
        sm.printStudent(list);
        sm.randomStudent(list);
    }
}
