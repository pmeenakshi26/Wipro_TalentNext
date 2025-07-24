

import java.util.*;

public class Map4 {
    public static void main(String[] args) {
        // Use Long for phone numbers
        HashMap<String, Long> contacts = new HashMap<>();

        // Add contacts
        contacts.put("Alice", 9876543210L);
        contacts.put("Bob", 9123456780L);
        contacts.put("Charlie", 9988776655L);
        contacts.put("David", 9090909090L);

        // a) Check if a particular key exists
        String searchName = "Bob";
        if (contacts.containsKey(searchName)) {
            System.out.println(searchName + " is in the contact list.");
        } else {
            System.out.println(searchName + " is not in the contact list.");
        }

        // b) Check if a particular value exists
        long searchNumber = 9988776655L;
        if (contacts.containsValue(searchNumber)) {
            System.out.println("Phone number " + searchNumber + " exists in the contact list.");
        } else {
            System.out.println("Phone number " + searchNumber + " does not exist in the contact list.");
        }

        // c) Use Iterator to loop through the map
        System.out.println("\nAll Contacts:");
        Set<Map.Entry<String, Long>> entrySet = contacts.entrySet();
        Iterator<Map.Entry<String, Long>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Long> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }
}