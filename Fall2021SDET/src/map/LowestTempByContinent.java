package map;

import java.util.HashMap;
import java.util.Map;

public class LowestTempByContinent {
    public static void main(String[] args) {

        Map<String, Float> temperatureMap = new HashMap<>();
        temperatureMap.put("North America", -81F);
        temperatureMap.put("South America", -27F);
        temperatureMap.put("Antarctica", -128F);
        temperatureMap.put("Africa", -29F);
        temperatureMap.put("Asia", -70F);

        System.out.println(temperatureMap.get("Africa"));

        temperatureMap.put("Asia", -91F); // updates the value
    }
}
