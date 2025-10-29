
import java.util.Scanner;

public class lagest_3_num {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" enter 1st number");
        int x = input.nextInt();
        System.out.println(" enter 2nd nyumber");
        int y = input.nextInt();
        System.out.println(" enter 3rd nyumber");
        int z = input.nextInt();
        
        if (x > y && x > z) {
            System.out.println("largest number is " + x);
        } else if (y > x && y > z) {
            System.out.println("largest number is " + y);
        } else {
            System.out.println("largest number is " + z);
        }

        input.close();
    }
}
