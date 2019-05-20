package com.example.jdbc190413.exercise;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JsonDemo_2 {
    public static void main(String[] args) {
        doJsonToString();
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
        System.out.println(array);
    }
}
