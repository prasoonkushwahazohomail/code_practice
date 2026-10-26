import java.util.Scanner;

public class SumOfGivenElemsInArray{
    public static void main(String[] args){
        System.out.print("Enter the size of an array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        System.out.print("Enter the elements of an array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.print("Sum of all elements in the array is: "+sum);
    }
}