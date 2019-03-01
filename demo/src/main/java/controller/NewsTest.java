package controller;

import java.io.IOException;

/**
 * @author Administrator
 */
public class NewsTest {
    public static void main(String[] args) throws IOException {
        Deom18News news = new Deom18News("this关键字", "指代当前对象，哪个对象调用指的就是那个对象");
        System.out.println(news.display());
        Deom19FileNews news1 = new Deom19FileNews("我是哪个类？","子类");
        System.out.println(news1.display());
        String stu = "123";
        news1.read(stu);
        System.out.println(news1);
        news1.getTitle();
        System.out.println(news1);
        news1.getContent();
        System.out.println(news1);
    }
}


