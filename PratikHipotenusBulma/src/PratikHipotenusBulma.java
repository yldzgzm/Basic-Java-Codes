import java.util.Scanner;

public class PratikHipotenusBulma {
    public static void main(String[] args){

        int a,b;
        double c,cevre;
        double u=0;
        double alan;
        Scanner scan= new Scanner(System.in);
        System.out.println("1.Kenarı Giriniz: ");
        a= scan.nextInt();
        System.out.println("İkinci Kenarı Giriniz: ");
        b=scan.nextInt();

        c=Math.sqrt((Math.pow(a,2)+Math.pow(b,2)));

        u=(a+b+c)/2;
        cevre=u*2;

        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Hipotenüs: "+c);
        System.out.println("Çevre: "+cevre);
        System.out.println("Alan: "+alan);
    }
}
