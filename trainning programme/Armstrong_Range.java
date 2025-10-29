
import java.util.Scanner;

public class Armstrong_Range {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get range from user
        System.out.print("Enter start of range: ");
        int start = input.nextInt();
        System.out.print("Enter end of range: ");
        int end = input.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        // Loop through the range
        for (int num = start; num <= end; num++) 
        {
            int temp = num;
            int digits = 0;
            int sum = 0;

            // Count number of digits
            int copy = temp;
            while (copy != 0) {
                digits++;
                copy /= 10;
            }

            copy = temp;
            while (copy != 0) {
                int digit = copy % 10;
                sum += Math.pow(digit, digits);
                copy /= 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }

        input.close();
    }
}