package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *  集合支持泛型，而泛型是用来约束集合中的类型的
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        // 只能添加String类型的元素了
        collection.add("one");
        collection.add("two");
        collection.add("three");
        collection.add("four");
        /**
         * 遍历集合元素
         */
        for (String str: collection) {
            System.out.println(str);
        }
        /**
         * 迭代器也应当指定泛型，而泛型的实际类型也应当与它遍历的集合的泛型类型一致
         */
        Iterator<String> it = collection.iterator();
        while (it.hasNext()){
            // 获取元素时不需要再造型了
            String string = it.next();
            System.out.println(string);
        }

    }
}
