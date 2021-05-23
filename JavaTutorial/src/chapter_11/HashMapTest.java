/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        // 实例化
        Map<String, String> map = new HashMap<>();

        // 添加元素
        map.put("server", "java");
        // String value = map.put("first", "javascript");
        // System.out.println(value);
        System.out.println("------------");

        System.out.println(map.get("first"));
        System.out.println("------------");

        map.put("web", "html&css");
        map.put("driver", "c");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " --> " + map.get(key));
        }
        System.out.println("------------");

        //     Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //     for (Entry<String,String> entry : entrySet) {
        //         String key = entry.getKey();
        //         String value = entry.getValue();
        //         System.out.println(key + " ---> " + value);

        //     }

        Map<String, String> map2 = new HashMap<>();
        map2.put("data", "python");
        map2.put("web", "javascript");
        map2.putAll(map);
        Set<String> keys2 = map2.keySet();
        for (String key : keys2) {
            String value = map2.get(key);
            System.out.println(key + " ---> " + value);
        }
        System.out.println("------------");

        map.remove("web");
        System.out.println(map);
        System.out.println("------------");

        System.out.println(map.containsKey("server"));
        System.out.println(map.containsValue("python"));
    }
}
