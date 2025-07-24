
import java.util.Vector;

public class List6 {

    public static void main(String[] args) {
        // Create a LinkedList that stores only numbers
        Vector<Number> num = new Vector<>();

        // Add different numeric types
        num.add(25);         // int -> Integer
        num.add(3.14f);      // float -> Float
        num.add(123.456);    // double -> Double
        num.add(1000L);      // long -> Long

        // Print all elements using for-each loop
        System.out.println("Elements in the Vector:");
        for (Number numberList : num) {
            System.out.println(numberList);
        }
    }
}