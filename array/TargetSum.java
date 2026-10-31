import java.util.Scanner;

public class TargetSum {
    static int[] inputArray(int size) {
        int[] arr = new int[size];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void pairOfTrgetSum(int[] arr, int x) {
        int num1 = 0, num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if ((arr[i] + arr[j + 1]) == x) {
                    num1 = arr[i];
                    num2 = arr[j + 1];
                    break;
                }
            }
        }
        System.out.print("Pair of trageted value " + x + " is: " + num1 + ", " + num2);
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter the elements of array:");
        int[] arr = inputArray(size);
        System.out.print("Enter the targeted value: ");
        int x = sc.nextInt();
        pairOfTrgetSum(arr, x);
    }
}
