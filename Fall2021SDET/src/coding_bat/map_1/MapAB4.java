package coding_bat.map_1;

import java.util.Map;

public class MapAB4 {


    public static Map<String, String> mapAB4(Map<String, String> map) {
        if(!map.containsKey("a") || !map.containsKey("b")){ return map; }

            if (map.get("a").length() != map.get("b").length()) {
                if (map.get("a").length() > map.get("b").length()) {
                    map.put("c", map.get("a"));
                } else {
                    map.put("c", map.get("b"));
                }
            } else {
                map.put("a", "");
                map.put("b", "");
            }

        return map;
    }
}
