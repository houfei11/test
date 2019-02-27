package controller;


import entity.data.Rectangle;

/**
 *  测试类
 * @author Administrator
 */
public class Deom13 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        System.out.println("矩形的周长是" + rectangle.getLength());
        System.out.println("矩形的面积是" + rectangle.getSquare());

        Rectangle rectangle1 = new Rectangle(2);
        System.out.println("矩形的周长是" + rectangle1.getLength());
        System.out.println("矩形的面积是" + rectangle1.getSquare());

        Rectangle rectangle2 = new Rectangle(2, 3);
        System.out.println("矩形的周长是" + rectangle2.getLength());
        System.out.println("矩形的面积是" + rectangle2.getSquare());
    }
}
