package practice;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈
 * 存储一组元素，但是存取一组元素必须遵循先进后出原则，
 * 通常为了实现后退这类功能时会使用栈
 */
public class StackDemo {
    public static void main(String[] args) {
        /**
         * java.util.Deque
         * 双端队列，两端都可以进出队，当只调用从一端进出操作时，就形成了栈结构
         * 因此，双队列为栈提供了两个方法，push，pop
         */
        Deque<String> deque = new LinkedList<>();
        /**
         * 最后入栈的元素在栈顶（第一个元素）
         */
        deque.push("明");
        deque.push("天");
        deque.push("会");
        deque.push("更");
        deque.push("好");
        System.out.println(deque);
        /**
         *  出栈操作
         */
        String str = deque.pop();
        System.out.println(str);
        System.out.println(deque);
        str = deque.peek();
        System.out.println(str);
        System.out.println(deque);
    }
}
