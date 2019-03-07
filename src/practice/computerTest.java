package practice;

/**
 * 测试类
 * @author Administrator
 */
public class computerTest {
    public static void main(String[] args) {
        /**
         * 枚举类型创建对象
         */
        computerBrand brand = computerBrand.svmsung;
        System.out.println(brand);
        /**
         * valueOf():枚举类型静态方法valueOf()可以将字符串转换为枚举类型，
         */
        computerBrand brand1 = computerBrand.valueOf("Lenovo");
        System.out.println(brand1);
        /**
         * 获取所有枚举值
         * values():很方便的对枚举中的常量值进行遍历;
         */
        computerBrand[] brand2 = computerBrand.values();
        for (computerBrand brands:brand2) {
            System.out.println(brands);
        }
        /**
         * 用set方法给枚举类赋值
         */
        brand.setName("小米");
        brand.setPrice(3998);
        System.out.println(brand);
    }
}
