import java.util.Scanner;

public class PratikHesapMakinesi {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz: ");
        int ilk=scan.nextInt();
        System.out.println("İkinci Sayıyı Giriniz:  ");
        int ikinci= scan.nextInt();

        System.out.println("1-Toplama \n2-Çıkartma \n3-Çarpma \n4-Bölme");
        System.out.println("Yapmak istediğiniz işlem: ");
        int islem= scan.nextInt();

        switch(islem){
            case 1:
                System.out.println("Toplama: "+(ilk+ikinci));
                break;
            case 2:
                System.out.println("Çıkartma: "+(ilk-ikinci));
                break;
            case 3:
                System.out.println("Çarpma: "+(ilk*ikinci));
                break;
            case 4:
                if(ikinci==0){
                    System.out.println("0'a bölme işlemi gerçekleşemez!");
                }
                else
                System.out.println("Bölme: "+Double.valueOf(ilk)/Double.valueOf(ikinci));
                break;
        }

    }
}
