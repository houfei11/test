package everyday001;

import java.io.*;
import java.util.Scanner;

/**
 * 完成记事本功能
 * 要求：
 * 程序启动后，要求用户输入一个文件名，然后创建该文件，之后提示用户开始输入内容
 * 并将用户输入的每一行内容都按行写入该文件，当用户输入"exit"时，退出程序
 */
public class Note {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名：");
        String fileName = scan.nextLine();
        FileOutputStream fos = new FileOutputStream(fileName);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        // 自动行刷新
        PrintWriter pw = new PrintWriter(osw,true);
        System.out.println("请您开始输入内容：");
        String lien = null;
        while(true){
            // nextLine()方法，可以扫描一行内容并作为一个字符串而被获取到
            lien = scan.nextLine();
            if("exit".equals(lien)){
                System.out.println("再见！！");
                break;
            }
            /**
             * 若PrintWriter具有自动刷新功能，那么
             * 每当调用printIn方法后就会自动刷新flush()
             */
            pw.println(lien);
        }
        pw.close();
    }
}

/**
 * java.io.BufferedReader
 * 缓冲字符输入流，特点：按行读取字符串
 */
class BRDemo{
    public static void main(String[] args) throws IOException {
        // 读文件（字节流）
        FileInputStream fis = new FileInputStream("G:\\workspace\\javademo\\src\\everyday001\\Note.java");
        // 字符输入流
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        /**
         * BufferedReader提供了按行读取方法：
         * String readLine()  连续读取若干字符，直到读取到换行符为止，
         * 并将换行符之间读取的字符以一个字符串返回。
         * 注意：该字符串不包含最后的换行符
         */
        String line = null;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}