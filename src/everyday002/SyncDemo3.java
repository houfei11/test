package everyday002;

/**
 * 互斥锁
 * synchronized
 * @author Administrator
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        final Test test = new Test();
        Thread t1 = new Thread(){
            @Override
            public void run(){
            test.methodA();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
            test.methodB();
            }
        };
    }
}
class Test{
    public synchronized void methodA(){
        try{
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ": 运行A方法");
            Thread.sleep(5000);
            System.out.println(t.getName() + ": 运行A方法结束");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public synchronized void methodB(){
        try{
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ": 运行B方法");
            Thread.sleep(5000);
            System.out.println(t.getName() + ": 运行B方法结束");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}