
public class Array2 {

	public static void main(String[] args) {
		int[] num = {5,6,10,20,52,41};
		int max = num[0];
		int min = num[0];
		for(int i = 1;i<num.length;i++) {
			if(num[i]>max) {
				max = num [i];
			}
			if(num[i]<min) {
				min = num[i];
			}
		}
		System.out.println("Max value: "+ max);
		System.out.println("Min value: "+min);

	}

}
