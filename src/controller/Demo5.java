package controller;

import com.sun.deploy.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 */
public class Demo5 {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date();
        dateToString(new Date(),"yyyy/MM/dd");
    }

    /**
     * 将字符串转换成日期格式
     * @param deteString
     * @param pattern
     * @return
     * @throws ParseException
     */
    public static Date dateToString(Date deteString, String pattern) throws ParseException {
        return new SimpleDateFormat(pattern).parse(String.valueOf(deteString));
    }
}
