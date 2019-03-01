package constant;

import entity.data.Cell;

/**
 * @author Administrator
 */
public class T {
    public Cell[] cells;
    public T(){
        this(0,0);
    }
    public T(int row, int col){
        cells = new Cell[4];
        this.cells[0] = new Cell(row,col);
        this.cells[1] = new Cell(row,col+1);
        this.cells[2] = new Cell(row,col+2);
        this.cells[3] = new Cell(row+1,col+1);
    }
    public void drop(){
        for (int i = 0; i < cells.length ; i++) {
            cells[i].row++;
        }
    }
    public void moveLeft(){
        for (int i = 0; i < cells.length ; i++) {
            cells[i].col--;
        }
    }
    public void moveRight(){
        for (int i = 0; i < cells.length ; i++) {
            cells[i].col++;
        }
    }

    /**
     * 测试方法
     */
    public void print(){
        for (int i = 0; i < cells.length ; i++) {
            String stu = cells[i].getCellInfo();
            System.out.println(stu);
        }
    }
}
