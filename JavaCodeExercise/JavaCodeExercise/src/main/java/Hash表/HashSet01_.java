package Hash表;

import java.util.HashMap;
import java.util.HashSet;

public class HashSet01_ {


    public static void main(String[] args) {
        HashMap<String,Integer> hashMap =new HashMap<>();

       hashMap.put("cdd",1);
       hashMap.put("cdd",1);
       hashMap.put("xll",2);

        for (String c: hashMap.keySet()) {
            String value = String.valueOf(hashMap.get(c));
            System.out.println(c+ ": " + value);

        }

        System.out.println(hashMap.containsKey("cdd"));

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // 不会重复添加

        boolean exists = hashSet.contains("Apple"); // exists = true

        for (String element : hashSet) {
            System.out.println(element);
        }


    }
}
