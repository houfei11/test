package controller;

import entity.data.Cell;

/**
 *  格子类的测试类
 * @author Administrator
 */
public class CellTest {
    public static void main(String[] args) {
        Cell cell = new Cell();
        cell.row = 2;
        cell.col = 3;
        cell.drop();
        cell.moveLeft(2);
        String str = cell.getCellInfo();
        System.out.println(str);
        cell.drop();
        System.out.println("原始位置");
        System.out.println("下落后");
        System.out.println("左移后");
    }
    public static void printWall(Cell cc){
        Cell cell = cc;
        for (int i = 0; i < 20 ; i++) {
            for (int j = 0; j < 20 ; j++) {
                if (i == cell.row && i == cell.col){
                    System.out.println("*");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}