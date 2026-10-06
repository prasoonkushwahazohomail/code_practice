import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an option: ");

        int choice = sc.nextInt();
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sum is: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Difference is: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Product is: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Quotient is: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
