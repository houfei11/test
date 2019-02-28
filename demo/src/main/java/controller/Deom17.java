package controller;

import entity.data.Student;

/**
 * 引用类型数组和数组类型数组
 * @author Administrator
 */
public class Deom17 {
    public static void main(String[] args) {
        Student[] stu = new Student[3];
        stu[0] = new Student("aa",2,"bb");
        stu[1] = new Student("cc",3,"dd");
        Student[] stu11 = {
                new Student("ee",4,"ff"),
                new Student("gg",5,"hh"),
                new Student("jj",6,"kk"),
        };
        int row = 2;
        int col = 3;
        int[][] arr = new int[row][col];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                arr[i][j] = 0;
            }
        }
    }
}
