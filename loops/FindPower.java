// Get two numbers from the user and find the power of the first number raised to the second number.
import java.util.Scanner;
public class FindPower {
    public static void main(String[] args){
        System.out.print("Enter base number: ");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.print("Enter exponent number: ");
        int exponent = sc.nextInt();
        sc.close();
        int result = 1;

        for(int i = 1; i<=exponent; i++){
            result = result*base;
        }
        System.out.println(base+" raised to the power of "+exponent+" is: "+result);
    }    
}
