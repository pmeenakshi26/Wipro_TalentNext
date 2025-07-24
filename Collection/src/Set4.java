import java.util.TreeSet;
import java.util.Iterator;

public class Set4 {

    // Instance variable: TreeSet to store country names in sorted order
    private TreeSet<String> H1;

    // Constructor to initialize the TreeSet
    public Set4() {
        H1 = new TreeSet<>();
    }

    // Method to add a country and return the updated TreeSet
    public TreeSet<String> saveCountryNames(String CountryName) {
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
        return null; // If not found
    }

    // Main method to test functionality
    public static void main(String[] args) {
        Set4 cts = new Set4();

        // Add countries
        cts.saveCountryNames("India");
        cts.saveCountryNames("USA");
        cts.saveCountryNames("Germany");
        cts.saveCountryNames("Canada");

        // Display the TreeSet (sorted order)
        System.out.println("Countries in the TreeSet: " + cts.H1);

        // Search for countries
        String result1 = cts.getCountry("USA");
        System.out.println("Searching for 'Germany': " + (result1 != null ? "Found" : "Not Found"));

        String result2 = cts.getCountry("France");
        System.out.println("Searching for 'France': " + (result2 != null ? "Found" : "Not Found"));
    }
}