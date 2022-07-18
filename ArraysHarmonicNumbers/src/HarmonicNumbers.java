import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        double harmonic = 0;

        harmonic = getHarmonic(scan, size, array, harmonic);
        harmonic = size / harmonic;
        System.out.println("Harmonic Average of the given Array is: " + harmonic);

    }

    private static double getHarmonic(Scanner scan, int size, int[] array, double harmonic) {
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + (i + 1) + ". element: ");
            int element = scan.nextInt();
            array[i] = element;
            harmonic = harmonic + (1.0 / array[i]);
        }
        return harmonic;
    }
}
