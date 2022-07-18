import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        fillArray(scan, size, arr);

        printArray(size, arr);

        check(size, arr);
    }

    private static void fillArray(Scanner scan, int size, int[] arr) {
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the " + (i + 1) + ". number: ");
            arr[i] = scan.nextInt();
        }
    }
    private static void check(int size, int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] == arr[i + 1] && arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                while (arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }
    }
    private static void printArray(int size, int[] arr) {
        System.out.print("[" + arr[0]);
        for (int i = 1; i < size; i++) {
            System.out.print(", " + arr[i]);
        }
        System.out.println("]");
    }
}
