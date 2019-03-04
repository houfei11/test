package controller.fly;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * 主程序类
 */
public class ShootGame {
    public static final int WIDTH = 500; // 窗口宽
    public static final int HEIGHT = 800; // 窗口高
    public static BufferedImage background; // 背景图
    public static BufferedImage start;      // 启动图
    public static BufferedImage pause;      // 暂停图
    public static BufferedImage gameover;   // 游戏结束图
    public static BufferedImage airplane;   // 敌机
    public static BufferedImage bee;        // 小蜜蜂
    public static BufferedImage bullet;     // 子弹
    public static BufferedImage hero0;      // 英雄机0
    public static BufferedImage hero1;      //英雄机1
    static { // 初始化静态资源(图片)
        try{
            background = ImageIO.read(ShootGame.class.getResource("背景图.png"));
            start = ImageIO.read(ShootGame.class.getResource("启动图.png"));
            pause = ImageIO.read(ShootGame.class.getResource("暂停图.png"));
            gameover = ImageIO.read(ShootGame.class.getResource("游戏结束图.png"));
            airplane = ImageIO.read(ShootGame.class.getResource("敌机.png"));
            bee = ImageIO.read(ShootGame.class.getResource("小蜜蜂.png"));
            bullet = ImageIO.read(ShootGame.class.getResource("子弹.png"));
            hero0 = ImageIO.read(ShootGame.class.getResource("英雄机0.png"));
            hero1 = ImageIO.read(ShootGame.class.getResource("英雄机1.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

    }
}
