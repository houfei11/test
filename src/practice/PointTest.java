package practice;

/**
 * 测试类
 * @author Administrator
 */
public class PointTest {
    public static void main(String[] args) {
        Point<Integer> p = new Point<Integer>(1,2);
        p.setX(2);
        int x1 = p.getX();
        System.out.println(x1);
        Point<Double> point = new Point<Double>(1.1,2.2);
        point.setX(2.2);
        double x2 = point.getX();
        System.out.println(x2);
        Point<String> point1 = new Point<>("ming","tian");
        point1.setX("tian");
        String str = point1.getX();
        System.out.println(str);
    }
}

/**
 * 泛型的原型是Object  当我们获取一个泛型的值时，会自动类型转换
 */
class PointTest2{
    public static void main(String[] args) {
        /**
         * 这里指定泛型的实际类型为Integer
         * 但实际上，创建的Point对象中，x和y的属性是Object类型，
         */
        Point<Integer> point = new Point<Integer>(1,2);
        /**
         * 由于参数是T   这里会验证实参是否为Integer，若不是则编译失败
         */
        point.setX(2);
        /**
         * 获取时会自动造型，这里不需要类型转换
         */
        int x1 = point.getX();
        System.out.println(x1);
        Point p2 = point;
        p2.setX("--------");
        String x2 = (String)p2.getX();
        System.out.println(x2);
    }
}
