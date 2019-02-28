package constant;

import entity.data.Cell;

public class J {
    Cell[] cells;
    J(){
        this(0,0);
    }
    J(int row, int col){
        cells = new Cell[4];
        cells[0] = new Cell(row,col);
        cells[0] = new Cell(row,col+1);
        cells[0] = new Cell(row,col+2);
        cells[0] = new Cell(row+1,col+2);
    }
}
