import java.util.Scanner;

public class Prime {

    static boolean prime(int x, int i) {
        if (x == 2) {
            return true;
        }
        if (x < 2 || x % i == 0) {
            return false;
        }
        if (i * i > x)
            return true;
        return prime(x, i + 1);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = scan.nextInt();
        if (prime(num, 2)) {
            System.out.println(num + " sayısı ASALDIR !");
        } else
            System.out.println(num + " sayısı ASAL değildir !");


    }


}
