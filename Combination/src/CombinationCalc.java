import java.util.Scanner;

public class CombinationCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number n: ");
        int n = scan.nextInt();

        System.out.println("Please enter number r: ");
        int r = scan.nextInt();

        int nfac = 1;
        int rfac = 1;
        int subsfac = 1;

        for (int i = n; i >= 1; i--) {
            nfac = nfac * i;
        }

        for (int j = r; j >= 1; j--) {
            rfac = rfac * j;
        }

        for (int k = (n - r); k >= 1; k--) {
            subsfac = subsfac * k;
        }

        int formula;
        formula = nfac / (rfac * subsfac);

        System.out.println("Combination of number " + n + " and " + r + " is: " + formula);


    }
}
