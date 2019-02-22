package controller;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Administrator
 */
public class Demo9 {
    public static void main(String[] args) {
        /**
         *  剖析LinkedList
         */
        LinkedList<Object> linkedList = new LinkedList<>();
        LinkedList<Object> linkedList1 = new LinkedList<>();
        Arrays.asList(new String[]{"1","2","3"});

        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        while(queue.peek()!=null){
            System.out.println(queue.poll());
        }
    }
}
