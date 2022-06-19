import java.util.Scanner;

public class OdevArtikYil {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yıl Giriniz: ");
        int yil= scan.nextInt();


        if(yil%100==0){
            if(yil%400==0)
            System.out.println(yil+" bir artık yıldır!");
            else{
                System.out.println(yil+" bir artık yıl değildir!");
            }
        }
        else if(yil%4==0){
            System.out.println(yil+" bir artık yıldır!");
        }
        else
        {System.out.println(yil+" bir artık yıl değildir!");}

    }
}
