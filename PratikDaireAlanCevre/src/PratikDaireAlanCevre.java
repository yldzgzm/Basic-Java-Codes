import java.util.Scanner;

public class PratikDaireAlanCevre {
    public static void main(String[] args){
        double pi=3.14;
        int r;
        double alan;
        double cevre;
        double dilimAlan;
        double a;

        Scanner scan= new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz: ");
        r= scan.nextInt();

        System.out.println("Daire diliminin merkez açısının ölçüsünü giriniz: ");
        a= scan.nextDouble();

        cevre=2*pi*r;
        alan=pi*Math.pow(r,2);
        dilimAlan=alan*a/360;

        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dairenin çevresi: "+cevre);
        System.out.println("Daire diliminin alanı: "+dilimAlan);




    }
}
