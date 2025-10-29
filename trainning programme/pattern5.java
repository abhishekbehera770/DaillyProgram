
import java.util.Scanner;

public class pattern5 {

     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();

        for (int i = 1; i <= x; i++) {//x=5
            for (int j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            for (int k = x; k >= i; k--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

//     *  *  * 
//        *  * 
//           * 