import java.util.Arrays;

public class Array12 {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3}, {4, 5, 6} };

        int[] result = new int[2];
        result[0] = arr[0][arr[0].length / 2]; // Middle of first row
        result[1] = arr[1][arr[1].length / 2]; // Middle of second row

        System.out.println("Output: " + Arrays.toString(result));
    }
}