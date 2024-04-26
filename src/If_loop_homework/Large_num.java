package If_loop_homework;

import java.util.Scanner;

public class Large_num {

    public static void main(String[] args) {


 //     Program to Find the Largest Among Three Numbers:

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the value for num1 -->");
        int num1 = sc.nextInt();
        System.out.println("Enter the value for num2 -->");
        int num2 = sc.nextInt();
        System.out.println("Enter the value for num3 -->");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3)
        {
            System.out.println("Num1 is largest num");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Num2 is largest num");
        }else if (num3 > num1 && num3 > num2) {
            System.out.println("Num3 is largest num");
        }else {
            System.out.println("Enter a correct num");
        }

    }
}
