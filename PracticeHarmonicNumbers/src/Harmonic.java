import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a number");
        int num= scan.nextInt();
        double harmonic=0.0;

        for(int i=1;i<=num;i++){
            harmonic=harmonic+(1.0/i);
        }
        System.out.println("Harmonic number of: "+num+" is: "+harmonic);



    }
}
