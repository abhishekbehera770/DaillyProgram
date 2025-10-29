import java.util.Scanner;

public class Automorphic_Num {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int x = input.nextInt();

        int digit = 0;
        int temp = x;

        while (temp != 0) {
            temp /= 10;
            digit++;
        }

        int square = x * x;
        int divisor = (int) Math.pow(10, digit);
        int result = square % divisor;

        if (result == x) {
            System.out.println(x + " is an automorphic number.");
        } else {
            System.out.println(x + " is not an automorphic number.");
        }
    }
}