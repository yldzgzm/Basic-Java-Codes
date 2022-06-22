import java.util.Scanner;

public class DivisibleNumbers {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= scan.nextInt();
        int total=0;
        double avg=0;

        for(int i=1;i<num;i++){
            if(i%3==0 || i%4==0){
                total++;
                avg+=i;
            }
        }
        avg=avg/total;
        System.out.println("Total numbers these are divisible by 12: "+total);
        System.out.println("Average of these numbers: "+avg);



    }
}
