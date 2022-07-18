import java.util.Scanner;

public class OdevBMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double boy = scan.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        double kilo = scan.nextDouble();

        double BMI = kilo / Math.pow(boy, 2);
        System.out.println("Vücut Kitle İndeksiniz: " + BMI);
    }
}
