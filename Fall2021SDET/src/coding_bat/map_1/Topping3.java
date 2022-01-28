package coding_bat.map_1;

import java.util.HashMap;
import java.util.Map;

public class Topping3 {
    //if key "potato" has a value, set it for "fries" also.
    //if key "salad", set it for key spinach
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("potato", "ketchup");
        map.put("salad", "oil");

        for (Map.Entry<String,String> entry : topping3(map).entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }
        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

}