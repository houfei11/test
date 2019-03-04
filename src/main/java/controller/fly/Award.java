package controller.fly;

/**
 * 奖励接口
 */
public interface Award {
    /**
     * 两种奖励类型
     */
    public int  DOUBLE_FIRE = 0; // 火力值
    public int LIFE = 1; // 命
    /**
     * 奖励类型 返回o得到火力值 返回1得到命
     */
    public int getType();
}
