import java.util.Scanner;

public class CalculatingPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter base number: ");
        int b = scan.nextInt();

        System.out.println("Please enter exponent number: ");
        int ex = scan.nextInt();
        int num = 1;

        for (int i = 1; i <= ex; i++) {
            num = num * b;
            if (ex == 0) {
                num = 1;
            }
        }
        System.out.println("Base " + b + " for " + ex + " times: " + num);


    }

}
