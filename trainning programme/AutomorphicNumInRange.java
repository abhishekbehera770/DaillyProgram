
import java.util.Scanner;

public class AutomorphicNumInRange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int x = input.nextInt();

        System.out.println("Automorphic numbers from 0 to " + x + ":");

        for (int i = 0; i <= x; i++) {
            int square = i * i;
            int temp = i;
            int digit = 0;

            while (temp != 0) {
                temp /= 10;
                digit++;
            }

            int divisor = (int) Math.pow(10, digit);
            int lastDigits = square % divisor;

            if (lastDigits == i) {
                System.out.println(i);
            }
        }
    }
}