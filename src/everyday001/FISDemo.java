package everyday001;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件输入流，是一个低级流，用于从文件中读取字节
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fis.txt");
        byte[] data = new byte[100];
        int len = fis.read(data);
        String str = new String(data,"UTF-8");
        System.out.println(str);
        fis.close();
    }
}
/** 流和文件的差异
 * 流和文件的差异：文件是数据的静态存储形式，而流是指数据传输时的形态
 * 说白了，区别就是数据存储形式的改变，文件是数据静态存储的样式
 * 流是数据动态行走的样式
 * io设备是数据流的最终走向，也是数据流的重点，，io设备为数据流提供原料
 */
class FISDemo1{
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\zouyang\\Desktop\\Java\\code\\TrafficLigth-简单的枚举结合switch分支.java");
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到，请检查文件");
        }

        //建立一个字节数组取数据，大小是1024byte

        byte[] b = new byte[1024]; //一下子能取到流里面1024个字节
        //存储取到的长度
        int data;

        //开始循环取数据了，只要fis.read(b)能读到数据，循环就不会结束，直到读不到数据了
        try {
            while((data=fis.read(b))>0)
            {
                System.out.println(new String(b,0,data));

            }
        } catch (IOException e) {
            System.out.println("出现异常");
        }
        // 这个只能打印出b数组最终没被覆盖掉的数据
        for(byte a : b)
        {
            System.out.println((char)a);
        }
    }
}