import java.util.Scanner;

public class NeonNumInRange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int x = input.nextInt();

        System.out.println("Neon numbers from 1 to " + x + ":");

        for (int i = 1; i <= x; i++) {
            int square = i * i;
            int sum = 0;
            int temp = square;

            while (temp != 0) {
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}