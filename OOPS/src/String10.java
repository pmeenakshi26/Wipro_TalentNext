
import java.util.Scanner;
public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String a=sc.nextLine();
		int b=sc.nextInt();
		String lastNChars=a.substring(a.length() -b);
		StringBuilder result=new StringBuilder();
		for(int i=0;i<b;i++) {
			result.append(lastNChars);
		}
		System.out.println(result.toString());

	}

}