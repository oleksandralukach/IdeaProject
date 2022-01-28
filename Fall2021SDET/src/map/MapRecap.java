package map;

import java.util.HashMap;
import java.util.Map;

public class MapRecap {

    public static void main(String[] args) {

        // key - id
        // values - student names
        Map<Integer, String> map = new HashMap<>();

        // add new element if it doesn't exit:
        map.put(100, "John Doe");
        map.put(200, "Jina Mat");
        map.put(300, "Ira Dove");

        //100 -> Steve Jobs
        map.put(100, "Steve Jobs");

        // logic to update id 120 to point to "Melinda Gates" if 120 exist
        // if it doesn't don't do anything
        if(map.containsKey(120)){
            map.put(120, "Melinda Gates");
        }

        // another faster option -> replace() existing one
        map.replace(120, "Melinda Gates");

        // .get(key) -> return a value by providing key
        System.out.println(map.get(200));

    }
}
