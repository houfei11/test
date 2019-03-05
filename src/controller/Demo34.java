package controller;

import java.util.Scanner;

/**
 * 正则表达式
 *
 */
public class Demo34 {
    public static void main(String[] args) {
        //测试：
        String qq1 = "1832137835";
        String qq2 = "789j9371";
        String qq3 = "22";
        String qq4 = "012189783";
        boolean b1 = isQQ(qq1);
        boolean b2 = isQQ(qq2);
        boolean b3 = isQQ(qq3);
        boolean b4 = isQQ(qq4);
        System.out.println(qq1+"是qq号码吗？"+b1);
        System.out.println(qq2+"是qq号码吗？"+b2);
        System.out.println(qq3+"是qq号码吗？"+b3);
        System.out.println(qq4+"是qq号码吗？"+b4);
        isEmail();
    }
    //练习1：匹配QQ号(长度为5-10位，纯数字组成，且不能以0开头)
    public static boolean isQQ(String qq) {
        //定义匹配规则：
        String regex = "[1-9][0-9]{4,9}";

        //判断是否符合规则
        boolean b = qq.matches(regex);
        return b;
    }

    /**
     * 電子郵箱正則表達式
     * [A-Za-z0-9]+@[A-Za-z0-9]+(\.[a-zA-Z0-9_-]+)+
     * @return
     */
    public static void isEmail(){
        String regex = "[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[a-zA-Z0-9_-]+)+";
        System.out.println(regex);
        String mail = "18722056849@163.com";
        boolean flag = mail.matches(regex);
        if (flag){
            System.out.println("是邮箱");
        } else {
            System.out.println("不是邮箱");
        }
    }

    /**
     * 验证手机号的正则表达式
     * 需求：用户输入一个手机号码，然后通过验证输出是否是手机号码
     */
    private static void Test01(){
        System.out.println("请输入一个手机号");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        /**
         * (\+86|0086)?\s*1[0-9]{10}
         */
        String regex = "1[0-9]{10}";
        if (line.matches(regex)){
            System.out.println("是手机号");
        } else {
            System.out.println("不是手机号");
        }
    }
}
