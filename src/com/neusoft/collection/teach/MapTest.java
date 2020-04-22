package com.neusoft.collection.teach;

import java.util.*;

/**
 * @Author: wwb
 * @Date: 2020/4/20 11:51
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(3);
        map.put("1", "xiaoming");
        map.put("2", "xiaoming2");
        map.put("2", "xiaoming3");
        map.put("22", "xiaoming3");
        map.put("23", "xiaoming23");
        map.put("3", "xiaoming3");
        Map<String,String> map2 = new HashMap<>(3);
        map2.put("1", "xiaoming");
        map2.put("2", "xiaoming2");
        map2.put("2", "xiaoming3");
        map2.put("22", "xiaoming3");
        map2.put("23", "xiaoming23");
        map2.put("3", "xiaoming3");

//        map.remove("3");
        map2.replace("3","xiaoming333");

        System.out.println(map2.size());

        String s = map2.get("4");
        System.out.println(s);

        boolean b = map2.containsKey("4");
        System.out.println(b);

        System.out.println(map2.values());
        System.out.println(map2.keySet());

        //第一种：普遍使用，二次取值
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key : map2.keySet()) {
            System.out.println("key= "+ key + " and value= " + map2.get(key));
        }

        //第二种
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第四种
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map2.values()) {
            System.out.println("value= " + v);
        }

        String strArr = "a,b,c";
        String[] split = strArr.split(",");
        List<String> tempList = Arrays.asList(split);
        System.out.println(tempList);

//        array ->Arrays
//        collection map ->Collections
        System.out.println(Collections.binarySearch(tempList, "b"));

        List<String> list1 = new ArrayList<>();
        list1.add("1a");
        list1.add("2b");
        Collections.reverse(list1);
        System.out.println(list1);

        List<Map<String,String>> list2 = new ArrayList<>();
        list2.add(map);
        list2.add(map2);

    }
}
