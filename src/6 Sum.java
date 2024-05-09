import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Create scanner objet to read input from thr keyboard
        Scanner input = new Scanner(System.in);
        // Display welcome message
        System.out.println("Welcome to our calculator");
        // prompt user to enter their first
        System.out.println("Please enter the first number: ");
        // Read user's input as an integer
        int firstNumber = input.nextInt();
        // prompt user to enter their second number
        System.out.println("Please enter the second number: ");
        // Read user's input as an integer
        int secondNumber = input.nextInt();
        // sum of numbers
        int sum = firstNumber + secondNumber;
        // Display sum of numbers
        System.out.println("Sum of your numbers is: " + sum);
    }
}
