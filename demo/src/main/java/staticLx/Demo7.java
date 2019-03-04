package staticLx;

/**
 * Debug调试练习
 * F5：逐步调试(会进入到方法中)
 * F6：逐过程调试(不会进入方法中)
 * F7：跳出当前的方法
 * F8：条到下一个断点，若没有断点则结束调试
 * 不固定，需要看工具设置
 * Variables 会显示所有变量
 */
public class Demo7 {
    public static void main(String[] args) {
        int a = 5,b = 6;
        int n = plus(a,b);
        System.out.println(n);
        show();
        System.out.println("over");
    }
    public static int plus(int num1, int num2){
        int num = num1 + num2;
        return num;
    }
    public static void show(){
        System.out.println("111");
        System.out.println("222");
        System.out.println("333");
        System.out.println("444");
    }
}
