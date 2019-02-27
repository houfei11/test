package entity.data;

/**
 * @author Administrator
 */
public class Rectangle {
    /**
     * 定义长宽属性
     */
    private int iwidth;
    private int iHeight;

    /**
     * 构造器1
     */
    public Rectangle(){
        super();
        this.iwidth = 1;
        this.iHeight = 1;
    }
    /**
     * 构造器2
     */
    public Rectangle(int index){
        this.iwidth = index;
        this.iHeight = index;
    }
    /**
     * 构造器3
     */
    public Rectangle(int iwidth, int iHeight){
        this.iwidth = iwidth;
        this.iHeight = iHeight;
    }
    /**
     * 求周长
     */
    public int getLength(){
        return 2 * (this.iwidth + this.iHeight);
    }
    /**
     * 求面积
     */
    public int getSquare(){
        return this.iwidth * this.iHeight;
    }
}
