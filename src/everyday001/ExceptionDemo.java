package everyday001;

/**
 * java异常捕获机制,try - catch
 * try块用来扩上可能出错的代码，catch块用来捕获try块中的代码
 * @author Administrator
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String str = "";
            System.out.println(str.length());
            System.out.println(str.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("空指针");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("字符串下标越界");
        }
        System.out.println("程序结束了！！");
    }
}
