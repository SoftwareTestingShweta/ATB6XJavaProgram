package If_loop_homework;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        int sum = 0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number and I will tell you it is Perfect num or not --> ");
        int num = sc.nextInt();

        for (int i=1; i<= num/2 ; i++)
        {
            if (num%i == 0)
            {
                sum = sum + i;
            }
        }

        if (sum == num)
        {
            System.out.println("It is a perfect number " + num);
        }else {
            {
                System.out.println("It is not a perfect number " + num);
            }
        }
    }
}
