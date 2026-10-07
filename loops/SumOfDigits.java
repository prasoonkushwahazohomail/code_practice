import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int oreginalNum = num;
        int sum = 0;
        int i = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
            i++;
        }
        System.out.print("Sum of digits: " + sum);
        System.out.print("\nNumber of digits: " + i);
        System.out.print("\nOreginal number: " + oreginalNum);
    }
}
