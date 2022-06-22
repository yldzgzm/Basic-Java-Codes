import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number of the inputs: ");
        int num= scan.nextInt();
        int min=0;
        int max=0;

        for(int i=1;i<=num;i++){
            System.out.println("Enter the "+i+"th number: ");
            int check= scan.nextInt();

            if(check<min){
                min=check;
            }

            if(check>max){
                max=check;
            }

        }

        System.out.println("The largest number is: "+max);
        System.out.println("The smallest number is: "+min);



    }
}
