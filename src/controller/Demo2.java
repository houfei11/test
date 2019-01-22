package controller;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Demo2 {

    /**
     * public class 意思就是：声明一个任何地方都可以引用的类
     * public 是一个访问修饰符，表明任何地方都可以引用
     * class 是声明一个类的关键字，如：class A{} 表示声明一个类，名为A
     * 数据类型和运算符
     * 整型 Byte int long short 浮点型 Float double 字符型 char 布尔型 boolean
     * <p>
     * 引用数据类型：包括类，接口类型，数组类型等，除了基本数据类型，其他都是引用数据类型
     *
     * @param args
     */
    public static void main(String[] args) {
        Integer s = 10;
        Integer s2 = new Integer(10);
        Integer s3 = new Integer(10);
        System.out.println("-------"+s2.equals(s3));
        Integer s1 = 10;
        if (s == s1){
            System.out.println("zheng");
        }
        if (s2 == s3){
            System.out.println("123");
        }

        String a = "a";
        String b = "b";

        System.out.println(a.equals(b));
        System.out.println("a:" + a.hashCode());
        System.out.println("b:" + b.hashCode());
        // 返回false
        System.out.println(s.equals(s1));
//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Long.MIN_VALUE);
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);
//        System.out.println(Float.MAX_VALUE);
//        System.out.println(Float.MIN_VALUE);
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Double.MIN_VALUE);

        // char 和 int 之间可以相互转换
//        char a = '1';
//        char b = '0';
        System.out.println(a + b);

        // 如何判断一个字符串那些是数字，哪些是字母，哪些是汉子
        String str = "我是houfei，今年27岁";

        for (int i = 0; i < str.length(); i++) {

            //根据索引得到字符串中的单个字符
            char c = str.charAt(i);

//            if (c>97 && c<122){
//                System.out.print(c);
//            }
//            if (c>48 && c<57){
//                System.out.print(c);
//            }

            if (Demo2.isCheass(c)) {
                System.out.print(c);
            }
        }

        getByWord();
        getByAdd();
        getAll();
        int d = 10;
        byte v = (byte) d;

    }

    public static boolean isCheass(char a) {
        try {
            //getBytes() 是Java编程语言中将一个字符串转化为一个字节数组byte[]的方法。String的getBytes()方法是得到一个系统默认的编码格式的字节数组。
            return String.valueOf(a).getBytes("UTF-8").length > 1;
        } catch (UnsupportedEncodingException e) {
            return false;
        }
    }

    public static void getAll() {

        // byte对应的包装类是Byte ；short对应的包装类是Short ； int对应的包装类为Integer ； char对应的包装类是Character ；boolean对应的包装类为Boolean
        System.out.println("int类型的最大值为" + Integer.MAX_VALUE);
        System.out.println("int类型的最小值为" + Integer.MIN_VALUE);

        int i = Integer.parseInt("123456789");
        Integer.valueOf(i);
        System.out.println(i);

        // 这个方法就是把一个int类型转换成一个Integer类型，Integer是一个包装类，我们把int类型进行包装一下变成Integer类型，这个过程就是装箱
        Integer a = new Integer(18);

        // 这行代码就是说明我们把Integer类型的a转换成int类型，这个过程就是拆箱
        int b = a.intValue();
        Integer s = 10;
        Integer s2 = new Integer(10);
        Integer s3 = new Integer(10);
        Integer s1 = 10;
        // 返回false
        System.out.println(s.equals(s1));
        System.out.println(s2.equals(s3));

        // 运算符
        int num = 10;
        int num1 = (num++) + (num--) + (++num) + (--num) + (num * 10);
        System.out.println(num1);
        int num2 = 10;
        int num3 = 3;
        num2 += num3;

        // 13
        System.out.println(num2);

        // 三目预算符
        num2 = num2 > 3 ? 1 : 2;
        System.out.println(num2);

    }

    public static void getByAdd() {
        // 编写一个小代码 需求：输入一个年份判断是否为润年，输入月份求出这个月的最大天数
        // 能被4整除但是不能被100整除的为普通润年，能被400整除的为世纪润年
        System.out.println("请输入年份：");
        Scanner scanner = new Scanner(System.in);
        int nYear = scanner.nextInt();

        System.out.println("请输入月份：");
        int nMounth = scanner.nextInt();

        int falg = 0;
        if (nYear % 4 == 0 && nYear % 100 != 0) {
            System.out.println(nYear + "普通润年");
            return;
        } else if (nYear % 400 == 0) {
            System.out.println(nYear + "世纪润年");
        } else {
            falg = 1;
            System.out.println(nYear + "不是润年");
        }

        if (nMounth == 1 || nMounth == 3 || nMounth == 5 || nMounth == 7 || nMounth == 8 || nMounth == 10 || nMounth == 12) {
            System.out.println(nYear + "年" + nMounth + "月份天数为：31天");
        } else if (nMounth == 4 || nMounth == 6 || nMounth == 9 || nMounth == 11) {
            System.out.println(nYear + "年" + nMounth + "月份天数为：30天");
        } else {
            if (falg == 1) {
                System.out.println(nYear + "年" + nMounth + "月份天数为：28");
            } else {
                System.out.println(nYear + "年" + nMounth + "月份天数为：29");
            }
        }
    }

    /**
     * 定义一个接口，并使用匿名内部类方式创建接口
     */
    interface getHelloWord {
        abstract void run();
    }
    static class ImpClass implements getHelloWord{

        @Override
        public void run() {
            System.out.println("我是内部类001");
        }
    }

    public static void getByWord() {
        ImpClass aClass = new ImpClass(){
            @Override
            public void run(){
                System.out.println("我是内部类002");
            }
        };
        aClass.run();
    }
}
