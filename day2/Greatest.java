import java.util.Scanner;

public class Greatest {
    // Function to find the greatest of three numbers using short-circuit operators
    public static int greatestOfThree(int a, int b, int c) {
        // Using short-circuit operators to determine the greatest number
        int greatest = (a >= b && a >= c) ? a : ((b >= c) ? b : c);
        return greatest;
    }

    public static void main(String[] args) {
        // Input three numbers
        try (Scanner scanner = new Scanner(System.in)) {
            // Input three numbers
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter third number: ");
            int num3 = scanner.nextInt();
            
            // Find the greatest number
            int greatestNumber = greatestOfThree(num1, num2, num3);
            
            // Print the result
            System.out.println("The greatest of the three numbers is: " + greatestNumber);
        }
    }
}
