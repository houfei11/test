package practice;

import java.util.Scanner;

/**
 * 十进制转二进制与十六进制的练习
 */
public class DecToBinDemo {
    public static void main(String[] args){
        System.out.print("输入待转换的十进制数字：");
        Scanner n = new Scanner(System.in);
        DecToBinAndHex(n.nextInt());
    }
    /**
     *@param n 传入的10进制数字
     */
    public static void DecToBinAndHex(int n){
        int n1 = n;
        int n2 = n;
        int b = 0;//Bin
        String h = "";//Hex
        int i =0; //位数
        int temp1 = 0;//
        int temp2 = 0;//
        //10 to 2
        System.out.print(n1 + "的二进制为：");
        while(n1 != 0){
            temp1 = n1 % 2;
            n1 /= 2;
            temp1 *= Math.pow(10, i);
            b += temp1;
            i++;
        }
        System.out.println(b);
        //10 to 16
        System.out.print(n2 + "的十六进制为：");
        while(n2 != 0){
            temp2 = n2 & 15;//取出末尾的4位数
            h += (temp2 > 9)? (char)('A' + (temp2 - 10)) + "" : temp2 + "";
            n2 = n2 >>> 4;
        }
        //对h进行反转
        StringBuffer str=new StringBuffer(h);
        str.reverse();
        System.out.println(str.toString());
    }
}
