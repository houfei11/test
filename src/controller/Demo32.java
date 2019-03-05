package controller;

import java.util.Date;

/**
 * Date的每一个实例用于表示确切的一个时间点
 */
public class Demo32 {
    public static void main(String[] args) {
        /**
         * 使用默认构造方法创建的Date表示当前的系统时间
         */
        Date nou = new Date();
        System.out.println(nou);
        /**
         * Date的大部分方法建议不要使用了
         */
        nou.toGMTString();
        /**
         *  获取Date内部获取的long值
         */
        long time = nou.getTime();
        System.out.println(time);
        // 明天这一刻的毫秒值
        time += 1000*60*60*24;
        nou.setTime(time);
    }
}
