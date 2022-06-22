import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        int i;
        int total=0;
        Scanner scan= new Scanner(System.in);
        do{
            System.out.println("Please enter a number: ");
            i=scan.nextInt();
            if(i%2==0 || i%4==0){
                total+=i;
            }
        }
        while(i%2==0);
        System.out.println("Sum: "+total);




    }
}
