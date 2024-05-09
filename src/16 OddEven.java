import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Odd Even Calculator\n");

        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Your number is an Even number");
        } else {
            System.out.println("Your number is an Odd number");
        }
    }
}
