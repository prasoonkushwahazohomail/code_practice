import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int oreginalNum = num;
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++; // count = count + 1
        }
        System.out.print("Total number of digits: " + count);
        System.out.print("\nnum: " + num);
        System.out.print("\noreginalNum: " + oreginalNum);
    }
}
