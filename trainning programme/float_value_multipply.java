
import java.util.Scanner;

public class float_value_multipply {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" enter a floating point  number");
        float number = input.nextFloat();
        System.out.println(" enter 2nd floating nyumber");
        float number2 = input.nextFloat();

        float result = number * number2;
        System.out.println(" the multipication of the two numbers is = "+result);

        input.close();
    }
}
