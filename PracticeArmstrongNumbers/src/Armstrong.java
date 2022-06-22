import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter number: ");
        int num= scan.nextInt();

        int total=0;
        int numOfDigits=0;
        int temp;
        temp=num;

        do{

            temp=temp/10;
            numOfDigits++;
        }
        while(temp!=0);

        for(int i=0;i<=numOfDigits;i++){
            total=total+(num%10);
            num=num/10;
        }

        System.out.println("Sum of the number is: "+total);




    }
}
