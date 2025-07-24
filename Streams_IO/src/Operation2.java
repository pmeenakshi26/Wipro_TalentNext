import java.io.*;
import java.util.*;

public class Operation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input file name
        System.out.println("Enter the input file name");
        String inputFile = sc.nextLine();

        // Output file name
        System.out.println("Enter the output file name");
        String outputFile = sc.nextLine();

        try {
            FileInputStream inStream = new FileInputStream(inputFile);
            FileOutputStream outStream = new FileOutputStream(outputFile);

            int byteData;
            while ((byteData = inStream.read()) != -1) {
                outStream.write(byteData);
            }

            inStream.close();
            outStream.close();

            System.out.println("File is copied.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }
}