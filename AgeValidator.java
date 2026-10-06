import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args){
        System.out.println("Please enter your age: ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age<=12){
            System.out.println("You are a child.");
        }else if(age>12 && age<18){
            System.out.println("You are a teenager.");
        }else{
            System.out.println("You are an adult.");
        }
    }
}
