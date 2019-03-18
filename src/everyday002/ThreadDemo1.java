package everyday002;

/**
 * 第一种创建线程的方法
 * 继承Thread并重写run方法来定义线程要执行的任务
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread th = new MyThread();
        Thread thread = new MyThread2();
        /**
         * 启动线程要指定start方法，而不是直接调用run方法，run方法是线程要执行的任务，当线程
         * 的start方法被调用后，线程进入runnable状态，一旦获取cpu时间，run方法会自动被调用
         */
        th.start();
        thread.start();
    }
}
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("请问你是谁啊！！");
        }
    }
}

/**
 * 第一种创建线程的方式有两个不足：
 * 1.由于java是单继承，那么当继承了Thread后就无法再继承其他类了
 * 2.由于继承Thread后重写run方法规定了线程执行的任务，这导致线程
 * 与任务有一个必然的耦合关系，不利于线程的重用
 */
class MyThread2 extends Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("我是送快递的，您的快递到了！！");
        }
    }
}

/**
 * 第二种创建线程的方法
 * 实现runnable接口重写run方法
 */
class ThreadDemo2{
    public static void main(String[] args) {
        Runnable rb = new MyRunnable();
        Runnable rb1 = new MyRunnable1();
        Thread thread = new Thread(rb);
        Thread thread1 = new Thread(rb1);
        thread.start();
        thread1.start();
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("你是哪位？");
        }
    }
}
class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.out.println("我是查水表的！！");
        }
    }
}