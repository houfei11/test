package controller.fly;

import java.util.Random;

/**
 * 子弹类：飞行物
 */
public class Bullet extends FlyingObject{
    private int speed = 3; // 子弹的移动速度

    /**
     * 构造方法 x:根据英雄机位置计算 y：根据英雄机位置计算
     */
    public Bullet(int x, int y){
        image = ShootGame.bullet; // 子弹图片
        width = image.getWidth();
        height = image.getHeight();
        this.x = x;
        this.y = y;
    }
}
