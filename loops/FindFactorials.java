import java.util.Scanner;

public class FindFactorials {
    public static void main(String[] args){
        System.out.print("Enter number to get factorials: ");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        sc.close();
        long i = 1;
        long fact = 1;

        while(num>=1){
            fact = fact*i;
            System.out.println("Factorial of "+i+": "+fact);
            num--;
            i++;
        }
    }
}
