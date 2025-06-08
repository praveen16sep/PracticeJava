package com.javacode.collections;
import java.util.HashMap;
import java.util.Map;

public class Example {

    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>() {{
            put("a", "b");
            put("c", "d");
        }};
        iterateUsingForEach(myMap);
    }

    public static void iterateUsingForEach(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key=" + key + ", Value=" + value);
        }
    }
}
