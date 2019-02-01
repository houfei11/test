package controller;

public class Demo6 {
    public static void main(String[] args) {
        /**
         * 字符串倒序
         */
        String str = "我们的明天";
        StringBuilder builder = new StringBuilder(str);
        String str1 = builder.reverse().toString();
        System.out.println(str1);
        // 字符串处理
        String puth = "http://www.baidu.com/user";
        String erp = puth.substring(puth.lastIndexOf("/")+1);
        System.out.println(erp);
        String erp1 = puth.substring(puth.lastIndexOf("h"),puth.lastIndexOf("."));
        System.out.println(erp1);
        Integer srt = 10;
        int aa = 10;
        System.out.println(srt.equals(aa));
    }
}
