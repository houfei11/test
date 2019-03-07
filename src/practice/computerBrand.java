package practice;

/**
 *  枚举类练习
 *  可以直接在枚举对象中设置枚举对象添加的属性；
 *  也可以不设置，比如"**","**" ---- 在测试类中，用set方法设置，相当于使用了无参构造方法，然后再用set赋值
 * @author Administrator
 */
public enum computerBrand {
    Lenovo("联想", 4999),
    Dell("戴尔", 5999),
    svmsung("三星",6999),
    MacApple("苹果", 7999);
    /**
     * 枚举可以添加属性和方法
     */
    private String name;
    private int price;
    computerBrand(){

    }
    computerBrand(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "computerBrand{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
