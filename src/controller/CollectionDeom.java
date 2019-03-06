package controller;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 刪除集合元素
 */
public class CollectionDeom {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Point(1,2));
        collection.add(new Point(3,4));
        collection.add(new Point(4,5));
        Point p = new Point(1,2);
        /**
         * boolean remove(E e)
         * 从集合中删除指定元素，删除成功则返回true
         */
        collection.remove(p);
        System.out.println("删除完毕");
        System.out.println(collection);
    }
}

/**
 * 集合的批量操作
 */
class CollectionDemo2{
    public static void main(String[] args) {
        Collection co = new ArrayList();
        co.add("java");
        co.add(".net");
        co.add("javaScript");
        Collection co2 = new ArrayList();
        co2.add("ios");
        co2.add("androi");
        co2.add("linux");
        /**
         * 取并集
         * boolean addAll(Collection c)
         * 将给定集合中的所有元素添加到当前集合中
         * 添加后只要当前集合发生变化则返回true
         */
        boolean falg = co.addAll(co2);
        System.out.println(co2);
        System.out.println(falg);
        Collection co3 = new ArrayList();
        co3.add("java");
        co3.add("android");
        /**
         * boolean containsAll(collection c)
         * 判断当前集合是否包含给定集合中的元素
         */
        boolean contion = co.containsAll(co3);
        System.out.println("全包含" + contion );
    }
}

/**
 * 迭代器
 */
class CollectionDemo3{
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        // 获取用于便利当前集合的迭代器
        Iterator it = c.iterator();
        while (it.hasNext()){
            String str = (String)it.next();
            if ("#".equals(str)){
                c.remove(str);// 编译错误 在使用迭代器遍历元素时，不要使用集合的方法增删元素，否则发生异常
                /**
                 * 迭代器提供了remove方法
                 */
                it.remove();
            }
            System.out.println(str);
        }
        System.out.println(c);
    }
}