package constant;

import entity.data.Cell;

public class J {
    Cell[] cells;
    J(){
        this(0,0);
    }
    J(int row, int col){
        cells = new Cell[4];
        this.cells[0] = new Cell(row,col);
        cells[0] = new Cell(row,col+1);
        cells[0] = new Cell(row,col+2);
        cells[0] = new Cell(row+1,col+2);
    }

    /**
     * 下落方法
     */
    public void drop(){
        for (int i = 0; i < cells.length ; i++) {
            cells[i].row++;
        }
    }

    /**
     * 左移方法
     */
    public void moveLeft(){
        for (int i = 0; i < cells.length ; i++) {
            cells[i].col--;
        }
    }

    /**
     * 右移方法
     */
    public void moveRight(){
        for (int i = 0; i < cells.length ; i++) {
            cells[i].col++;
        }
    }
    /**
     * 输出方法
     */
    public void print(){
        for (int i = 0; i < cells.length ; i++) {
            String stu = cells[i].getCellInfo();
            System.out.println(stu);
        }
    }

}
