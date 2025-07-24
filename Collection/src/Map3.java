

import java.util.*;

public class Map3 {
    public static void main(String[] args) {
        // Create Properties object to store State-Capital pairs
        Properties stateCapitals = new Properties();

        // Add states and their capitals
        stateCapitals.setProperty("Andhra Pradesh", "Amaravati");
        stateCapitals.setProperty("Karnataka", "Bengaluru");
        stateCapitals.setProperty("Tamil Nadu", "Chennai");
        stateCapitals.setProperty("Maharashtra", "Mumbai");
        stateCapitals.setProperty("West Bengal", "Kolkata");

        // Get the entry set from the Properties
        Set<Map.Entry<Object, Object>> entries = stateCapitals.entrySet();

        // Create an Iterator to iterate over the entries
        Iterator<Map.Entry<Object, Object>> iterator = entries.iterator();

        // Display each state and its capital
        System.out.println("States and their Capitals:");
        while (iterator.hasNext()) {
            Map.Entry<Object, Object> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}