package staticLx;

/**
 * shootgame设计
 */
public class Demo8 {
}
class Hero extends FlyingObject{ //英雄机

}
class Airplane extends FlyingObject implements Enemy{ // 敌机 有得分行为

}
class Bee extends FlyingObject implements Award{ //小蜜蜂

}
class BigYellowBee extends FlyingObject implements Award{ // 大黄蜂

}
class Bullet extends FlyingObject{ // 子弹

}
class FlyingObject{ // 飞行物
}
class BossAirplane extends FlyingObject implements Enemy{ //boss机 有得分行为
}
interface Enemy{ //得分
    int getScore();
}
interface Award{ // 奖励
    int getType();
}