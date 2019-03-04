package staticLx;
/**
 * static final常量的演示
 */
public class Demo10 {
    public static void main(String[] args) {
        System.out.println(Aoo1.PI); // 通过类名打点调用
        // Aoo.PI = 3014; 编译错误，常量不能被改变；常量所有字母建议都大写；

        // 编译时自动替换为具体的值 -- 效率高
        // 相当于System.out.println(5);
        System.out.println(Boo1.NUM);
        // 1.加载Boo.class到方法去中
        // 2.count保存在方法区中
        // 3.到方法去中获取count并输出
        System.out.println(Boo1.count);
    }
}
class Aoo1{
    public static final double PI = 3.1415926;
    //public static final double MIN; 编译错误，常量必须在声明的同时初始化；
}

/**
 *
 */
class Boo1{
    public static final int NUM = 5; // 常量
    public static int count = 8; // 静态变量
}