

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map2 {

    public static void main(String[] args) {
        // Creating a HashMap that stores String keys and values
        HashMap<String, String> map = new HashMap<>();

        // Adding entries to the map
        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington");
        map.put("UK", "London");

        // a) Check if a particular key exists
        String keyToCheck = "India";
        if (map.containsKey(keyToCheck)) {
            System.out.println("Key \"" + keyToCheck + "\" exists in the map.");
        } else {
            System.out.println("Key \"" + keyToCheck + "\" does not exist.");
        }

        // b) Check if a particular value exists
        String valueToCheck = "London";
        if (map.containsValue(valueToCheck)) {
            System.out.println("Value \"" + valueToCheck + "\" exists in the map.");
        } else {
            System.out.println("Value \"" + valueToCheck + "\" does not exist.");
        }

        // c) Using Iterator to loop through the map
        System.out.println("\nMap entries using Iterator:");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}