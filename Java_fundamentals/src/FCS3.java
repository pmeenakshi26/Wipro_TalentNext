

import java.util.*;
public class FCS3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No values");
			String s = sc.nextLine();
			if(s=="") {
				System.out.println("No Values");
			}
			else {
				String[] words=s.split(" " );
				String result = String.join("," , words);
				System.out.println(result);
			}
		}

	}