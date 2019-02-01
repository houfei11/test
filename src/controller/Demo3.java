package controller;


public class Demo3 {
    /**
     * == 和 equals 的区别
     * == 比较的是变量（栈）内存中存放的对象的(堆)内存地址，用来判断两个对象的地址是否相同，即是否指向同一对象。
     *   1.比较的是操作符两端的操作数是否是同一对象。2.两边的操作数必须是同一类型的才能编译通过。3.比较的是地址，如果是具体的阿拉伯数字的比较，值相等则为true
     * equals是用来比较的是两个对象的内容是否相等，由于所有的类都是集成java.lang.object类的，所以使用与所有对象，如果没有对该方法进行覆盖的话，
     *      调用的仍然是Object类中的方法，而Object中的equals方法返回的却是==的判断。
     *      由equals的源码可以看出这里定义的equals与==是等效的（Object类中的equals没什么区别），不同的原因就在于有些类（像String、Integer等类）对equals进行
     * 了重写，但是没有对equals进行重写的类（比如我们自己写的类）就只能从Object类中继承equals方法，其equals方法与==就也是等效的，除非我们在此类中重写equals。
     */
    public static void main(String[] args) {
        int a = 10;
        Long b = 10L;
        double c = 10.0;
        System.out.println();
        if (a == b){
            System.out.println("相等");
        }
        if (b == c){
            System.out.println("相等");
        }
        if (a == c){
            System.out.println("相等");
        }
        // String str = "hello"; 先在内存中找是不是有"hello"这个对象,如果有，就让str指向那个"hello".如果内存里没有"hello"，就创建一个新的对象保存"hello".
        // String str=new String ("hello") 就是不管内存里是不是已经有"hello"这个对象，都新建一个对象保存"hello"
        String str = "hello";
        String str1 = "hello";
        if (str.equals(str1)){
            System.out.println("相等true");
        }
        if (str == str1){
            System.out.println("相等的内存");
        }
        String hello = new String("hello");
        String hello1 = new String("hello");
        if (hello.equals(hello1)){
            System.out.println("相等hello");
        } else {
            System.out.println("不相等hello");
        }
        if (hello == hello1){
            System.out.println("相等的对象地址");
        } else {
            System.out.println("不相等的对象地址");
        }
        if (42 == 42.0){
            System.out.println("正确");
        }
        System.out.println("--------------------------------------------------------------------");
        Integer integer = new Integer(200);
        Integer integer1 = new Integer(200);
        Integer num = 200;
        Integer num1 = 200;
        int e = 200;
        System.out.println("两个new出来的对象,==判断"+(integer == integer1));
        System.out.println("两个new出来的对象，equals判断"+(integer.equals(integer1)));
        System.out.println("new出来的对象和用int赋值的，==判断"+(integer == num));
        System.out.println("new出来的对象和用int赋值的，equals判断"+(integer == num));
        System.out.println("两个int赋值的Integer,==判断"+(num == num1));
        System.out.println("两个int赋值的Integer,equals判断"+(num.equals(num1)));
        System.out.println("基本数据类型和new出的对象，==判断"+(e == integer));
        System.out.println("基本数据类型和new出的对象，equals判断"+(integer.equals(e)));
        System.out.println("基本数据类型和自动装箱的对象，==判断"+(e == num));
        System.out.println("基本数据类型和自动装箱的对象，equals判断"+(num.equals(e)));
        //数据类型转换
        byte b1 = 3;
        byte b2 = 4;
        //两个byte相加默认会是int类型，说以需要强制转换才行
        byte b3 = (byte) (b1+b2);
        byte b4 = 3+4;
        System.out.println(b3);
        System.out.println(b4);
        int d;
        String f = "123456789";
        d = Integer.parseInt(f);
        System.out.println(d);
        //double转化int整型，0.5进一，小于0.5不进一
        int d1;
        double d2 = 1.2;
        d1 = (int) d2;
        System.out.println(d1);
        // JAVA中float为四个字节，double为八个字节，float--->double时候会补位,是属于强制转换，会丢失精度的
        double dou = 3.14;
        float flt = (float) dou;
        System.out.println(flt);
        float flt1 = 3.14f;
        double dou1 = flt1;
        System.out.println(dou1);
        // 算术运算符
        int one = 1;
        int two = 2;
        int ss = one + two;
        System.out.println(ss);
        int ss1 = one - two;
        System.out.println(ss1);
        System.out.println("one*two等于"+one*two);
        System.out.println("one/two等于"+one/two);
        System.out.println("one%two等于"+one%two);
        System.out.println("two%one等于"+two%one);
        // 赋值赋值运算符 +=, -=, *=, /=, %=
        int w = 12;
        w += 10;
        System.out.println("w等于"+w);
        int w1 = 13;
        w1 -= 6;
        System.out.println("w1等于"+w1);
        int w2 = 18;
        w2 *= 2019;
        System.out.println("w2等于"+w2);
        int w3 = 15;
        w3 /= 20;
        System.out.println("w3等于"+w3);
        int w4 = 20;
        w4 %= 60;
        System.out.println("w4等于"+w4);
        //比较运算符
        if (4 != 3){
            System.out.println("这是真的");
        }
        if (4 == 3){
            System.out.println("这是真的");
        }else{
            System.out.println("这是假的");
        }
        if(100<3){
            System.out.println("这是真的");
        }else{
            System.out.println("这是假的");
        }
        if (20 >= 5){
            System.out.println("20 >= 5这是真的");
        }
        // 逻辑运算符
        boolean boo = 100>10;
        boolean boo2 = false;
        System.out.println(boo&&boo2);
        System.out.println(boo||boo2);
        System.out.println(!boo2);
        System.out.println(boo && 100>10);
        // 三元运算符
        System.out.println( 3>2 ? "正确" : "错误" );
        int yy = 3;
        int bb = 4;
        String result = (yy==bb) ? "相等" : "不相等";
        System.out.println(result);
        int n = (3>2 && 4>6) ? 100 : 200;
        System.out.println(n);
        int cont = 10;
        int cont1 = 10;
        int sum = cont + cont1++;
        System.out.println(cont1++);
        System.out.println(cont1++);
        System.out.println(sum);
        System.out.println(cont1);
        // 非运算符
        System.out.println(~1);
        /**
         * 异或 ，计算方式为：两个二进制数的位相同则为0 不同则为1
         * 23转换为二进制为：00010111
         * 12转换为二进制为：00001100
         * 计算结果为：00011011  =  27
         */
        System.out.println(23^12);
        /**
         * & 按位与 ，计算方式为：两个二进制数的位都为1则为1 ，否则为0
         * 1的二进制为 ：00000001
         * 2的二进制为 ：00000010
         * 结果为 :00000000 = 0
         */
        System.out.println(1&2);
        /**
         *| 按位或 ，计算方式为：两个二进制位有一个为1就为1，否者为0
         * 5 的二进制为：00000101
         * 6 的二进制为：00000110
         * 结果为：00000111 = 7
         */
        System.out.println(5 | 6);
        /**
         * >> 有符号右移位  ，符号左边表示要被移位的数，右边表示需要移的位数，结果为正数则在左边补0，否则补1
         * 3 的二进制为：00000010
         * 向右移动1位：00000001 = 1
         */
        System.out.println(3 >> 1);

    }
}
