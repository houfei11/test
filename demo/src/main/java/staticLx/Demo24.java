package staticLx;

import java.util.Scanner;
/**
 * Scanner的演示
 */
public class Demo24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = scan.nextInt();
        System.out.println("请输入单价");
        double price = scan.nextDouble();
        System.out.println(age);
        System.out.println(price);
    }
}
/**
 * 封装
 */
class Card{
    private String cardId;  // 卡号
    private String cardPwd;  // 密码
    private double balance;  // 余额
    public boolean payMoney(double money){  // 支付余额
        if(balance>=money){
            balance -= money;
            return true;
        }else {
            return false;
        }
    }
    public boolean checkPwd(String Pwd){  //  检查密码
        if (cardPwd.equals(Pwd)){
            return true;
        }
        return false;
    }
}
