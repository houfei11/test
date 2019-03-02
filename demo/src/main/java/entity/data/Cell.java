package entity.data;

/**
 * 定义格子类
 */
public class Cell {
    public int row;
    public int col;

    public Cell(){

    }
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * 下落方法
     */
    public void drop(){
        row++;
    }

    /**
     * 左移n格子
     * @param n
     */
    public void moveLeft(int n){
        col -= n;
    }

    /**
     * 右移n个格子
     * @param n
     */
    public void moveRight(int n){
        col += n;
    }

    /**
     *  获取格子的行号和列号
     * @return
     */
    public String getCellInfo(){
        return row+","+col;
    }
}
