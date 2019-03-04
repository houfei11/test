package controller.fly;

import java.util.Random;

/**
 * 敌机类  是飞行物 也是敌人
 */
public class Airplane extends FlyingObject implements Enemy{
    private int speed = 2; // 走不的步数

    /**
     * 构造方法
     */
    public Airplane(){
        image = ShootGame.airplane;
        width = image.getWidth();
        height = image.getHeight();
        Random rand = new Random();
        x = rand.nextInt(ShootGame.WIDTH - this.width); // x:0到(窗口宽-敌机宽)之间的随机数
        y = -this.height; // y:负的敌机的高
    }
    @Override
    public int getScore() {
        return 5; // 打掉一个敌机得五分
    }
}
