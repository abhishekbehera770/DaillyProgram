import java.util.Scanner;

public class PrimeNumbersUpToN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = input.nextInt();

        System.out.println("Prime numbers from 1 to " + n + " are:");

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

           
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
            else{
                System.out.println("not prime");
            }
        }

        input.close();
    }
}