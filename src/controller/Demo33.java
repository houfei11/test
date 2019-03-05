package controller;

import java.util.regex.Pattern;

/**
 * 字符串支持正则表达式的方法：
 * 将当前字符串按照满足条件的正则表达式进行拆分
 */
public class Demo33 {
    public static void main(String[] args) {
        String str = "123asd456dfg789sdf101cdfee2d51f4d1x5s2";
        /**
         * 按照数字拆分，保留所有英文字母部分
         */
        String reger = "[0-9]+";
        String[] arry = str.split(reger);
        System.out.println("length:" + arry.length);
        for (int i = 0; i < arry.length ; i++) {
            System.out.println(arry[i]);
        }
        Test02();
        Test03();
        Test04();
        Test05();
        Test06();
    }

    /**
     * 图片重命名
     */
    public static void Test02(){
        String imgName = "1.jpg";
        String name[] = imgName.split("\\.");
        // currentTimeMillis()获取系统当前时间毫秒值
        imgName = System.currentTimeMillis() + "." + "jpg" + name[1];
        System.out.println(imgName);

    }

    /**
     * 字符串支持正则表达式3：
     * 将当前字符串满足正则表达式的部分替换成给定的字符串
     */
    public static void Test03(){
        String str = "sdf845sd48edc18dsf9s6d8c1fg8de74c";
        /**
         * 将数字部分替换成"#NUMBER#"
         */
        str.replaceAll("\\d","QQ");
        System.out.println(str);
    }

    /**
     * 用replaceAll实现图片重命名该
     */
    public static void Test04(){
        String imger = "331488789.jpg";
        imger = imger.replaceAll(".+\\.",System.currentTimeMillis() + ".");
        System.out.println(imger);
    }

    /**
     * 和谐用语
     */
    public static void Test05(){
        String regex = "(wqnmlgb|cnm|sb|2B|nc|tmd|cby|djb)";
        String message = "wqnmlgb!你这个2B！你怎么这么的sb!cnm!";
        message.replaceAll(regex,"****");
        System.out.println(message);
    }
    /**
     * 字符串中是否包含了某字符串
     */
    public static void Test06(){
        String content = "i am noob" + "from runoob.com";
        String pattern = ".*runoob.*";
        boolean isMatch = Pattern.matches(pattern,content);
        System.out.println("字符串中是否包含了 'runoob' 字符串？" + isMatch);
    }
}
