import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        fillArray(scan, size, arr);

        Arrays.sort(arr);

        printArray(arr);
    }


    private static void fillArray(Scanner scan, int size, int[] arr) {
        for (int i = 0; i < size; i++) {
            System.out.print("Please enter the " + (i + 1) + ". number: ");
            arr[i] = scan.nextInt();
        }
    }
    private static void printArray(int[] arr) {
        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
