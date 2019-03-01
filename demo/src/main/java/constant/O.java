package constant;

import entity.data.Cell;

/**
 * 定义O类
 * @author Administrator
 */
public class O {
    Cell[] cells;
    O (int row, int col){
        cells = new Cell[4];
        cells[0] = new Cell(row, col);
        cells[1] = new Cell(row, col+1);
        cells[2] = new Cell(row+1, col);
        cells[3] = new Cell(row+1, col+1);
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
