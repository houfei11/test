package practice;

import java.io.File;
import java.io.IOException;

/**
 * 创建一个文件
 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        /**
         *  在当前目录下创建文件
         */
        File file = new File("test.txt");
        /**
         * 判断该文件是否真实存在
         */
        if (!file.exists()){
            file.createNewFile();
            System.out.println("创建完毕");
        } else {
            System.out.println("该文件已存在");
        }
    }
}

/**
 * 删除文件
 */
class FileDemo3{
    public static void main(String[] args) {
        /**
         * 删除当前目录中的test文件
         */
        File file = new File("test.txt");
        if (file.exists()){
            file.delete();
            System.out.println("删除完毕");
        }else{
            System.out.println("文件不存在");
        }
    }
}

/**
 * 创建一个新目录
 */
class FileDemo4{
    public static void main(String[] args) {
        /**
         * 在当前目录下创建一个名为demo的目录
         */
        File file = new File("demo");
        if (!file.exists()){
            file.mkdir();
            System.out.println("创建目录完毕");
        }else{
            System.out.println("该目录已经存在");
        }
    }
}

/**
 * 创建一个多级目录
 */
class FileDemo5{
    public static void main(String[] args) {
        /**
         * 在当前目录下创建
         * ./a/b/c/d/e/f目录
         */
        File file = new File("a"+File.separator+"b"+File.separator+
                "c"+File.separator+"d"+File.separator +"e"+File.separator);
        if (!file.exists()){
            /**
             * mkdirs()在创建当前目录的同时将所有不存在的父目录一起创建出来
             */
            file.mkdirs();
            System.out.println("创建完毕");
        }else{
            System.out.println("目录已存在");
        }
    }
}

/**
 * 删除目录
 */
class FileDemo6{
    public static void main(String[] args) {
        /**
         * 删除当前目录
         */
        File file = new File("test.txt");
        if (file.exists()){
            /**
             * delete方法可以删除一个目录，但是前提条件这个目录必须是一个空目录
             */
            file.delete();
            System.out.println("删除完毕");
        }else{
            System.out.println("该目录不存在");
        }
    }
}

/**
 * 删除目录中的所有子项
 */
class FileDemo7{
    public static void main(String[] args) {
        /**
         * 获取当前所有子项
         */
        File file = new File(".");
        /**
         * boolean isFile()
         * 判断是否为一个文件
         * boolean isDirectory
         * 判断是否为一个目录
         */
        if (file.isDirectory()){
            /**
             *  FIle[] listFile  获取所有子项
             */
            File[] sub = file.listFiles();
            for (File subs: sub) {
                if (subs.isFile()){
                    System.out.println("文件：");
                }else{
                    System.out.println("目录：");
                }
                System.out.println(subs.getName());
            }
        }
    }
}

/**
 * 实现方法，来删除给定的文件和目录
 */
class Test{
    public static void main(String[] args) {
        File dir = new File("a");
        delete(dir);
    }
    public static void delete(File file){
        if (file.isDirectory()){
            // 将所有子项删除
            File[] subs = file.listFiles();
            for (File ss : subs) {
                delete(ss);
            }
        }
        file.delete();
    }
}