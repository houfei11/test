package everyday002;

/**
 * 同步块
 * @author Administrator
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        final Shop shop = new Shop();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                shop.buy();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                shop.buy();
            }
        };
        t1.start();
        t2.start();
    }
}
class Shop{
    public void buy(){
        //获取运行buy方法的线程
        Thread t = Thread.currentThread();
        try{
            System.out.println(t.getName() + "：正在挑衣服");
            Thread.sleep(5000);
            synchronized (this){
                System.out.println(t.getName() + "：正在试衣服");
                Thread.sleep(5000);
            }
            System.out.println(t.getName() + "：结账离开");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

/**
 * 静态方法的同步
 */
class SyncDemo03{
    public static void main(String[] args) {
        final Method m1 = new Method();
        final Method m2 = new Method();
        Thread thread = new Thread(){
            @Override
            public void run(){
                Method.dosome();
            }
        };
        Thread thread1 = new Thread(){
            @Override
            public void run(){
                Method.dosome();
            }
        };
    }
}
class Method{
    public synchronized static void dosome(){
        try{
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ": 正在运行method方法");
            Thread.sleep(5000);
            System.out.println(t.getName() + ": method方法结束");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
