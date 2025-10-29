//fiind armstrong number

import java.util.Scanner;

public class armstrong_num {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" enter a number ");
        int x = input.nextInt();//153= 1^3+5^3+3^3=153
        int temp = x;
        int count = 0;
        
        while (x != 0) {
            x = x / 10;
            count++;//count=3
        }
        temp = x;
        // double sum = 0;
        // while (x != 0) {
        //     x = x % 10;
        //     sum = sum + Math.pow(x, count);//  here we take sum value as double so we donot need to typecasting
        //     count++;// pow function is return a double type valueso we need to type cas
        // }

        int sum = 0;
        while (x != 0) {
            x = x % 10;
            sum = sum + (int) Math.pow(x, count);// we use int because sum value iis taken as int so her in use for type casting from double value to int value
            count++;// pow function is return a double type value  so we need to type cast
        }

        if (sum == temp) {
            System.out.println("The number is armstrong");
        } else {
            System.out.println("The number is not armstrong");

        }
        input.close();
    }
}
