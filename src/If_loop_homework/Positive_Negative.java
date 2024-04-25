package If_loop_homework;

import java.util.Scanner;

public class Positive_Negative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number --> ");

        int num = sc.nextInt();

        if(num >= 1)
        {
            System.out.println("Given num is +ve num -->" );
        } else if (num < 0) {
            System.out.println("Given num is -ve num -->");
        }else {
            System.out.println("Given num is zero num -->");
        }

        sc.close();
    }
}
