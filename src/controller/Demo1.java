package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        String ss = "111222";
        helloWord(ss);
        System.out.println(ss);
        Random dom = new Random();
        Scanner sc = new Scanner(System.in);
        int result = dom.nextInt(100)+1;
        System.out.println("请输入1到100的正整数");
//        while (true){
//            int tepme = sc.nextInt();
//            if (tepme > result){
//                System.out.println("数字大了");
//            } else if (tepme < result){
//                System.out.println("数字小了");
//            } else {
//                System.out.println("恭喜你中奖了");
//                System.out.println("中奖号码为"+result);
//            }
//        }
        //九九乘法表
        for (int i= 0;i<=9;i++){
            for (int c=1;c<=i;c++){
                System.out.print(i+"*"+c+"="+i*c+"\t");
            }
            System.out.println();
        }
        //倒三角九九乘法表
        for (int i= 9;i>=1;i--){
            for (int c=1;c<=i;c++){
                System.out.print(i+"*"+c+"="+i*c+"\t");
            }
            System.out.println();
        }
        List<Object> objects = new ArrayList<>();
        objects.add("java01");
        objects.add("java02");
        objects.add("java03");
        objects.add("java04");
        objects.add("java05");
        helloWord(objects);
        objects.remove("java02");
    }
    private static void helloWord(Object str){
        List<Object> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add(741);
        list.add(852);
        list.add(963);
        System.out.println(str);
        System.out.println(list);
    }

}
