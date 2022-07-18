import java.util.Scanner;

public class OdevUcakBileti {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden yazınız: ");
        int mesafe = scan.nextInt();
        double tutar = mesafe * 0.10;

        System.out.println("Yaşınızı Giriniz: ");
        int yas = scan.nextInt();

        System.out.println("Yolculuk Tipini Giriniz: (1=> Tek Yön, 2=>Gidiş-Dönüş");
        int tip = scan.nextInt();

        if (mesafe < 0 || yas < 0 || !(tip == 1 || tip == 2)) {
            System.out.println("Hatalı veri girdiniz!");
        }

        if (yas < 12) {
            tutar = (tutar - (tutar * 0.50));
        } else if (yas >= 12 && yas < 25) {
            tutar = (tutar - (tutar * 0.1));
        } else if (yas > 65) {
            tutar = (tutar - (tutar * 0.3));
        }

        if (tip == 2) {
            tutar = (tutar - (tutar * 0.2)) * 2;
        }
        System.out.println("Toplam Tutar: " + tutar);
    }
}
