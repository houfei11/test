package practice;

import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue
 * 队列
 * 队列也可以存放一组元素，但是存取元素必须
 * 遵循：先进先出原则
 */
public class QueueDemo {
    public static void main(String[] args) {
        /**
         * LinkedList也实现了队列接口，因为它可以保存一组元素，并且首尾增删快，正好符合队列的特点
         */
        Queue<String> queue = new LinkedList<>();
        /**
         * boolean offer(E o)
         * 入列操作，向对尾追加一个元素
         */
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");
        System.out.println(queue);
        /**
         * E poll()
         * 出队操作，从队首获取元素就从队列中被删除了
         */
        String str = queue.poll();
        System.out.println(str);
        System.out.println(queue);
        /**
         * E peek()
         * 引用队首元素，但是不做出列操作
         */
        str = queue.peek();
        System.out.println(str);
        System.out.println(queue);
        System.out.println("size:" + queue.size());
        for (int i = 0; i < queue.size() ; i++) {
            str = queue.poll();
            System.out.println("元素：" + str);
        }
        System.out.println("遍历完成");
        System.out.println(queue);
        /**
         *  while
         */
        while (queue.size()>0){
            str = queue.poll();
            System.out.println("元素：" + str);
        }
        System.out.println("遍历结束");
        System.out.println(queue);
    }
}
