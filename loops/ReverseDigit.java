import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int oreginalNum = num;
        int reverse = 0;
        int count = 0;
        int digit = 0;

        while (num > 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
            count++;
        }
        System.out.print("Reverse of " + oreginalNum + " is: " + reverse);
        System.out.print("\nTotal number of digits in " + oreginalNum + " is: " + count);
    }
}
