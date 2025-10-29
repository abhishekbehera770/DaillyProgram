
import java.util.Scanner;

public class even_or_odd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" enter 1st number");
        int x = input.nextInt();
        if (x % 2 == 0) {
            System.out.println("enen number");
        } else {
            System.out.println("odd number");
        }

        input.close();
    }
}
