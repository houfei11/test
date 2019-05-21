package com.example.jdbc190413.exercise;



import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;
import org.apache.commons.lang.time.DateFormatUtils;

import java.util.Date;
import java.util.HashMap;

public class JsonDemo_2 {
    public static void main(String[] args) {
        doJsonToString();
        doMapToJson();
        getJsonArrayToString();
    }
    /**
     * json 转换字符串
     */
    public static void doJsonToString(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userName", "国王");
        jsonObject.put("userName2", "士兵");
        System.out.println(jsonObject.toString());
        JSONArray array = new JSONArray();
        array.add(jsonObject);
        System.out.println(array.toString());
        String string = array.toString();
        System.out.println(string);
    }
    /**
     * map转换json对象
     */
    public static void doMapToJson(){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("userName", "zhangsan");
        hashMap.put("password", "123456");
        // 转换json数组
        JSONArray object = JSONArray.fromObject(hashMap);
        System.out.println(object);
        // 转换json对象
        JSONObject jsonObject = JSONObject.fromObject(hashMap);
        System.out.println(jsonObject);
    }
    /**
     * jsonObject中的一些方法和应用 todo ：未完成
     */
    public static void doJsonObjectHandle(){
        Person person = new JsonDemo_2().new Person();
        person.setAge(18);
        person.setUserName("头晕");
        person.getEndTime(new Date());
        // 日期转换
        JsonConfig config = new JsonConfig();
        config.registerDefaultValueProcessor(java.util.Date.class, new JsonValueProcessor(){
            @Override
            public Object processArrayValue(Object arg0, JsonConfig arg1) {
                return null;
            }

            @Override
            public Object processObjectValue(String arg0, Object arg1, JsonConfig arg2) {
                return DateFormatUtils.format(((Date)arg1, "yyyy-MM-dd");
            }
        });
        JSONObject json = JSONObject.fromObject(person,config);
        System.out.println(json);
    }
    public class Person{
        private String userName;
        private Integer age;
        private Date endTime;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Date getEndTime(Date date) {
            return endTime;
        }

        public void setEndTime(Date endTime) {
            this.endTime = endTime;
        }
    }
    /**
     * 把json数组里面的某个对象转换成字符串
     */
    public static void getJsonArrayToString(){
        String str = "[{\"userName\":\"zhangsan\"},{\"userName\":\"lisi\"}]";
        JSONArray object = JSONArray.fromObject(str);
        System.out.println(object.getString(0));
    }

}
