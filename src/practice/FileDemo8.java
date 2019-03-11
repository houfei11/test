package practice;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 获取一个目录中符合条件的子项
 *  使用重载的ListFiles方法，需要传入一个额外的文件过滤器
 *  文件过滤器是一个接口：FileFilter
 */
public class FileDemo8 {
    public static void main(String[] args) {
        File file = new File(".");
        /**
         * 获取名字以"."开头的子项
         */
        File[] subs = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                System.out.println("正在过滤：" + dir.getName());
                return dir.getName().startsWith(".");
            }
        });
        for (File sub:subs){
            System.out.println(sub.getName());
        }
    }
}
