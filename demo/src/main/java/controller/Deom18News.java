package controller;

/**
 * 继承，继承可以理解为一个对象从另一个对象获取属性的过程。
 * 在Java中，类的继承是指在一个现有类的基础上构建一个新的类，构建出来的新类被称作子类，现有的类被称作父类，
 * 子类会自动地拥有父类所有可继承的属性和方法。
 * @author Administrator
 * 新闻类
 */
public class Deom18News {
    /**
     * 可被子类访问
     */
    protected String title;
    protected String content;
    /**
     * 无参构造器
     */
    public Deom18News(){}
    public Deom18News(String title, String content) {
        this.title = title;
        this.content = content;
    }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }

    /**
     * 显示方法
     * @return
     */
    public String display() {
        return title + "\n" + content;
    }
}
