
import java.util.Scanner;

public class pattern4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();

        for (int i = 1; i <= x; i++) {//x=5
            for (int j = x - 1; j >= i; j--) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

//              * 
//           *  * 
//        *  *  * 
//     *  *  *  * 
//  *  *  *  *  * 