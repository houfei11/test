package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序自定义类型元素的集合
 */
public class SortListDemo {
    public static void main(String[] args) {
        List<PointOne> list = new ArrayList<>();
        list.add(new PointOne(1,3));
        list.add(new PointOne(2,4));
        list.add(new PointOne(4,2));
        list.add(new PointOne(9,5));
        System.out.println(list);
        /**
         * sort方法要求集合元素必须实现comparable接口，
         * 该接口用于规定实现类是可以比较的。
         * 其有一个抽象方法用来定义比较大小的规则
         */
        Collections.sort(list);
        System.out.println(list);

    }
}
class SortListDemo2{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jerry");
        list.add("tom");
        list.add("jack");
        System.out.println(list);
        Collections.sort(list);
        List<String> list1 = new ArrayList<>();
        list1.add("苍老师");
        list1.add("范老师");
        list1.add("明天会更好");
        System.out.println(list1);
        MyComparator com = new MyComparator();
        /**
         * 重载的sort方法需要传一个额外的比较器
         */
        Collections.sort(list1,com);
        /**
         *  匿名内部类形式创建
         */
        Comparator<String> com1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        };
    }
}
/**
 * 定义中文的比较器
 */
class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /**
         * 字符串中字符多的大
         */
        return o1.length() - o2.length();
    }
}
