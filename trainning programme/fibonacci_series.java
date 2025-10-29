
import java.util.Scanner;

public class fibonacci_series {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" enter a range");
        int x = input.nextInt();//
        int a = 0;
        int b = 1;
        int count = 1;
        int temp;
        int sum=0;
        System.out.print(a+"\n"+b);
        while (true) 
        {
            temp = a + b;
            if (temp%2==0) {
            sum=sum+temp;
        }
            if (temp > x) {
                break;
            }
            a = b;
            b = temp;
            System.out.println(temp);

        }
        System.out.println();
        
         System.out.println("even number sum is ="+sum);

        input.close();
    }
}
