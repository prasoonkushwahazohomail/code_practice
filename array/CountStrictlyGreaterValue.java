import java.util.Scanner;

public class CountStrictlyGreaterValue {
    static int[] inputArray(int size) {
        System.out.println("Enter the elements of the array:");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int countStrictlyGreaterValue(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = inputArray(size);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        int count = countStrictlyGreaterValue(arr, x);
        System.out.println("Count of srtictly greater values than " + x + " is: " + count);
    }
}
