import java.util.Scanner;

public class PratikSayiSiralama {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int bir= scan.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int iki= scan.nextInt();
        System.out.println("Üçüncü sayıyı giriniz : ");
        int uc= scan.nextInt();



         if(bir<iki && bir<uc){
            if(iki<uc){
                System.out.println("Sıralama: "+bir+"<="+iki+"<="+uc);
            }
            else{
                System.out.println("Sıralama: "+bir+"<="+iki+"<="+uc);
            }
        }
        else if(iki<bir && iki<uc){
            if(bir<uc){
                System.out.println("Sıralama: "+iki+"<="+bir+"<="+uc);
            }
            else{
                System.out.println("Sıralama: "+iki+"<="+uc+"<="+bir);
            }
        }

        else {
            if(bir<iki){
                System.out.println("Sıralama: "+uc+"<="+bir+"<="+iki);
            }
            else{
                System.out.println("Sıralama: "+uc+"<="+iki+"<="+bir);
            }
        }

    }
}
