import java.util.HashSet;
import java.util.Iterator;

public class Set1 {

    // Instance variable: HashSet to store country names
    private HashSet<String> H1;

    // Constructor: initialize the HashSet
    public Set1() {
        H1 = new HashSet<>();
    }

    // Method to add a country and return the updated HashSet
    public HashSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }

    // Method to search for a country and return it if found
    public String getCountry(String CountryName) {
        Iterator<String> it = H1.iterator();
        while (it.hasNext()) {
            String country = it.next();
            if (country.equalsIgnoreCase(CountryName)) {
                return country;
            }
        }
        return null;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Set1 cs = new Set1();

        // Add some countries
        cs.saveCountryNames("India");
        cs.saveCountryNames("USA");
        cs.saveCountryNames("Germany");

        // Print the entire HashSet
        System.out.println("Countries in the HashSet: " + cs.H1);

        // Search for a country
        String searchResult1 = cs.getCountry("USA");
        System.out.println("Search for 'USA': " + (searchResult1 != null ? "Found" : "Not Found"));

        String searchResult2 = cs.getCountry("France");
        System.out.println("Search for 'France': " + (searchResult2 != null ? "Found" : "Not Found"));
    }
}