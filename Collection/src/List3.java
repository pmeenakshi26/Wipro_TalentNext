
import java.util.ArrayList;
import java.util.Iterator;

public class List3 {

    // Declare ArrayList to store only strings
    private ArrayList<String> stringList;

    // Constructor to initialize the ArrayList
    public List3() {
        stringList = new ArrayList<>();
    }

    // Method to add elements to the list
    public void addString(String str) {
        stringList.add(str);
    }

    // Method to print all elements using an Iterator
    public void printAll() {
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Main method
    public static void main(String[] args) {
        List3 example = new List3();
        
        // Add some strings
        example.addString("Java");
        example.addString("Spring Boot");
        example.addString("SQL");
        example.addString("Full Stack");

        // Print all strings using iterator
        example.printAll();
    }
}