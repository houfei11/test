package everyday002;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * 线程池，有两个作用：1.重用线程 2.控制线程数量
 * @author Administrator
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5 ; i++) {
            Runnable runn = new Runnable() {
                @Override
                public void run() {
                    Thread t = Thread.currentThread();
                    try{
                        System.out.println(t + "正在执行任务！！");
                        Thread.sleep(5000);
                        System.out.println(t + "执行任务结束！！");
                    }catch(Exception e){
                        System.out.println("线程被中断了！！");
                    }
                }
            };
            threadPool.execute(runn);
            System.out.println("指派一个任务交给线程池");
        }
        // 线程走完终止
//        threadPool.shutdown();
        // 线程立刻终止
        threadPool.shutdownNow();
        System.out.println("停止线程池了！！");
    }
}

/**
 * 小练习，需求：创建两个线程，其中一个输出1-52，另外一个输出A-Z，输出格式要求：12A 34B。。。
 */
class ThreadPoolDemo1{
    public static void main(String[] args) {
        Object lock = new Object();
        Thread t1 = new Thread(new out1(lock));
        Thread t2 = new Thread(new out2(lock));
        t1.start();
        t2.start();
    }
}
class out1 implements Runnable{
    private Object lock;
    public out1(Object lock){
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 1; i < 52; i += 2) {
//            对Lock对象上锁
            synchronized (lock) {
                System.out.print(i);
                System.out.print(i + 1);
                try {
//                    先释放等待的线程 再进入等待状态
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class out2 implements Runnable{
    private Object lock;

    public out2(Object lock) {
        this.lock = lock;
    }
    @Override
    public void run() {
        char[] chars = new char[]{'A', 'B', 'C', 'D', 'E', 'F',
                'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
                'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i=0;i<chars.length;i++) {

            synchronized (lock) {
                System.out.println(chars[i]);

                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

/**
 * 多线程小练习，需求：多个人通过一个山洞，这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
 */
class ThreadPoolDemo2 implements Runnable{
    int num = 0;
    @Override
    public void run() {
        synchronized (this){
            try{
                Thread.sleep(5000);
            }catch(Exception e){
                e.printStackTrace();
            }
            num++;
            System.out.println(Thread.currentThread().getName() + "第：" + num + "名");
        }
    }
}
class ThreadPoolDemo2Test{
    public static void main(String[] args) {
        System.out.println("开始进入山洞。。。");
        ThreadPoolDemo2 run = new ThreadPoolDemo2();
        new Thread(run,"奥特曼").start();
        new Thread(run,"蝙蝠侠").start();
        new Thread(run,"蜘蛛侠").start();
        new Thread(run,"绿巨人").start();
        new Thread(run,"美国队长").start();
        new Thread(run,"钢铁侠").start();
        new Thread(run,"绯红女巫").start();
    }
}