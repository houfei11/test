package controller;


import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 数组
 */
public class Demo4 {
    public static void main(String[] args) {
        // 关于任何的，有索引，长度，查找，搜索，排序等一定和数组有关系
        // 关于元素的索引一切都是从零开始的
        getNum();
        getAdd();
        String str = "确认过眼神，你是对的人";
        System.out.println("长度"+str.length());
        System.out.println("第一个字符"+str.charAt(0));
        System.out.println("第二个字符"+str.charAt(1));
        System.out.println("最后一个"+str.charAt(str.length()-1));
        char[] cs = str.toCharArray();
        System.out.println(cs);
        // indexOf判断一个元素是不是在当前字符串中，如果在返回索引位置，如果不存在返回-1
        int index = str.indexOf("123");
        System.out.println(index);
        if (index != -1){
            System.out.println("你是我班的学生");
        } else {
            System.out.println("你不是我班的学生");
        }
        //截取字符串
        String str12 = "qwerrttioyrty3dsf3sdf3sdfsd3womenbuyiyang3fule";
        String[] string = str12.split("3");
        for (String string2 : string) {
            System.out.println(string2);
        }
        char[] car = {'w','m','b','y','y'};
        String ss = String.copyValueOf(car);
        System.out.println(ss);
        // subString
        String string3 = "0123456789";
        System.out.println(string3.substring(2));
        System.out.println(string3.substring(2,4));
        System.out.println(string3.substring(2,6));
        // 数组定义有两种方式：静态初始化和动态初始化
        // 静态初始化
        String[] name = {"小白","小红","小白鼠","short","武器","水杯","the end"};
        String[] string1 = new String[]{"3","2","1"};
        // 获取元素
        System.out.println(name[0]);
        System.out.println(name[2]);
        System.out.println(name[name.length-1]);
        // 动态初始化
        String[] string2 = new String[5];
        string2[0] = "小白";
        string2[1] = "小明";
        string2[2] = "小猫咪";
        string2[3] = "小老鼠";
        string2[4] = "小苹果";
        string2[4] = null;
        for (String num:string2) {
            System.out.println(num);
        }
        Integer[] integers = new Integer[5];
        integers[0] = 10;
        integers[1] = 20;
        integers[2] = 30;
        for (int i = 0; i < integers.length ; i++) {
            System.out.println(integers[i]);
        }
    }
    private static void getAdd(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i+"=="+j);
            }
            System.out.println("================================");
        }
        // 需求：任意输入一个月份，判断这个月份是什么季节；
        System.out.println("请输入月份【】");
        Scanner str = new Scanner(System.in);
        int moth = str.nextInt();
        switch (moth){
            case 1:
            case 2:
            case 3:
                System.out.println(moth+"月份属于春季");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(moth+"月份属于夏季");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println(moth+"月份属于秋季");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println(moth+"月份属于冬季");
                break;
            default:
                System.out.println("请输入0--12的数字");
                break;
        }
    }
    private static void getNum(){
        //
//        Long result = 1L;
//        for (int i = 1; i < 65 ; i++) {
//            result *= 2;
//            System.out.println(result);
//        }
        BigDecimal decimal = new BigDecimal(3.14);
        System.out.println(decimal);

    }
}
