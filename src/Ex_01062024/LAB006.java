package Ex_01062024;

import java.util.HashMap;
import java.util.Map;

public class LAB006 {
    public static void main(String[] args) {
        // Map - key value pair
        // API Testing - JSON - JavaScript Object Notation - Map
        // JSON - key value pair
        // HashSet and HastMap
        // name - pramod, age - 65, roll - 1, course -atb
        Map<String, Object> studentMap = new HashMap();
//        studentMap.put("firstname", "Pramod");
        studentMap.put("firstname", "Prachi");
        studentMap.put("age", 27);
        studentMap.put("roll", 1);
        studentMap.put("course", "ATB");
        studentMap.put("lastname", "Yelkar");
        studentMap.put("isFemale", true);
        System.out.println(studentMap);
        System.out.println(studentMap.get("firstname"));
        System.out.println(studentMap.get("age"));
        System.out.println(studentMap.isEmpty());
        System.out.println(studentMap.containsKey("age"));
        System.out.println(studentMap.containsValue(27));
        System.out.println(studentMap.keySet());
        System.out.println(studentMap.values());

        for(Map.Entry<String,Object> item: studentMap.entrySet()){
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}
