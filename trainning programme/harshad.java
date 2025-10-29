
import java.util.Scanner;

public class harshad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = input.nextInt();
        
        if (sum == x) {
            System.out.println(x + " is a neon number.");
        } else {
            System.out.println(x + " is not a neon number.");
        }
        input.close();
    }
}