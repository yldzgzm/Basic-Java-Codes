import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= scan.nextInt();

        for(int i=1;i<=num;i++){
            if(Math.pow(4,i)<=num){
                System.out.println(i+"th power of 4: "+Math.pow(4,i));
            }}
            System.out.println("-----------------------------------------");
            for(int j=1;j<=num;j++){
            if(Math.pow(5,j)<=num){
                System.out.println(j+"th power of 5: "+Math.pow(5,j));
            }

        }




    }
}
