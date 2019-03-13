package everyday001;

import java.io.*;

/**
 * 缓冲流
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 * 缓冲字节输入输出流是一对高级流，使用他们可以加快读写效率
 * 高级流可以处理其他流，但是无论添加了多少高级流，最底下都要有低级流，
 * 因为低级流是真实读写数据的流，高级流都是处理数据的。
 * 高级流处理其他流就形成了流的链接，并且有效的组合不同的高级流可以得到叠加的效果
 */
public class BufferedIS {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("m.mp4");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("mm.mp5");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int d = -1;
        /**
         * 缓冲流内部有一个缓冲区，当bis.read方法读取第一个字节时，实际上bis会一次性读取一组字节
         */
        while ((d = bis.read())!=-1){
            bos.write(d);
        }
        System.out.println("复制完毕");
        bis.close();
        bos.close();
    }
}

/**
 * 缓冲输出流写出数据的缓冲区问题
 */
class BufferedOS{
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("hehe".getBytes("UTF-8"));
        // 强制将缓冲区中的字节一次性写出flush()
        bos.flush();
        System.out.println("写出完毕！！");
        bos.close();
    }
}
