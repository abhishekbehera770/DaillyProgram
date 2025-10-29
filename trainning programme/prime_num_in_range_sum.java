
import java.util.Scanner;

public class prime_num_in_range_sum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" enter your range ");
        int x = input.nextInt();
        int sum = 0;
        for (int i = 1; i < x; i++) {
            int flag = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i);

                // sum = sum + i;

            }

        }
        // System.out.println("sum= " + sum);
        input.close();
    }
}

// import java.util.Scanner;
// public class prime_num_in_range {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter the starting number: ");
//         int start = input.nextInt();
//         System.out.print("Enter the ending number: ");
//         int end = input.nextInt();
//         System.out.println("Prime numbers between " + start + " and " + end + " are:");
//         for (int num = start; num <= end; num++) {
//             boolean isPrime = true;
//             if (num <= 1) {
//                 isPrime = false;
//             } else {
//                 for (int i = 2; i <= Math.sqrt(num); i++) {
//                     if (num % i == 0) {
//                         isPrime = false;
//                         break;
//                     }
//                 }
//             }
//             if (isPrime) { 
//                 System.out.print(num + " ");
//             }
//         }
//         int sum=0;
//         for(int k=)
//         input.close();
//     }
// }
