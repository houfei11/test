package everyday001;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 对象流：
 * 对象流是一组高级流，作用是方便读写java中的对象.
 * java.io.ObjectOutputStream
 * 对象输出流，可以将给定的对象转换成为一组字节后写出
 * @author Administrator
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        Person person = new Person();
        person.setName("小强");
        person.setAge(20);
        person.setGender("女");
        List<String> other = new ArrayList<>();
        other.add("是一名销售人员");
        other.add("是一位漂亮美女");
        other.add("是一位讲师");
        person.setOtherInfo(other);
        FileOutputStream fos = new FileOutputStream("xxx.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        /**
         * ObjectOutputStream的writeObject方法可以将给定对象转换成为一组字节后写出，
         * 这些字节比该对象实际内容要大，因为除了数据外还有结构等描述信息
         *
         * 下面的代码实际上经理了两个操作：
         * 1：oos将Person对象转换成一组字节。
         *    将一个对象转换成一组字节的过程称为：对象序列化
         * 2：再通过fos将这组字节写入到硬盘。
         *    将该对象转换成的字节写入到硬盘做持久保存的过程称为：对象持久化
         */
        oos.writeObject(person);
        System.out.println("写出完毕！！！");
        oos.close();
    }
}

/**
 * 字符流
 * 字符流的读写单位为字符。字符流都是高级流，虽然以字符为单位读写数据
 * 但实际底层还是读写字节，只是从字节与字符的转换工作交给了字符流来完成
 * java.io.Reader:字符输入流的顶级父类
 * java.io.writer:字符输出流的顶级父类
 *
 * 转换流
 * java.io.OutputStreamWriter 特点是可以按照指定的字符集写出字符
 */
class OSWDemo{
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        osw.write("sssssss");
        osw.write("bbbbbbb");
        System.out.println("写出完毕！！！");
        osw.close();
    }
}

/**
 * java.io.InputStreamReader
 * 字符输入流，可以按照给定的字符集读取字符
 */
class ISRDemo{
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        int d = -1;
        while((d = isr.read()) != -1){
            System.out.println((char) d);
        }
    }
}

/**
 * 缓冲字符流
 * BufferedWriter ，BufferedReader
 * 特点：可以按行读写字符串
 * java.io.PrintWriter
 * 具有自动行刷新的缓冲字符输出流
 * 创建PW时，它一定会在内部创建BufferedWriter 作为缓冲功能的叠加
 */
class PWDemo{
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        /**
         * 提供了多种构造方法，其中有两个可以对文件进行写出操作的构造方法：
         * PrintWriter(File file)
         * PrintWriter(String path)
         */
        PrintWriter pw = new PrintWriter("ps.txt","UTF-8");
        pw.println("天天加班到很晚");
        pw.println("人生仿佛到高潮");
        System.out.println("写出完毕！！");
        pw.close();
    }
}

/**
 * PrintWriter 也提供了可以处理其他流的构造方法
 * 提供的方法可以传入字节流，也可以处理字符流，并且，当使用这类构造方法时，可以再传入第二个参数，该参数为boolean值，该值为true时，
 * 具有自动刷新功能
 */
class PWDemo2{
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        FileOutputStream fos = new FileOutputStream("psw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        PrintWriter pw = new PrintWriter(osw);
        pw.println("hehe");
        pw.println("heihei");
        System.out.println("写出完毕！！！");
        pw.close();
    }
}






