package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 集合转换成数组，
 */
public class ListDemo3 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        collection.add("abc");
        collection.add("def");
        collection.add("ghl");
        /**
         * 集合提供了一个方法toArray，可以将当前集合转换成数组
         */
        String[] array = collection.toArray(new String[collection.size()]);
        System.out.println("长度：" + array.length);
        for (String str : array) {
            System.out.println(str);
        }

    }
}

/**
 * 数组转换成集合，需要注意，
 */
class ListDemo4{
    public static void main(String[] args) {
        String[] array = {"我","们","的","明","天","--","--"};
        List<String> list = Arrays.asList(array);
        System.out.println(list);
        /**
         *  向集合中添加一个元素
         *  实际上下面的代码会抛出异常，原因在于，该集合是由数组转化过来的
         *  那么该集合就表示原来的数组，所以对集合的操作就是对数组的操作，
         *  那么添加元素就会导致数组扩容，那么就不能表示原来的数组了
         *  所以不允许向集合中添加元素
         */
        list.add("tianhei");
        System.out.println(list);
    }
}
