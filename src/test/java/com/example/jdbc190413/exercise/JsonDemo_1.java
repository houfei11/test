package com.example.jdbc190413.exercise;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonDemo_1 {
    public static void main(String[] args) throws JSONException {
//        String str = "{}";
//        JSONObject object = new JSONObject(str);
//        for (int i = 0; i < 10 ; i++) {
//            object.put("Json" + i,i);
//            object.put("Json" + i,i);
//            System.out.println(object.toString());
//        }
//        String date = "{}";
//        JSONObject jsonobj = new JSONObject(date);
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add("json");
//        list.add("java");
//        list.add("android");
//        jsonobj.put("jsonobj", list);
//        System.out.println(jsonobj.toString());
        String name_1 = "美国队长";
        String name_2 = "钢铁侠";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name_1", name_1);
        jsonObject.put("name_2", name_2);
        System.out.println(jsonObject);

    }
}
