
import java.util.Scanner;

public class gcd_or_hcf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" enter 1st number");
        int a = input.nextInt();
        System.out.println("enter 2nd number");
        int b = input.nextInt();
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("gcd or hcf =" + a);

        input.close();
    }
}
