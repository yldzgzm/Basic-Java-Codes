import java.util.Scanner;

public class PratikNotOrtalamasiHesaplayanProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matematik, fizik, kimya, turkce, tarih, muzik = 0;
        double ort = 0;
        String out;

        System.out.println("Matematik notunuzu giriniz: ");
        matematik = scan.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = scan.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = scan.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = scan.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih = scan.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = scan.nextInt();

        ort = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Ortalamanız: " + ort);

        out = (ort < 60) ? "Sınıfta Kaldı" : "Sınıfı Geçti";
        System.out.println(out);
    }
}
