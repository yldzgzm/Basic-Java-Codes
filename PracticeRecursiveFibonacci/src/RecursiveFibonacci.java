import java.util.Scanner;

public class RecursiveFibonacci {
    public static int Fibo(int step) {

        if (step == 1 || step == 2) {
            return 1;
        }
        return Fibo(step - 1) + Fibo(step - 2);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the step number: ");
        int num = scan.nextInt();
        System.out.println(Fibo(num));

    }


}
