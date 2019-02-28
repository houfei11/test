package controller;

/**
 * 子类
 * @author Administrator
 */
public class Child extends Deom15 {
    public String name = "大头儿子";
    public Child(){
        // 如果父类没有无参构造方法，使用super关键字会报错
        super(15);
    }
    private void testParam(){
        System.out.println("爸爸的名字叫" + super.name);
        System.out.println("孩子的名字是" + name);
        System.out.println("爸爸是否有有钱：" + hasMoney);
    }
    /**
     * 方法和上面的属性结果一样
     */
    public void testMethod(){
        sleeping();
        super.sleeping();
        super.working();
    }
    @Override
    public void sleeping(){
        System.out.println("儿子已经睡了");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.testParam();
        child.testMethod();
    }
}
