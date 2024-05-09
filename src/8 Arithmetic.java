import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Arithmetic Calculator\n");

        // Prompt to input first number
        System.out.println("Please enter the first number: ");
        int first = input.nextInt();

        // Prompt to input second number
        System.out.println("Now, please enter the second number: ");
        int second = input.nextInt();

        // Addition
        int add = first + second;
        System.out.println("Addition is: " + add);

        // Subtraction
        int sub = first - second;
        System.out.println("Subtraction is: " + sub);

        // Multiplication
        int mul = first * second;
        System.out.println("Multiplication is: " + mul);

        // Division
        int div = first / second;
        System.out.println("Division is: " + div);

        // Modulus
        int mod = first % second;
        System.out.println("Modulus is: " + mod);


    }
}
