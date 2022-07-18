import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int a = scan.nextInt();
        System.out.println("Please enter the second number: ");
        int b = scan.nextInt();

        int lcm = 1;
        int gcd = 1;
        int i = 1;
        while (i <= (Math.min(a, b))) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                i++;
            } else {
                i++;
                continue;

            }
        }
        lcm = a * b / gcd;
        System.out.println("Greatest Common Divisor of the number " + a + " and number " + b + " is: " + gcd);
        System.out.println("Least Common Multiple of the number " + a + " and number " + b + " is: " + lcm);

    }
}
