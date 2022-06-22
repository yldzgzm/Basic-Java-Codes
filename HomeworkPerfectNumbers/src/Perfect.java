import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= scan.nextInt();
        int total=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                total+=i;
            }
            else continue;
        }
        if(num==total){
            System.out.println(num+" is a perfect number");
        }
        else{
            System.out.println(num+" is not a perfect number");
        }


    }
}
