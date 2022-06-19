import java.util.Scanner;

public class OdevManav {
    public static void main(String[] args) {
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5.0;
        double tutar=0;
        int kilo;

        Scanner scan=new Scanner(System.in);
        System.out.println("Armut kaç kilo olacak?: ");
        kilo=scan.nextInt();
        tutar+=kilo*armut;

        System.out.println("Elma kaç kilo olacak?: ");
        kilo=scan.nextInt();
        tutar+=kilo*elma;

        System.out.println("Domates kaç kilo olacak?: ");
        kilo=scan.nextInt();
        tutar+=kilo*domates;

        System.out.println("Muz kaç kilo olacak?: ");
        kilo=scan.nextInt();
        tutar+=kilo*muz;

        System.out.println("Patlıcan kaç kilo olacak?: ");
        kilo=scan.nextInt();
        tutar+=kilo*patlican;

        System.out.println("Ödenecek toplam tutar: "+tutar);
    }

}
