package controller;

import constant.T;
import entity.data.Cell;

/**
 * @author Administrator
 */
public class TJTest {
    public static void main(String[] args) {
        T t = new T(2,3);
        t.drop();
        t.print();
        System.out.println(t);
        printWall(t);
    }
    public static void printWall(T t){
        Cell[] cells = t.cells;
        for (int i = 0; i < 20 ; i++) {
            for (int j = 0; j < 10 ; j++) {
                boolean flag = false;
                for (int k = 0; k < cells.length; k++) {
                    if (i == cells[k].row && j == cells[k].col) {
                        flag = true;
                        break;
                    }
                    if (flag){
                        System.out.print("*");
                    }else{
                        System.out.print("- ");
                    }
                }
            }
            System.out.println();
        }
    }
}
