
import java.util.Scanner;

public class swap_two_num {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" enter 1st number");
        int number1 = input.nextInt();
        System.out.println(" enter 2nd nyumber");
        int number2 = input.nextInt();
        //using temp variable

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println(" num1 = " + number1);
        System.out.println(" num2 = " + number2);

        input.close();
    }
}
