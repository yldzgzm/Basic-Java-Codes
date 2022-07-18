package ArraysWithSorting;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysSolution {
    public static void main(String[] args) {
        int min;
        int max;
        int index;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the size of the array: ");
        int size = scan.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + ". element: ");
            int element = scan.nextInt();
            array[i] = element;
        }

        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        int[] temp = new int[size + 1];
        temp[size] = num;

        System.arraycopy(array, 0, temp, 0, size);

        Arrays.sort(temp);

        index = Arrays.binarySearch(temp, num);
        min = temp[index + 1];
        max = temp[index - 1];


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
}
