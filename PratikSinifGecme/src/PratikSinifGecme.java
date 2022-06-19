import java.util.Scanner;

public class PratikSinifGecme {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,muzik;
        double toplam=0;

        Scanner scan=new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");
        mat= scan.nextInt();
        if(!(mat<0 ||mat>100)){
            toplam+=mat;
        }
        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik= scan.nextInt();
        if(!(fizik<0 ||fizik>100)){
            toplam+=fizik;
        }
        System.out.println("Türkçe Notunuzu Giriniz: ");
        turkce= scan.nextInt();
        if(!(turkce<0 ||turkce>100)){
            toplam+=turkce;
        }
        System.out.println("Kimya Notunuzu Giriniz: ");
        kimya= scan.nextInt();
        if(!(kimya<0 ||kimya>100)){
            toplam+=kimya;
        }
        System.out.println("Müzik Notunuzu Giriniz: ");
        muzik= scan.nextInt();
        if(!(muzik<0 ||muzik>100)){
            toplam+=muzik;
        }

        double ort=toplam/5;

        if(ort<55){
            System.out.println("Sınıfta Kaldınız!");
            System.out.println("Ortalamanız: "+ort);
        }
        else if(ort>=55){
            System.out.println("Sınıfı Geçtiniz!");
            System.out.println("Ortalamanız: "+ort);

        }


    }
}
