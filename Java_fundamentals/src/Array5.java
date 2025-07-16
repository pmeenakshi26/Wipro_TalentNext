import java.util.*;
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {65,98,62,12,3,30};
		Arrays.sort(arr);
		System.out.println("Smallest Number: "+arr[0]+","+arr[1]);
		System.out.println("Largest Number:"+arr[arr.length-2]+","+arr[arr.length-1]);
	}

}