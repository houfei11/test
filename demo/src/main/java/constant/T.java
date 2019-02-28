package constant;

import entity.data.Cell;

public class T {
    Cell[] cells;
    T(){
        this(0,0);
    }
    public T(int row, int col){
        cells = new Cell[4];
        cells[0] = new Cell(row,col);
        cells[0] = new Cell(row,col+1);
        cells[0] = new Cell(row,col+2);
        cells[0] = new Cell(row+1,col+1);
    }
    void drop(){
        for (int i = 0; i < cells.length ; i++) {
            cells[i].row++;
        }
    }
    void moveLeft(){
        for (int i = 0; i < cells.length ; i++) {
            cells[i].col--;
        }
    }
    void moveRight(){
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
