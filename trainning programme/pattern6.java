
import java.util.Scanner;

public class pattern6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {//x=4
            for (int j = x-1; j >= i; j--) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 1; i <= x; i++) {//x=4
            for (int j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            for (int k = x - 1; k >= i; k--) {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
}

//        * 
//     *  * 
//  *  *  * 
//     *  * 
//        * 