package If_loop_homework;

import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {

        // Program to Check if a Number is Prime or Not



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no --> ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 1 ; num >= i ; i++ ) {

            if (num%i == 0)
                count = count + 1;

        }
        if (count == 2)
        {
            System.out.println("It is prime num");
        }
         else {
            System.out.println("Not a prime num");
        }
    }
}
