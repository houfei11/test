package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * SimpleDateFormat
 * 根据一个给定的日期类型格式将String与Date相互转换
 */
public class Demo31 {
    public static void main(String[] args) throws ParseException {
        // 当前系统时间
        Date now = new Date();
        System.out.println(now);

        SimpleDateFormat def = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ser = def.format(now);
        System.out.println(ser);
        Test01();
        Test02();
    }

    /**
     * 查看当前时间和以后时间
     */
    public static void Test01(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
        //计算16天5小时23分40秒以后的日期
        long time = date.getTime();
        time += 1000*60*60*24*16;
        time += 1000*60*60*5;
        time += 1000*60*23;
        time += 1000*40;
        date.setTime(time);
        System.out.println(simpleDateFormat.format(date));
    }
    /**
     *从字符串转换时间
     */
    public static void Test02() throws ParseException {
        String string = "2019-03-06 20:08:10";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(string);
        System.out.println(date);
    }

    /**
     * 要求用户输入自己的生日，格式为****
     * 到今天一共活了多少天
     */
    public static void Test03() throws ParseException {
        System.out.println("请输入自己的生日");
        Scanner scan = new Scanner(System.in);
        String birStr = scan.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date birth = simpleDateFormat.parse(birStr);
        // 计算已经活了多少天
        Date now = new Date();
        long time = now.getTime() - birth.getTime();
        time = time/1000/60/60/24;
        System.out.println("恭喜您！到今天一共活了" + time + "天！");
    }
}
