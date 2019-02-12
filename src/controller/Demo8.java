package controller;

import java.util.ArrayList;

/**
 * list集合序列排序的两种方法
 * 什么是集合，集合存放在java.Util包中，集合类存放的都是对象的引用，而非对象本身，我们称集合中的对象就是指集合对象的引用。
 * 集合的类型主要有三种：set(集)，list(列表)，Map(映射)
 * 集合就是放数据的容器，准确的说就是放数据对象引用的容器。
 * 集合（只能存储对象，对象类型可以不一样）的长度可变，可在多数情况下使用。
 */
public class Demo8 {
    public static void main(String[] args) {
        /**
         *  ArrayList剖析
         */
        // 基本用法   ArrayList是一个泛型容器，新建ArrayList需要泛型参数
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        // 添加元素   add方法添加元素到末尾
        list.add(123);
        list.add(456);
        list1.add("abc");
        list1.add("新年快乐！");
        list1.add("新年快乐！");
        // 长度方法   判断是否为空
        if (list.isEmpty()){
            System.out.println("list集合中没有元素---");
        } else {
            System.out.println(list);
        }
        // 获取长度
        System.out.println(list.size());
        // 访问元素的指定位置
        for (int i = 0; i < list1.size() ; i++) {
            System.out.println(list1.get(i)+"------"+i);
        }
        // 查找元素  如果找到返回索引位置，否则返回 -1
        list1.indexOf("新年快乐！");
        System.out.println(list1.indexOf("新年快乐！"));
        // 从后往前找
        list1.lastIndexOf("新年快乐！");
        System.out.println(list1.lastIndexOf("新年快乐！"));
        // 是否包含指定元素
        if (list1.contains("abc")) {
            System.out.println("包含");
        } else {
            System.out.println("不包含");
        }
        // 删除指定位置的元素  返回值为被删对象
        // remove(Object o)
        // 与indexOf一样，比较的依据的是equals方法，如果o为null，则删除值为null的元素。
        // 另外，remove只删除第一个相同的对象，也就是说，即使ArrayList中有多个与o相同的元素，也只会删除第一个。
        // 返回值为boolean类型，表示是否删除了元素。
        list1.remove(1);
        System.out.println(list1);
        System.out.println(list1.remove(1));
        // 删除所有元素
        list1.clear();
        System.out.println(list1);
        // 插入元素
        list1.add(0,"飞");
        list1.add(1,"驰");
        list1.add(2,"人");
        list1.add(3,"生");
        System.out.println(list1);
        // 删除重复元素
        boolean all = list1.removeAll(list);
        System.out.println(all);
        System.out.println(list);
        System.out.println(list1);
        // 修改元素
        list1.set(0,"喜");
        list1.set(1,"剧");
        list1.set(2,"之");
        list1.set(3,"王");
        System.out.println(list1);


    }
}
