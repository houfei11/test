package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * list集合序列排序的两种方法
 */
public class Demo8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(21);
        list.add(5);
        list.add(12);
        list.add(8);
        list.add(1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
