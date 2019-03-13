package everyday001;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * 使用文件流复制文件
 * @author Administrator
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        /**
         * 使文件输入流读取原文件，再使用
         * 文件输出流向目标文件中，顺序从源文件中读取每个字节并写入到目标文件即可完成复制
         */
        FileInputStream str = new FileInputStream("F:\\Word文档\\back.doc");
        FileOutputStream fos = new FileOutputStream("F:\\Word文档\\add.doc");
        byte[] but = new byte[1024*10];
        int len = -1;
        while ((len = str.read(but))!=-1){
            fos.write(but,0,len);
        }
        System.out.println("复制文件完成");
        str.close();
        fos.close();
    }
}
/**
 * 小练习：将集合中的数据储存到文本
 */
class CopyDemo1{
    public static void main(String[] args) throws IOException {
        // 封装数据源(创建集合对象)
        ArrayList<String> str = new ArrayList<String>();
        // 储存数据
        str.add("HELLO");
        str.add("world");
        str.add("java.io");
        /**
         * ArrayList集合中存储的是字符串。
         * 遍历ArrayList集合,把数据获取到。
         * 然后存储到文本文件中。
         * 文本文件说明使用字符流。
         */
        // 封装目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
        // 遍历
        for (String s : str) {
            // 写出数据
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        // 释放资源
        bw.close();
    }
}

/**
 * 将文件中的数据储存到集合中
 * 数据源是文本文件。
 * 目的地是一个集合。
 * 而且元素是字符串
 */
class CopyDemo2{
    public static void main(String[] args) throws IOException {
        // 封装数据源
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));

        // 封装目的地(创建集合对象)
        ArrayList<String> array = new ArrayList<String>();

        // 读取数据存储到集合中
        String line = null;
        while ((line = br.readLine()) != null) {
            array.add(line);
        }

        // 释放资源
        br.close();

        // 遍历集合
        for (String s : array) {
            System.out.println(s);
        }
    }
}
/**
 * 需求：我有一个文本文件中储存了几个名称，写一个程序随机获得一个人的名字
 * 分析：
 * 1.先把文本文件中的数据储存到集合中
 * 2.随机产生一个所以
 * 3.根据该索引获取一个值
 */
class CopyDemo3{
    public static void main(String[] args) throws IOException {
        // 把文本中的数据储存到集合中
        BufferedReader br = new BufferedReader(new FileReader("add.doc"));
        ArrayList<String> arrayList = new ArrayList<>();
        String line = null;
        while ((line = br.readLine()) != null){
            arrayList.add(line);
        }
        // 随机产生一个索引
        Random r = new Random();
        int index = r.nextInt(arrayList.size());
        // 根据索引获取一个值
        String name = arrayList.get(index);
        System.out.println("幸运用户是：" + name);
    }
}
/**
 * 复制单级文件夹案例
 * 需求：复制单机文件夹(复制文件夹所有的文件到另一个文件夹中)
 * 分析:
 * 封装目录
 * 获取该目录下的所有文件的File数组
 * 遍历该File数组,得到每一个File对象
 * 把该File进行复制
 */
class CopyDemo4{
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("e:\\demo");
        // 封装目的地
        File destFolder = new File("e:\\test");
        // 如果目的地的文件夹不存在,就创建
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }
        // 获取该目录下的所有文件的File数组
        File[] fileArray = srcFolder.listFiles();

        // 遍历该File数组,得到每一个File对象
        for (File file : fileArray) {
            // System.out.println(file);
            // 数据源:e:\\demo\\e.mp3
            // 目的地:e:\\test\\e.mp3
            String name = file.getName();// e.mp3
            File newFile = new File(destFolder, name);// e:\\test\\e.mp3

            copy(file, newFile);
        }
    }
    public static void copy(File file, File newFile) throws IOException {
        // 数据源
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                file));
        // 目的地
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(newFile));
        // 读写数据
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        // 释放资源
        bos.close();
        bis.close();
    }
}