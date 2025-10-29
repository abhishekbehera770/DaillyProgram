
// import java.util.Scanner;
// public class LCM_find_many_num {
//     // Method to calculate GCD
//     public static int gcd(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
//     // Method to calculate LCM using GCD
//     public static int lcm(int a, int b) {
//         return Math.abs(a * b) / gcd(a, b);
//     }
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter how many numbers: ");
//         int count = input.nextInt();
//         int[] numbers = new int[count];
//         System.out.println("Enter the numbers:");
//         for (int i = 0; i < count; i++) {
//             numbers[i] = input.nextInt();
//         }
//         int result = numbers[0];
//         for (int i = 1; i < count; i++) {
//             result = lcm(result, numbers[i]);
//         }
//         System.out.println("LCM of the given numbers = " + result);
//         input.close();
//     }
// }


// using GCD


// import java.util.Scanner;
// public class LCM_find_many_num {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter how many numbers: ");
//         int count = input.nextInt();
//         int[] numbers = new int[count];
//         System.out.println("Enter the numbers:");
//         for (int i = 0; i < count; i++) {
//             numbers[i] = input.nextInt();
//         }
//         // Start with the first number
//         int result = numbers[0];
//         for (int i = 1; i < count; i++) {
//             int a = result;
//             int b = numbers[i];
//             // Calculate GCD
//             while (b != 0) {
//                 int temp = b;
//                 b = a % b;
//                 a = temp;
//             }
//             int gcd = a;
//             result = Math.abs(result * numbers[i]) / gcd;
//         }
//         System.out.println("LCM of the given numbers = " + result);
//         input.close();
//     }
// }

import java.util.Scanner;

public class LCM_find_many_num {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int count = input.nextInt();

        int[] numbers = new int[count];
        System.out.println("Enter the numbers:");
        int max = 0;
        for (int i = 0; i < count; i++) {
            numbers[i] = input.nextInt();
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        int lcm = max;
        while (true) {
            boolean divisibleByAll = true;
            for (int i = 0; i < count; i++) {
                if (lcm % numbers[i] != 0) {
                    divisibleByAll = false;
                    break;
                }
            }

            if (divisibleByAll) {
                break;
            }

            lcm++;
        }

        System.out.println("LCM of the given numbers = " + lcm);

        input.close();
    }
}
