import java.util.Scanner;

public class NeonNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = input.nextInt();

        int square = x * x;
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }

        if (sum == x) {
            System.out.println(x + " is a neon number.");
        } else {
            System.out.println(x + " is not a neon number.");
        }
        input.close();
    }
}