package practice.use_hashmap_linkedhashmap_treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedMap = new LinkedHashMap<>(16,0.75f,true);
        linkedMap.put("smith", 30);
        linkedMap.put("Anderson", 31);
        linkedMap.put("Lewis", 29);
        linkedMap.put("Cook", 29);
        System.out.println("\nThe age for Lewis is " + linkedMap.get("Lewis"));
    }
}
