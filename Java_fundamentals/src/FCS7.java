
import java.util.*;
public class FCS7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a single alphabet character: ");
	        char ch = sc.next().charAt(0);

	        if (ch >= 'a' && ch <= 'z') {
	            char upper = (char)(ch - 32);
	            System.out.println(ch + "->" + upper);
	        } else if (ch >= 'A' && ch <= 'Z') {
	            char lower = (char)(ch + 32);
	        
	            System.out.println(ch + "->" + lower);
	        }
	        else {
	           System.out.println("Invalid Input");
	        }
	   }
}