package coding_bat.map_1;

import java.util.Map;

/**
 * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.
 *
 * mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
 * mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
 * mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
 * Go...Save, Compile, Run (ctrl-enter)Map API

 */
public class mapShare {

    public Map<String, String> mapShare(Map<String, String> map) {

        if(map.containsKey("c")){
            map.remove("c");
        }
        if(map.containsKey("a")){
            map.put("b", map.get("a"));
        }
        return map;
    }

}
