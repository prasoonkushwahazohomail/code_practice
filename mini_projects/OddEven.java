import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        System.out.println("Enter an integer: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("The number is even.");
        }else{
            System.out.println("The number is odd.");
        }
    }
}
