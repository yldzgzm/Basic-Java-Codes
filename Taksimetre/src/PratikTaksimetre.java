import java.util.Scanner;

public class PratikTaksimetre {
    public static void main(String[] args) {
        int acilis = 10;
        double km = 0;
        double ucret;

        Scanner scan = new Scanner(System.in);
        System.out.println("Toplam KM giriniz: ");
        km = scan.nextDouble();

        ucret = acilis + (km * 2.20);

        if (ucret < 20) {
            ucret = 20;
        }

        System.out.println("Ödenecek ücret: " + ucret);

    }
}
