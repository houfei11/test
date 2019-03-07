package practice;

import java.util.ArrayList;
import java.util.List;

/**
 *  List 集合 可重复集合，并且有序 特点：可以根据下标操作元素
 *  常用实现类：
 *  ArrayLsit：使用数组实现，查询更快
 *  LinkedList：使用链表实现，增删更快
 */
public class ListDemo {
    public static void main(String[] args) {
        /**
         * E set（int index， E e）
         * 将给定元素设置到指定位置上，返回值为原位置的元素
         */
        List list = new ArrayList();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("abc");
        System.out.println(list);
        String old = (String) list.set(1,"two");
        System.out.println(list);
        System.out.println("old:" + old);
        // list.set(4,"Dev");  // 编译错误，下标越界
        /**
         * E get(int index)
         * 获取给定下标对应的元素
         */
        // 获取第三个元素
        String str = (String) list.get(2);
        System.out.println(str);
        // 传统循环遍历Lsit集合
        for (int i = 0; i < list.size() ; i++) {
           String str1 = (String) list.get(i);
            System.out.println(str1);
        }
    }
}
/**
 * 取子集
 * List subList(int start, int end)
 */
class ListDemo1{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10 ; i++) {
             list.add(i);
        }
        System.out.println(list);
        // 获取3--7
        List<Integer> subList = list.subList(3,8);
        System.out.println(subList);
        // 将子集中每个元素扩大10倍
        for (int i = 0; i < subList.size() ; i++) {
            int n = subList.get(i);
            n = n*10;
            subList.set(i,n);
        }
        System.out.println(list);
        /**
         * 删除集合中的2--8元素
         */
        list.subList(2,9).clear();
        System.out.println(list);
    }
}
