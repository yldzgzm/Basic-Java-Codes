import java.util.Scanner;

public class Reversed {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= scan.nextInt();

        for (int a = num; a >= 1; a--) {
            for (int b = 0; b <= (num - a); b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * a - 1; c++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
