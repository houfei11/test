package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFIle
 * 用来读写文件数据
 * RAF是基于指针进行读写的，即可以读取文件数据也可以向文件写入数据
 */
public class RandomAccessFIleDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./xxx.txt");
        /**
         * RandomAccessFile(String path,String mode)
         * RandomAccessFile(File file,String mode)
         * 第二个参数为模式：常用的有
         * r：只读模式
         * rw：读写模式
         */
        RandomAccessFile rdf = new RandomAccessFile(file,"rw");
        /**
         *  void write(int d)
         *  写出给定的int值对应的2进制的低八位
         */
        rdf.write(1);
        System.out.println("写出完毕！");
        rdf.close();

    }
}

/**
 * 读取文件数据
 */
class RandomAccessFIleDemo2{
    public static void main(String[] args) throws IOException {
        RandomAccessFile rdf = new RandomAccessFile("rdf.dat","r");
        /**
         * int read()
         * 读取一个字节，并以10进制的int类型返回
         * 若返回值为-1，则表示读取到了文件末尾
         */
        int d = rdf.read();
        System.out.println(d);
        rdf.close();
    }
}

/**
 * RAF提供了方便读写基本类型数据的方法
 */
class RandomAccessFIleDemo3{
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("rad.dat","rw");
        /**
         * long getFilePointer()
         * 获取当前RAF的指针位置
         */
        System.out.println("pos:" + raf.getFilePointer());
        /**
         * void seek(long pos)
         * 移动指针到指定位置
         */
        raf.seek(0);
        int i = raf.readInt();
        System.out.println(i);
        raf.seek(8);
        long L = raf.readLong();
        System.out.println(L);
        //向文件中写入一个int最大致
        int max = Integer.MAX_VALUE;
        raf.write(max>>>24);
        raf.write(max>>>16);
        raf.write(max>>>8);
        raf.write(max);
        raf.writeInt(max);
        raf.writeLong(1234L);
        raf.writeDouble(123.123);
        int d = raf.read();

    }
}

