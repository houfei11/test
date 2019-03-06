package staticLx;

/**
 *  需求：计算相同周长不同形状的面积；
 */
public class Demo28 {
    public static void main(String[] args) {
        //new Car(); 编译错误；原因:抽象类不能被实例化，但可以声明变量
//        Shape s = new Square();
//        s.area(5);
//        System.out.println(s);
        // 需求：给出一个图形，找出这个图形的最大面积
        Shape[] ssh = new Shape[9];
        ssh[0] = new Square(1);
        ssh[1] = new Square(2);
        ssh[2] = new Square(3);
        ssh[3] = new Circle(1);
        ssh[4] = new Circle(2);
        ssh[5] = new Circle(3);
        ssh[6] = new six(1);
        ssh[7] = new six(2);
        ssh[8] = new six(3);
        maxArea(ssh);
    }
    private static void maxArea(Shape[] ssh){
        // 假设最大值是ssh[0]
        double max = ssh[0].area();
        int maxIndex = 0;
        for (int i = 1; i < ssh.length ; i++) {
            double are = ssh[i].area();
            if (are > max){
                max = are;
                maxIndex = i;
            }
        }
        System.out.println("最大面积为：" + max + ",所在下下标为" + maxIndex);
    }
}
// Java不建议写空方法

/**
 * 抽象类：由abstract修饰，包含抽象方法的类都必须是抽象类，抽象类不能被实例化
 * 抽象类是需要被继承的，子类：(1)也声明为抽象 --- 不常用(2)重写所有抽象方法
 * 意义：为其子类提供一个公共的类型，封装子类中的重复内容()
 */
abstract class Shape{ //图形类  抽象类 -- 不完整
    public double c;
    // 由abstract修饰的方法为抽象方法，只有方法的定义，没有方法的实现(没有大括号)
    public Shape(double c){
        this.c = c;
    }
    abstract double area();
}
class Square extends Shape{
    public Square(double c) {
        super(c);
    } //方形类
    @Override
    double area(){ // 重写抽象方法-- 不完整变完整
        return 0.0625*c*c;
    }
}
class Circle extends Shape{
    public Circle(double c) {
        super(c);
    } //圆形类
    @Override
    double area(){
        return 0.0796*c*c;
    }
}
class six extends Shape{
    public six(double c) {
        super(c);
    } //六边形类
    @Override
    double area(){
        return 0.0721*c*c;
    }
}
/**
 *  定义汽车类
 */
abstract class Car{
    void run(){
        System.out.println("我是启动方法");
    }
    abstract void stop();
}