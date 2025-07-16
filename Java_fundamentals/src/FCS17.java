import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int num=121,temp,rev=0,dig;
		temp=num;
		while(num!=0){
		 dig=num%10;
		 rev=rev*10+dig;
		 num/=10;
		}
		if(temp==rev){
		    
		    System.out.println("Palindrome");
		}else{
		    System.out.println("Not Palindrome");
		}
		
	}
}
