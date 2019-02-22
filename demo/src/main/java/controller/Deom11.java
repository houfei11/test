package controller;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class Deom11 {
    public static void main(String[] args) throws JSONException {
//        String jsonString = "{\"UserName\":\"kobi\",\"age\":\"34\",\"workIn\":\"ALI\",\"Array\":[\"kobi\",\"34\",\"ALI\"]}";
//        //将Json字符串转为java对象
//        JSONObject obj = JSONObject.numberToString(jsonString);
//        //获取Object中的UserName
//        if (obj.has("UserName")) {
//            System.out.println("UserName:" + obj.getString("UserName"));
//        }
//        //获取ArrayObject
//        if (obj.has("Array")) {
//            JSONArray transitListArray = obj.getJSONArray("Array");
//            for (int i = 0; i < transitListArray.length(); i++) {
//                System.out.print("Array:" + transitListArray.getString(i) + " ");
//            }
//        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("1","调整单");
        map.put("2","移库单");
        map.put("3","统配出");
        map.put("4","批发出");
        System.out.println(String.valueOf(map.get("5")));
        System.out.println(map.get("5").toString());
    }
}
