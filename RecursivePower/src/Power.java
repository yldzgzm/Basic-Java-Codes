import java.util.Scanner;

public class Power {

    static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int x = scan.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int y = scan.nextInt();
        System.out.println("Sonuç: " + power(x, y));
    }


}
