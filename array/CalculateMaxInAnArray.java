// WAP to find the maximum element in an array.
/*
Algorithm:
step 1: Start
step 2: Declare an array of integers and initialize it with some values.
step 3: Initialize an integer variable max = 0;
step 4: Initialize int i = 0; and rapeat step 5
step 5: Compare if(max < arr[i]), max = arr[i]
        i++
step 6: Return max;

*/
import java.util.Scanner;

public class CalculateMaxInAnArray {
    
    // This method takes the size of an array as input and returns an array of that size filled with user-provided integers.
    static int[] inputArray(int size){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
        // Time Complexity: O(n)
    }

    // This method takes an integer array as input and returns the maximum element in the array.
    static int maxInArray(int[] arr){
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    // Time Complexity: O(n)
    }

    public static void main(String[] args){
        System.out.print("Enter the size of an array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = inputArray(size);
        sc.close();
        System.out.print("Maximum value in the array is: "+maxInArray(arr));
    }
}
