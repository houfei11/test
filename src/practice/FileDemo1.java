package practice;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * java.io.File
 * File 的没每一个实例可以表示文件系统中的一个文件或者目录
 * 使用File可以：
 * 1.访问文件或者目录的属性
 * 2.操作文件或者目录
 * 3.访问目录中的所有内容
 * 但是不可以访问文件数据
 */
public class FileDemo1 {
    public static void main(String[] args) {
        File file = new File("." + File.separator + "demo.txt");
        // 获取文件名
        String name = file.getName();
        System.out.println("name:"+name);
        // 大小（占用的字节量）
        long length = file.length();
        System.out.println("文件大小：" + length);
        // 是否为文件
        boolean isFile = file.isFile();
        System.out.println("是文件：" + isFile);
        // 是否为目录
        boolean isDir = file.isDirectory();
        System.out.println("是目录：" + isDir);
        // 是否是隐藏文件
        boolean isHidden = file.isHidden();
        System.out.println("是否为隐藏文件：" + isHidden);
        // 文件最后修改时间
        long time = file.lastModified();
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日 HH:mm:ss");
        System.out.println(sdf.format(date));
        // 是否可写
        boolean canWrite = file.canWrite();
        System.out.println("可写：" + canWrite);
    }
}

/**
 * 二进制
 * 计算机内部只二进制的数据，在显示的时候编程语言提供的API将2进制转换成10进制显示出来
 */
class Demo2{
    public static void main(String[] args) {
        int n = 45;
        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));
    }
}

/**
 * 十进制转换成二进制
 */
class TestOne{
    public static void main(String[] args) {
        System.out.println("请输入十进制的数据：");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("此十进制的二进制数据为：");
        tenToTwo(num);
    }
    public static void tenToTwo(int data) {
        if(data==1||data==0) {
            System.out.print(data);
        }else {
            tenToTwo(data/2);
            System.out.print(data%2);
        }
    }
}

