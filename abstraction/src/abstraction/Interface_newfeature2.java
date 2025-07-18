package abstraction;

interface Test {
    int myFunction(int a, int b, int c);
}

public class Interface_newfeature2 {  // Changed class name to follow Java naming conventions

    public static void main(String[] args) {
        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;

        int sum = t1.myFunction(20, 50, 30);     // 100
        int product = t2.myFunction(3, 5, 7);    // 105

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
