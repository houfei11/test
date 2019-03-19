package everyday002;

/**
 * 多线程并发
 * @author Administrator
 */
public class SyncDemo1 {
    public static void main(String[] args) {
        final Table table = new Table();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                while(true){
                    int bean = table.getBeans();
                    Thread.yield();
                    System.out.println(getName()+""+bean);
                }
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run(){
                while(true){
                    int bean = table.getBeans();
                    Thread.yield();
                    System.out.println(getName()+""+bean);
                }
            }
        };
        t1.start();
        t2.start();
    }
}
class Table{
    // 桌子上有20个豆子；
    private int beans = 20;
    public synchronized int getBeans(){
        if (beans == 0){
            throw new RuntimeException("桌子上没有豆子了");
        }
        Thread.yield();
        return beans--;
    }
}