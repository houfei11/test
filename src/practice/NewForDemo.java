package practice;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 增强for循環 for each
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","fou"};
        for (int i = 0;i< array.length;i++){
            String str = array[i];
            System.out.println(str);
        }
        for (String str:array) {
            System.out.println(str);
        }
    }
}

/**
 * 新循環遍歷集合
 */
class NewForDemo2{
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        System.out.println(c);
        for (Object o:c) {
            String str = (String) o;
            System.out.println(str);
        }
    }
}
