import java.io.*;
import java.util.*;

public class Operation3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input and output file names
        System.out.print("Enter input file name: ");
        String inputFileName = sc.nextLine();

        System.out.print("Enter output file name: ");
        String outputFileName = sc.nextLine();

        // TreeMap stores words in sorted order
        Map<String, Integer> wordCountMap = new TreeMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            String line;

            while ((line = reader.readLine()) != null) {
                // Remove punctuation and convert to lowercase
                line = line.replaceAll("[^a-zA-Z]", " ").toLowerCase();

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            reader.close();

            // Write to output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                writer.write(capitalize(entry.getKey()) + " " + entry.getValue());
                writer.newLine();
            }

            writer.close();

            System.out.println("Word count written to '" + outputFileName + "' successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Capitalize first letter of a word
    private static String capitalize(String word) {
        if (word.length() == 0) return word;
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
}