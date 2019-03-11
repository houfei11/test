package practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 复制文件
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        /**
         * 创建一个RAF读取文件，再创建一个RAF向目标文件中写出
         * 顺序从原文件中读取每一个字节并写入到目标文件中
         */
        RandomAccessFile src = new RandomAccessFile("music.mp3","r");
        RandomAccessFile desc = new RandomAccessFile("music_cp.mp3","rw");
        // 用来保存读取的每个字节
        int d = -1;
        long start = System.currentTimeMillis();
        while((d = src.read())!= -1){
            desc.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕！耗时：" + (end-start) + "ms");
        src.close();
        desc.close();
    }
}

/**
 * 若想提高读写效率，可以通过提高每次读写数据量来减少读写次数达到
 */
class CopyDemo2{
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("m.mp4","r");
        RandomAccessFile desc = new RandomAccessFile("m_cp.mp4","rw");
        /**
         * int read(byte[] date)
         * 一次性尝试取给定的字节数组总长度的字节量并存入到该数组中，返回值为实际读取到的字节量，
         * 若返回值为-1，则表示本次没有读到的任何数据
         */
        //10k
        byte[] buf = new byte[1024*10];
        int len = -1;
        long start = System.currentTimeMillis();
        while ((len = src.read(buf))!= -1){
            /**
             * void write(byte[] data)
             * 一次性将给定的字节数组中的所有字节写出
             */
            desc.write(buf,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕！");
        System.out.println("耗时：" + (end-start) + "ms");
        src.close();
        desc.close();
    }

}
