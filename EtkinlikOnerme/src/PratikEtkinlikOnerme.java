import java.util.Scanner;

public class PratikEtkinlikOnerme {
    public static void main(String[] args) {
        System.out.println("Sıcaklığı Giriniz: ");
        Scanner scan = new Scanner(System.in);
        int sicaklik = scan.nextInt();

        String s = (sicaklik <= 5) ? "Kayak Yapabilirsiniz" :
                sicaklik < 15 ? "Sinemaya Gidebilirsiniz" :
                        sicaklik < 25 ? "Pikniğe Gidebilirsiniz" : "Yüzmeye Gidebilirsiniz";

        System.out.println(s);
    }
}
