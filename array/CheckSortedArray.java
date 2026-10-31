import java.util.Scanner;

public class CheckSortedArray {
    static int[] inputArray(int size) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void printArray(int[] arr) {
        System.out.print("Array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("" + arr[i] + " ");
        }
    }

    static Boolean checkIfArrayIsSorted(int[] arr) {
        Boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public static void main(String[] args) {
        System.out.print("Enter size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter elements of the array:");
        int[] arr = inputArray(size);
        Boolean isSorted = checkIfArrayIsSorted(arr);
        printArray(arr);
        if (isSorted) {
            System.out.print("is sorted");
        } else {
            System.out.print("is not sorted");
        }
    }
}
