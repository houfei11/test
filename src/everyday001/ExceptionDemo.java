package everyday001;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

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
            System.out.println(Integer.parseInt(str));
        } catch (NullPointerException e) {
            System.out.println("空指针");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("字符串下标越界");
            /**
             * 应当养成一个好习惯，在最后一个catch中捕获Exception，避免未捕获的异常
             * 导致程序中断
              */
        } catch (Exception e) {
            System.out.println("出現一個異常");
        }
        System.out.println("程序结束了！！");
    }
}

/**
 * finally块
 * finally块定义在异常捕获机制的最后，可以直接跟在try块之后或者一个catch块之后
 * finally块中的代码一定执行，无论try块中的代码是否抛出异常，所以通常把释放资源等操作放在finally块中，比如释放资源等操作
 */
class ExceptionDemo2{
    public static void main(String[] args) {
        System.out.println("程序开始了！！");
        try{
            String str = null;
            System.out.println(str.length());
        } catch (Exception e){
            System.out.println("程序出现错误了！！");
        } finally {
            System.out.println("finally中的代码执行了！！！");
        }
        System.out.println("程序结束了");
    }
}

/**
 * finally对于流的处理
 */
class ExceptionDemo3{
    public static void main(String[] args) {
        BufferedReader br = null;
        try{
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\Users\\lenovo\\IdeaProjects\\test\\src\\everyday001")));
            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e){
            System.out.println("程序出错了");
        } finally {
            if (br != null){
                try{
                    br.close();
                } catch (Exception e) {
                    System.out.println("未完成关闭操作！！");
                }
            }
        }
    }
}

/**
 * 用来测试throw与 throws
 */
class ExceptionDemo4{
    public static void main(String[] args) throws Exception {
        Person pr = new Person();
        pr.setName("张泽凯");
        pr.setAge(2000);
        System.out.println("年龄是：" + pr.getAge());
    }
}

/**
 * 重写父类一个含有throws异常抛出声明的方法时，子类该方法throws的重写原则
 */
class ExceptionDemo5{
    public static void main(String[] args) {
    }
}