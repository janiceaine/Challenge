import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Compound Interest Calculator");

        System.out.println("Please enter the principle amount Rs: ");
        int principle = input.nextInt();

        System.out.println("Now, tell me your rate of interest: ");
        float rate = input.nextFloat();

        System.out.println("Now, tell me how many years are you borrowing this money: ");
        float years = input.nextFloat();

        double CompInt = principle * Math.pow((1 + rate / 100), years);

        System.out.println("Your compound interest is Rs: " + CompInt);
    }
}
