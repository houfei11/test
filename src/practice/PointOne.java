package practice;

/**
 * 该类用作集合的元素
 */
public class PointOne implements Comparable<PointOne>{
    private int x;
    private int y;

    public PointOne() {
    }

    public PointOne(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "PointOne{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    /**
     * 该方法的作用是定义当前对象与给定参数对象比较大小的规则
     * 返回值为一个int值，该值表示大小关系，它不关注具体的取值是多少
     * 而关注的是取值范围，当返回值>0时：当前对象比参数对大 <0时小  =0时相等
     * @param o
     * @return
     */
    @Override
    public int compareTo(PointOne o) {
        /**
         * 比较规则，点到原点的距离长的大
         */
        int len = this.x*this.x + this.y*this.y;
        int Olen = o.x*o.x + o.y*o.y;

        return len - Olen;
    }
}
