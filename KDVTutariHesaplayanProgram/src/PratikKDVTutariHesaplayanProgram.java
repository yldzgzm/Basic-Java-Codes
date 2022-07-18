import java.util.Scanner;

import static java.lang.Math.round;

public class PratikKDVTutariHesaplayanProgram {
    public static void main(String[] args) {
        double tutar;
        double KDV;
        double tutarKDV;

        Scanner scan = new Scanner(System.in);
        System.out.println("Tutarı Giriniz: ");
        tutar = scan.nextDouble();

        if (0 < tutar && tutar <= 1000) {
            KDV = 0.18;
            tutarKDV = tutar + (tutar * KDV);
            System.out.println("KDV'siz Fiyat = " + tutar);
            System.out.println("KDV'li Fiyat = " + tutarKDV);
            System.out.println("KDV tutarı =" + Math.round(tutar * KDV * 100.0) / 100.0);
        } else if (tutar > 1000) {
            KDV = 0.08;
            tutarKDV = tutar + (tutar * KDV);
            System.out.println("KDV'siz Fiyat = " + tutar);
            System.out.println("KDV'li Fiyat = " + tutarKDV);
            System.out.println("KDV tutarı =" + tutar * KDV);
        }
    }
}
