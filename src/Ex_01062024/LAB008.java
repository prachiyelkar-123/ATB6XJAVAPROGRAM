package Ex_01062024;

import java.util.HashMap;
import java.util.Map;

public class LAB008 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("firstName", "pramod");
        map.put("lastName", "pawar");
        map.put("email", "dasda@addad.omc");
        map.put("phone", "1234567890");
        map.put("city", "Pune");
        map.put("state", "MH");
        map.put("country", "India");
        map.put("zip", "411057");
       System.out.println(map);
    }
}
