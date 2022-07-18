import java.util.Scanner;

public class PratikBurcBulanProgram {
    public static void main(String[] args) {
        System.out.println("Doğduğunuz Ay: ");
        Scanner scan = new Scanner(System.in);
        int ay = scan.nextInt();
        System.out.println("Doğduğunuz Gün: ");
        int gun = scan.nextInt();

        if (ay == 1) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Oğlak Burcu");
            } else if (gun >= 22 && gun <= 31) {
                System.out.println("Kova Burcu");
            }
        } else if (ay == 2) {
            if (gun >= 1 && gun <= 19) {
                System.out.println("Kova Burcu");
            } else if (gun >= 20 && gun <= 28) {
                System.out.println("Balık Burcu");
            }
        } else if (ay == 3) {
            if (gun >= 1 && gun <= 20) {
                System.out.println("Balık Burcu");
            } else if (gun >= 21 && gun <= 31) {
                System.out.println("Koç Burcu");
            }
        } else if (ay == 4) {
            if (gun >= 1 && gun <= 20) {
                System.out.println("Koç Burcu");
            } else if (gun >= 21 && gun <= 30) {
                System.out.println("Boğa Burcu");
            }
        } else if (ay == 5) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Boğa Burcu");
            } else if (gun >= 22 && gun <= 31) {
                System.out.println("İkizler Burcu");
            }
        } else if (ay == 6) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("İkizler Burcu");
            } else if (gun >= 23 && gun <= 30) {
                System.out.println("Yengeç Burcu");
            }
        } else if (ay == 7) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("Yengeç Burcu");
            } else if (gun >= 23 && gun <= 31) {
                System.out.println("Aslan Burcu");
            }
        } else if (ay == 8) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("Aslan Burcu");
            } else if (gun >= 23 && gun <= 31) {
                System.out.println("Başak Burcu");
            }
        } else if (ay == 9) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("Başak Burcu");
            } else if (gun >= 23 && gun <= 30) {
                System.out.println("Terazi Burcu");
            }
        } else if (ay == 10) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("Terazi Burcu");
            } else if (gun >= 23 && gun <= 31) {
                System.out.println("Akrep Burcu");
            }
        } else if (ay == 11) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Akrep Burcu");
            } else if (gun >= 22 && gun <= 30) {
                System.out.println("Yay Burcu");
            }
        } else if (ay == 12) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("Yay Burcu");
            } else if (gun >= 22 && gun <= 31) {
                System.out.println("Oğlak Burcu");
            }
        }

    }
}
