import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the size of the row: ");
        int row = scan.nextInt();
        System.out.print("Please enter the size of the column: ");
        int column = scan.nextInt();

        int[][] matrix = new int[row][column];
        int[][] transpose = new int[column][row];

        scanInfo(scan, row, column, matrix, transpose);

        printInfo(matrix, transpose);
    }

    private static void scanInfo(Scanner scan, int row, int column, int[][] matrix, int[][] transpose) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter the " + (i + 1) + ". row " + (j + 1) + ". column: ");
                matrix[i][j] = scan.nextInt();
                transpose[j][i] = matrix[i][j];
            }
        }
    }

    private static void printInfo(int[][] matrix, int[][] transpose) {
        System.out.println("Matrix: ");
        for (int[] rw : matrix) {
            for (int col : rw) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
        System.out.println("Transpose: ");
        for (int[] rw : transpose) {
            for (int col : rw) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }

}