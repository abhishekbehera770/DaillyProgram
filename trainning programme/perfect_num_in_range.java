
import java.util.Scanner;

public class perfect_num_in_range {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.println("Enter a number:");
        int x = input.nextInt();

        for (int i = 1; i <= x; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {

                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                System.out.println(sum);
            }
        }
    }
}
