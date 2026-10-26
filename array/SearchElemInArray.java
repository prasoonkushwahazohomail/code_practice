import java.util.Scanner;

public class SearchElemInArray {
    // This method takes the size of an array as input and returns an array of that size filled with user-provided integers.
    static int[] inputArray(int size){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    // This method takes an integer array and an integer element as input and returns the index of the element in the array if found, otherwise returns -1.
    static int searchElem(int[] arr, int elem){
        int index = -1;
        for(int i= 0; i<arr.length; i++){
            if(arr[i] == elem){
                index = i;
                return index;
            }
        }
        return index;
    }

    public static void main(String[] args){
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = inputArray(size);

        System.out.println("Enter the element to be searched: ");
        int elem = sc.nextInt();
        
        int result = searchElem(arr, elem);
        System.out.print("Result: "+result);
        
        sc.close();
    }
}
