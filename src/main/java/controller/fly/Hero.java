package controller.fly;

import java.awt.image.BufferedImage;

/**
 * 英雄机类：飞行物
 */
public class Hero extends FlyingObject{
    private int life;  // 命
    private int doubleFire; // 火力值
    private BufferedImage[] images; // 图片数组
    private int index; // 协助图片切换

    /**
     * 构造方法
     */
    public Hero(){
        image = ShootGame.hero0;  // 英雄机图片
        width = image.getWidth();
        height = image.getHeight();
        x = 150;
        y = 400;
        life = 3; // 默认三条命
        doubleFire = 0; // 火力值为0，即单倍火力
        images = new BufferedImage[]{ShootGame.hero0,ShootGame.hero1};  // 两张图片
        index = 0; //协助图片切换
    }
}
