package Arrays;

import java.util.Scanner;

public class ArraysSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        int min;
        int max;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + ". element: ");
            int element = scan.nextInt();
            array[i] = element;
        }

        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        min = getMin(size, array, num);
        max = getMax(size, array, num);

        System.out.println();
        System.out.print("Array : {");
        for (int l = 0; l < size; l++) {
            if (l == size - 1) {
                System.out.print(array[l]);
            } else
                System.out.print(array[l] + ",");
        }
        System.out.println("}");
        System.out.println("Entered number : " + num);
        System.out.println("The nearest number smaller than the entered number : " + max);
        System.out.println("The nearest number larger than the entered number : " + min);
    }

    private static int getMin(int size, int[] array, int num) {
        int min = (int) Math.pow(2, 31);
        for (int k = 0; k < size; k++) {
            if (num < array[k]) {
                if (array[k] < min)
                    min = array[k];
            }
        }
        return min;
    }

    private static int getMax(int size, int[] array, int num) {
        int max = -(int) Math.pow(2, 31) - 1;
        for (int j = 0; j < size; j++) {
            if (array[j] < num) {
                if (array[j] > max)
                    max = array[j];
            }
        }
        return max;
    }
}
