import java.util.Scanner;

public class Palindrom {
    public static boolean palindrom(int a) {
        int check = 0;
        int reverse = 0;
        int temp = 0;
        temp = a;
        while (temp > 0) {
            check = temp % 10;
            reverse = reverse * 10 + check;
            temp = temp / 10;
            palindrom(temp);
        }

        if (a == reverse) {
            return true;
        } else
            return false;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to check whether is a Palindromic Number");
        int num = scan.nextInt();
        System.out.println(palindrom(num));

    }


}
