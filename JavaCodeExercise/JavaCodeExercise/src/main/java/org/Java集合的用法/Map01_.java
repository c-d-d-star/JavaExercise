package org.Java集合的用法;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class Map01_ {
    public static void main(String[] args) {
        Map<String, String>map = new HashMap<String,String>();
        map.put("student1", "阿伟");
        map.put("student2", "小李");
        map.put("student3", "小张");
        map.put("student4", "小王");
//
//		//1.使用entrySet()遍历
        System.out.println("使用entrySet()遍历");
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry =(Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key="+key+"  value"+value);

        }
        //2.通过Map.Keyset遍历key和value,普遍使用，二次取值
        System.out.println("通过Map.Keyset遍历key和value,普遍使用，二次取值");
        for(String key:map.keySet()){
            System.out.println("Key="+key+"\tvalue="+map.get(key));
        }
        //3通过map.values()遍历所有的value，但不能遍历key
        System.out.println("通过map.values()遍历所有的value，但不能遍历key");
        for(String v:map.values()){
            System.out.println("value="+v);
        }
        //4通过map.entrySet遍历key和value(推荐使用，特别是容量大时)
        System.out.println("通过map.entrySet遍历key和value(推荐使用，特别是容量大时)");
        for(Map.Entry<String, String> entry:map.entrySet()){
            System.out.println("key="+entry.getKey()+"\tvalue="+entry.getValue());
        }

    }

}


