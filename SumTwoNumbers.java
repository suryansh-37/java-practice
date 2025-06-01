import java.util.InputMismatchException;
import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter first number: ");
                num1 = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer for the first number.");
                scanner.next(); // Consume the invalid input
            }
        }

        validInput = false; // Reset for the second number
        while (!validInput) {
            try {
                System.out.print("Enter second number: ");
                num2 = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer for the second number.");
                scanner.next(); // Consume the invalid input
            }
        }

        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}
