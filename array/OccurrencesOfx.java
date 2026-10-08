import java.util.Scanner;

public class OccurrencesOfx {

    static int countOccurrences(int[] arr, int x) {
        int count = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        int occucrrences = countOccurrences(arr, x);
        System.out.println("The number of occurrences of " + x + " in the array is: " + occucrrences);
    }
}
