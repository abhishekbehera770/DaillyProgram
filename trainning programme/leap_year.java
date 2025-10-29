
//A year is leap, if it is divisible by 4 and 400. But, not by 100.
import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a year");
        int year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        
        input.close();
        
    }
}
