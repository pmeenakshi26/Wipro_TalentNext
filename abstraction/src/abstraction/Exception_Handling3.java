package abstraction;
 import java.util.Scanner;

// Custom exception for negative marks
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

// Custom exception for marks > 100
class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class Exception_Handling3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int NUM_STUDENTS = 2;
        final int NUM_SUBJECTS = 3;

        for (int i = 1; i <= NUM_STUDENTS; i++) {
            try {
                System.out.println("Enter name of student " + i + ":");
                String name = sc.nextLine();

                int[] marks = new int[NUM_SUBJECTS];
                int total = 0;

                for (int j = 0; j < NUM_SUBJECTS; j++) {
                    System.out.println("Enter mark " + (j + 1) + " for " + name + ":");
                    String input = sc.nextLine(); // read as string

                    int mark;
                    try {
                        mark = Integer.parseInt(input); // parse to integer
                    } catch (NumberFormatException e) {
                        throw new NumberFormatException("Invalid input: Please enter an integer.");
                    }

                    if (mark < 0) {
                        throw new NegativeValueException("Marks cannot be negative.");
                    }
                    if (mark > 100) {
                        throw new OutOfRangeException("Marks cannot be greater than 100.");
                    }

                    marks[j] = mark;
                    total += mark;
                }

                double average = total / (double) NUM_SUBJECTS;
                System.out.println("Average marks of " + name + " = " + average);
                System.out.println("--------------------------------------");

            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e.getMessage());
                System.out.println("Skipping to next student.\n");
            } catch (NegativeValueException e) {
                System.out.println("NegativeValueException: " + e.getMessage());
                System.out.println("Skipping to next student.\n");
            } catch (OutOfRangeException e) {
                System.out.println("OutOfRangeException: " + e.getMessage());
                System.out.println("Skipping to next student.\n");
            }
        }

        sc.close();
    }
}