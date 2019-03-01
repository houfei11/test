package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 创建新闻类
 *
 * @author Administrator
 */
public class Deom19FileNews extends Deom18News {

    public Deom19FileNews() {}

    public Deom19FileNews(String title, String content) {
        super(title, content);
    }

    public void read(String url) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(url)));
            // 读取title(标题)
            title = reader.readLine();
            // 跳过空行
            reader.readLine();
            // 读取content(内容)
            content = reader.readLine();
        } catch (IOException e) {
            System.out.println("新闻读取出错");
        }
    }

    @Override
    public String display() {
        return super.display() + "from 子类";
    }
}

