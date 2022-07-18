import java.util.Scanner;

public class Pattern {

    public static void pattern(int n) {
        if (n <= 0) {
            System.out.print(n + " ");
        } else {
            System.out.print(n + " ");
            pattern(n - 5);
            System.out.print(n + " ");

        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number n: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Output is: ");
        pattern(a);
    }


}
