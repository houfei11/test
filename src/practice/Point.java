package practice;

/**
 * 泛型 又称参数化类型 是将当前类的属性的类型，方法参数的类型以及方法的返回值类型移交给使用者
 */
public class Point<T> {
    private T x;
    private T y;

    public Point() {
    }

    public Point(T x, T y){
        super();
        this.x = x;
        this.y = y;
    }
    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
