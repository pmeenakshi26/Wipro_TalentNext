
import java.util.*;

public class Map1 {

    // Instance variable
    private HashMap<String, String> M1;

    // Constructor to initialize the HashMap
    public Map1() {
        M1 = new HashMap<>();
    }

    // 1. Method to save country and capital in M1
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // 2. Method to get capital based on country name
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // 3. Method to get country based on capital name
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null; // if capital not found
    }

    // 4. Method to reverse the map (Capital as key, Country as value)
    public HashMap<String, String> reverseMap() {
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // 5. Method to get all country names as an ArrayList
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }

    // Main method to test the above functionalities
    public static void main(String[] args) {
        Map1 ccm = new Map1();

        // Adding countries and capitals
        ccm.saveCountryCapital("India", "Delhi");
        ccm.saveCountryCapital("Japan", "Tokyo");

        // Testing getCapital
        System.out.println("Capital of India: " + ccm.getCapital("India"));

        // Testing getCountry
        System.out.println("Country with capital Tokyo: " + ccm.getCountry("Tokyo"));

        // Testing reverseMap
        HashMap<String, String> M2 = ccm.reverseMap();
        System.out.println("Reversed Map (Capital -> Country): " + M2);

        // Testing getAllCountries
        ArrayList<String> countries = ccm.getAllCountries();
        System.out.println("All Countries: " + countries);
    }
}