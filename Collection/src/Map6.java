

import java.util.*;

public class Map6 {
    public static void main(String[] args) {
        // Create a Hashtable to store contacts (Name → Phone Number)
        Hashtable<String, Long> contactList = new Hashtable<>();

        // Add contacts
        contactList.put("Alice", 9876543210L);
        contactList.put("Bob", 9123456780L);
        contactList.put("Charlie", 9988776655L);

        // a) Check if a particular key exists
        String nameToCheck = "Bob";
        if (contactList.containsKey(nameToCheck)) {
            System.out.println("Contact '" + nameToCheck + "' exists with number: " + contactList.get(nameToCheck));
        } else {
            System.out.println("Contact '" + nameToCheck + "' does not exist.");
        }

        // b) Check if a particular value exists
        long phoneToCheck = 9123456780L;
        if (contactList.containsValue(phoneToCheck)) {
            System.out.println("Phone number " + phoneToCheck + " exists in the contact list.");
        } else {
            System.out.println("Phone number " + phoneToCheck + " does not exist.");
        }

        // c) Use Iterator to loop through the map
        System.out.println("\nContact List:");
        Set<Map.Entry<String, Long>> entries = contactList.entrySet();
        Iterator<Map.Entry<String, Long>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Long> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }
}