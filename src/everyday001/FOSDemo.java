package everyday001;

import java.io.*;

/**
 * 流
 * 流根据方向的不同划分为输入流和输出流，参照点为当前程序
 * 输入流用来读取数据java.io.InputStream
 * 抽象类，定义了输入流的读取字节法，所有的字节流都继承它
 * java.io.OutputStream是所有字节输出流的父类
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("Fos.txt");
        String str = "我爱北京天安门";
        /**
         * String——>byte[]
         * getBytes
         * 按照给定的字符级转换成一组字节
         */
        byte[] data = str.getBytes("UTF—8");
        fos.write(data);
        System.out.println("写出完毕！！");
        fos.close();
    }
}

/**
 * 追加写操作
 * 创建FOS，若指定第二个参数，并且该值为true时，则追加写操作，那么本次通过FOS写出的内容被最佳到文件末尾
 */
class FOSDemo1{
    public static void main(String[] args) throws IOException {
        FileOutputStream oms = new FileOutputStream("muse.txt");
        oms.write("我喜欢加班，我热爱工作".getBytes("UTF-8"));
        System.out.println("");
        oms.close();
    }
}
class FOSDemo2{
    public static void main(String[] args) {
        String path = "C:\\Users\\Administrator\\Desktop\\import";
        String path1 = "F:\\file1\\import";
        // 创建文件对象
        File f = new File(path);
        File f1 = new File(path1);

        long t1 = System.currentTimeMillis();
        byte[] str = readFile(f);
        writeFile(f1, str);
        long t2 = System.currentTimeMillis();
        System.out.println("复制完成！耗时：" + (t2 - t1) + "ms");

    }
    public static void writeFile(File f, byte[] bs) {
        try {
            // 根据文件对象建立文件输出流
            // 参数1：要写入数据的文件路径
            // 参数2：是否将数据追加到文件末尾
            FileOutputStream fos = new FileOutputStream(f, false);
            // 将输出流包装成缓冲输出流
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            // 使用缓冲流将数组写入输出流
            bos.write(bs);

            // 强制将管道中的数据输出到目标，保证数据写完整
            bos.flush();
            // 关闭输出流
            fos.close();

        } catch (Exception ef) {
            ef.printStackTrace();
        }
    }

    /**
     * 读取文件数据的方法
     * 要读读取的文件路径
     * @param f
     *
     */
    public static byte[] readFile(File f) {
        try {
            // 根据文件建立建立文件输入流
            FileInputStream fis = new FileInputStream(f);
            // 将文件输入流打包成缓冲输入流
            BufferedInputStream bis = new BufferedInputStream(fis);

            int len = bis.available();// 得到流中的字节数
            // 方式一：通过流的长度决定读的次数
            // while(len>0){
            // //读取流中的一个字节
            // int b = fis.read();
            // System.out.println("字节:"+b);
            // len = fis.available();
            // }

            byte[] bs = new byte[len];

            // 方式二，通过读取的字节判断读取的次数〉若为-1，就结束
            // int i=0;
            // int b = fis.read();
            // while(b!=-1){
            // System.out.println("字节:"+b);
            // //将字节保存到字节数组
            // bs[i]=(byte)b;
            // i++;
            //
            // b = fis.read();
            // }

            // 方式三：直接将数据读取到字节数组，数组有多大，就读取多少次
            bis.read(bs);
            fis.close();

            return bs;

        } catch (Exception ef) {
            ef.printStackTrace();

        }

        return null;

    }
}

/**
 * 复制出一个新文件
 */
class FOSDemo3{
    private static final String FILE_PATH = "F:\\javashop\\IOTest\\src\\file.txt";
    private static final String FILE_DIRECTORY = "F:\\javashop\\IOTest\\src\\";
    public static void main(String[] args) {
        File file = new File(FILE_PATH);
        File newFile = new File(FILE_DIRECTORY+"newFile.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(newFile);
            byte[] bytes = new byte[26];    //定义一个26字节长的数组
            int length = 0;
            System.out.println("=====生成文件开始=====");
            long startTime = System.currentTimeMillis();
            while ((length = fis.read(bytes, 0, bytes.length)) != -1) {
                //一次写入一个数组
                fos.write(bytes);
                fos.flush();
            }
            System.out.println("耗时:"+String.valueOf(System.currentTimeMillis()-startTime)+"ms.");
            System.out.println("=====生成文件结束=====");
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
