package controller.fly;

import java.util.Random;

/**
 * 小蜜蜂类：是飞行物 也是奖励
 */
public class Bee extends FlyingObject implements Award{
    private int xSpeed = 1;  // x坐标走步步数
    private int ySpeed = 2;  // y坐标走步步数
    private int awardType;   // 奖励类型（0/1）

    /**
     * 构造方法
     */
    public Bee(){
        image = ShootGame.bee; // 蜜蜂图片
        width = image.getWidth();
        height = image.getHeight();
        Random rand = new Random();
        x = rand.nextInt(ShootGame.WIDTH - this.width); // x:0到(窗口宽-蜜蜂宽)之间的随机数
        y = -this.height; // y:负的蜜蜂的高
        awardType = rand.nextInt(2); // 0到1之间随机数
    }
    @Override
    public int getType() {
        return awardType; // 返回奖励类型（0/1）
    }
}
