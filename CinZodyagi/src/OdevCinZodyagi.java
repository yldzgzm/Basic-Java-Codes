import java.util.Scanner;

public class OdevCinZodyagi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz: ");
        int yil = scan.nextInt();
        int kalan = yil % 12;

        System.out.print("Çin Zodyağı Burcunuz:");
        switch (kalan) {
            case 0:
                System.out.println("Maymun");
                break;
            case 1:
                System.out.println("Horoz");
                break;
            case 2:
                System.out.println("Köpek");
                break;
            case 3:
                System.out.println("Domuz");
                break;
            case 4:
                System.out.println("Fare");
                break;
            case 5:
                System.out.println("Öküz");
                break;
            case 6:
                System.out.println("Kaplan");
                break;
            case 7:
                System.out.println("Tavşan");
                break;
            case 8:
                System.out.println("Ejderha");
                break;
            case 9:
                System.out.println("Yılan");
                break;
            case 10:
                System.out.println("At");
                break;
            case 11:
                System.out.println("Koyun");
                break;


        }

    }
}
