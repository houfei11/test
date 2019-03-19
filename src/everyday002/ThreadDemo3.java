package everyday002;

/**
 * 使用匿名内部类来完成方式1和方式2的创建
 */
public class ThreadDemo3{
    public static void main(String[] args) {
        // 方式1
        Thread t1 = new Thread(){
            public void run(){
                for (int i = 0; i < 10 ; i++) {
                    System.out.println("你是谁？");
                }
            }
        };
        t1.start();
        // 方式2
        new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("我是一名程序员！！");
            }
        }).start();
    }
}

/**
 * start Thread currentThread()
 * 获取运行当前方法的线程
 */
class ThreadDemo4{
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println("运行的当前线程是：" + main);
        dosome();
        Thread thread = new Thread(){
            public void run(){
                Thread thread1 = Thread.currentThread();
                System.out.println("自定义线程：" + thread1);
                dosome();
            }
        };
        thread.start();

    }
    public static void dosome(){
        Thread t = Thread.currentThread();
        System.out.println("dosome线程是：" + t);
    }
}

/**
 * 获取线程相关信息的方法
 */
class ThreadDemo5{
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        long id = main.getId();
        System.out.println("线程Id是：" + id);
        String name = main.getName();
        System.out.println("线程name是：" + name);
        int priority = main.getPriority();
        System.out.println("线程的优先级是：" + priority);
        boolean isAlive = main.isAlive();
        System.out.println("线程是否存活：" + isAlive);
        boolean isDaemon = main.isDaemon();
        System.out.println("是否为守护线程：" + isDaemon);
    }
}

/**
 * 线程的优先级
 */
class ThreadDemo6{
    public static void main(String[] args) {
        Thread min = new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 100 ; i++) {
                    System.out.println("min");
                }
            }
        };
        Thread max = new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 100 ; i++) {
                    System.out.println("max");
                }
            }
        };
        Thread norm = new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 100 ; i++) {
                    System.out.println("norm");
                }
            }
        };
        min.setPriority(Thread.MAX_PRIORITY);
        max.setPriority(Thread.NORM_PRIORITY);
        min.start();
        max.start();
        norm.start();
    }
}