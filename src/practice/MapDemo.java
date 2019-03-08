package practice;

import java.net.Inet4Address;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map集合练习
 * 以  Key -- value 对的形式存放元素
 * 在Map中key不允许重复(重复是依靠key的equals判断)
 * 常用的实现类为：hashMap
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String,Integer>();
        /**
         * v put(K k , V v)
         * 将给定的 Key — value 对存放在Map中
         */
        map.put("语文",88);
        map.put("数学",99);
        map.put("英语",65);
        map.put("历史",30);
        System.out.println(map);
        Integer value = map.put("历史",66);
        System.out.println(map);
        System.out.println(value);
        /**
         * 根据给定的key 获取对应的value，若当前map中没有给定的key，则返回为null
         */
        value = map.get("数学");
        System.out.println("数学：" + value);
        value = map.get("体育");
        System.out.println("体育：" + value);
        /**
         * 删除 remove
         */
        System.out.println("删除数学");
        value = map.remove("数学");
        System.out.println(map);
        System.out.println(value);
    }
}

/**
 * 遍历Map的三种形式
 * 1.所有的key
 * 2.所有的key-value
 * 3.所有的 value
 */
class MapDemo2{
    public static void main(String[] args) {
        Map<String, Integer> map =new HashMap<String, Integer>();
        map.put("化学",8);
        map.put("物理",9);
        map.put("体育",5);
        map.put("政治",3);
        System.out.println(map);
        /**
         * 遍历所有的key    Set<k> keySet()
         * 该方法会将当前的Map中所有的key存放一个Set集合后返回，那么遍历该集合就相当于遍历所有的key
         */
        Set<String> keySet = map.keySet();
        for (String key: keySet) {
            System.out.println("key:" + key);
        }
        /**
         * 遍历 key-value
         * Map中每一组键值对都是由Map的内部类：java.util.Map.Entry的一个实例表示的
         * Entry有两个方法：getKey，getValue，可以分别获取这一组键值对中的key-value
         * Set<Entry> entrySet
         * 该方法会将Map中每一组键值对(Entry实例)
         * 存放一个Set集合后返回
         */
        Set<Map.Entry<String,Integer>> map1 = map.entrySet();
        for (Map.Entry<String, Integer> e: map1) {
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key + value);
        }
        /**
         * 遍历所有的Value
         * Collection  values
         */
        Collection<Integer> value = map.values();
        for (Integer valu: value){
            System.out.println(valu);
        }
    }
}
