package everyday002;

import java.util.*;

/**
 * 将集合和Map转换成线程安全的
 * @author Administrator
 */
public class SyncDemo5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println(list);
        // 将集合转换成线程安全的集合
        list = Collections.synchronizedList(list);
        System.out.println(list);
        Set<String> set = new HashSet<>();
        System.out.println(set);
        // 将给定集合Set转换成线程安全的
        set = Collections.synchronizedSet(set);
        System.out.println(set);
        Map<String,Integer> map = new HashMap<>();
        map.put("语文",88);
        map.put("数学",99);
        map.put("英语",100);
        System.out.println(map);
        // 将map集合转换成线程安全的
        map = Collections.synchronizedMap(map);
        System.out.println(map);
    }
}
