package controller;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * JSONObject与JSONArray使用方法区别
 * @author Administrator
 */
public class Deom10 {
    public static void main(String[] args) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("UserName", "kobi");
        jsonObject.put("age", "34");
        jsonObject.put("workIn", "ALI");
        System.out.println("jsonObject1：" + jsonObject);
        //创建JsonObject第二种方法
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("UserName", "ZHULI");
        hashMap.put("age", "30");
        hashMap.put("workIn", "ALI");
        System.out.println("jsonObject2：" + JSONObject.wrap(hashMap));

        //创建一个JsonArray方法1
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(0, "kobi");
        jsonArray.put(1, "34");
        jsonArray.put(2, "ALI");
        System.out.println("jsonArray1：" + jsonArray);

        //创建JsonArray方法2
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("kobi");
        arrayList.add("34");
        arrayList.add("ALI");
        System.out.println("jsonArray2：");
        // 获取方式不同
        // 获取JSONObject中值：
        String userName = jsonObject.getString("UserName");
    }
}