import java.util.Scanner;

public class PratikKullaniciGirisi {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Kullanıcı Adı: ");
        String ad=scan.nextLine();
        System.out.println("Şifreniz: ");
        String sifre=scan.nextLine();

        if(ad.equals("Kodluyoruz") && sifre.equals("JavaDersleri")){
            System.out.println("Giriş Başarılı!");
        }
        else{
            System.out.println("Kullanıcı adı veya şifre yanlış!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
            System.out.print("Şifrenizi sıfırlamak isterseniz 1'e basın.");
            int talep= scan.nextInt();
            if(talep==1){
                System.out.println("Yeni şifrenizi giriniz: ");
                String yeni=scan.next();
                if(yeni.equals("JavaDersleri") || yeni.equals(sifre)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                }
                else if(!(yeni.equals("JavaDersleri") || yeni.equals(sifre))) {
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }



    }
}
