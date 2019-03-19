package everyday002;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * static void sleep(long ms)
 * 线程提供的静态方法sleep可以使运行该方法的线程进入阻塞状态指定毫秒，超时后线程会主动进入Runnable状态
 * @author Administrator
 */
public class ThreadDemo7 {
    public static void main(String[] args) {
//        while (true){
//            System.out.println("你好！！");
//            try{
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        while (true){
            System.out.println("当前时间为：" + sdf.format(new Date()));
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

/**
 * 守护线程
 */
class ThreadDemo8{
    public static void main(String[] args) {
        //  前台线程
        Thread rose = new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 10 ; i++) {
                    System.out.println("rose: let me go");
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("rose: 啊啊啊啊啊啊啊啊AAAAAAaaaaa......");
                System.out.println("音效：噗通！！");
            }
        };
        Thread jack = new Thread(){
            @Override
            public void run(){
                while(true){
                    System.out.println("jack: you jump I jump");
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){

                    }
                }
            }
        };
        // 设置后台线程，并且要在start前调用
        jack.isDaemon();
        rose.start();
        jack.start();
        System.out.println("main: 方法结束了");
    }
}

/**
 *  join方法，可以使该方法的线程进入阻塞状态
 */
class ThreadDemo9{
    public static boolean isFinish = false;
    public static void main(String[] args) {
        final Thread download = new Thread(){
            @Override
            public void run(){
                System.out.println("图片开始下载：");
                for (int i = 0; i < 100 ; i++) {
                    System.out.println("down"+i+"%");
                    try{
                        Thread.sleep(100);
                    }catch(InterruptedException e){
                    }
                }
                System.out.println("down: 图片下载完成！！！");
                isFinish =true;
            }
        };
        Thread show = new Thread(){
            @Override
            public void run(){
                System.out.println("show:图片开始下载！");
                try{
                    download.join();
                }catch(InterruptedException e){
                }
                if (!isFinish){
                    throw new RuntimeException("图片没有下载完成");
                }
                System.out.println("show:图片下载完毕！！");
            }
        };
        download.start();
        show.start();
    }
}
