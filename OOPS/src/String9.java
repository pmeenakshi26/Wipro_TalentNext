
import java.util.Scanner;

public class String9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read two strings
        System.out.print("Enter first string: ");
        String a = sc.nextLine();
        
        System.out.print("Enter second string: ");
        String b = sc.nextLine();
        
        StringBuilder result = new StringBuilder();
        
        int length = Math.max(a.length(), b.length());
        
        // Loop over the longest string
        for (int i = 0; i < length; i++) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }

        System.out.println("Combined result: " + result.toString());
    }
}