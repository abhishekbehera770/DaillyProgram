import java.util.Scanner;

public class DisariumNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();

        int count = 0;
        int temp = x;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int sum = 0;
        temp = x;
        
        while (temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, count);
            count--;
            temp /= 10;
        }

        if (sum == x) {
            System.out.println("Disarium number");
        } else {
            System.out.println("Not a Disarium number");
        }

        input.close();
    }
}