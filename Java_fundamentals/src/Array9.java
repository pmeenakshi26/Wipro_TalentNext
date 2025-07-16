public class Array9 {
    public static void main(String[] args) {
        int[] arr = {1, 10, 2, 10};
        int[] result = new int[arr.length];
        int index = 0;

        // Copy all elements that are not 10
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 10) {
                result[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with 0
        while (index < arr.length) {
            result[index] = 0;
            index++;
        }

        // Print the final result
        System.out.print("Output: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}