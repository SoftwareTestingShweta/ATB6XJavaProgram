package If_loop_homework;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {


//        Scanner sc =  new Scanner(System.in);
//        System.out.println("Enter a number between 1 to 100 --> ");
//        int num = sc.nextInt();

        for (int num = 1 ; num <= 100 ; num++)
       {

           if ((num % 3==0) && (num % 5 == 0)) {
            System.out.println("FizzBuzz");
           }
            else if (num % 3 == 0){
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else{
                System.out.println(num);
            }

        }




    }
}
