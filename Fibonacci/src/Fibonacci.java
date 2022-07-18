import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of level in Fibonacci Series: ");
        int num = scan.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                c = a + b;
                System.out.println(a + " + " + b + " = " + c);
            } else {
                System.out.println(a + " + " + b + " = " + c);
                a = b;
                b = c;
                c = a + b;
            }

        }

    }
}
