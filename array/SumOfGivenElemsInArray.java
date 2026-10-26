import java.util.Scanner;

public class SumOfGivenElemsInArray{

    // This method takes the size of an array as input and returns an array of that size filled with user-provided integers.
    static int[] inputArray(int size){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.print("Enter the elements of an array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    // This method takes an integer array as input and returns the sum of its elements.
    static int sumOfArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.print("Enter the size of an array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = inputArray(size);
        sc.close();
        System.out.print("Sum of all elements in the array is: "+sumOfArray(arr));
    }
}