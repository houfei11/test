package practice;

import java.util.Objects;

/**
 * 当一个类的实例作为HashMap的Key时，它的equals方法与hashcode方法的重写直接影响散链表的查询性能
 *
 */
public class Key {
    private int x;
    private int y;

    public Key() {
    }

    public Key(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return x == key.x &&
                y == key.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
