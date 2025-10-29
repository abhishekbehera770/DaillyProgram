
import java.util.Scanner;

public class LCM_of_2_num {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" enter 1st number");//3
        int a = input.nextInt();
        System.out.println(" enter 2nd nyumber");//5
        int b = input.nextInt();
        int max = Math.max(a, b);//5

        // int max;
        // if (a > b) {
        //     max = a;
        // } else {
        //     max = b;
        // }
        int lcm;
        while (true) {
            if ((max % a == 0) && (max % b == 0)) {
                lcm = max;
                break;
            }
            max++;
        }
        System.out.println("lcm= " + lcm);

        input.close();
    }
}
