
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class StringJoiner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Read names from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names.add(sc.nextLine());
        }

        // Create StringJoiner with comma delimiter and { } brackets
        StringJoiner joiner = new StringJoiner(",", "{", "}");

        for (String name : names) {
            joiner.add(name);
        }

        // Print the final joined string
        System.out.println("Output: " + joiner.toString());

        sc.close();
    }
}