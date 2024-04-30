package Switch_case_hw;

import java.util.Scanner;

public class Arithmetic_prog {

    public static void main(String[] args) {

        int x,y,z;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter 2 numbers");

        x=sc.nextInt();

        y=sc.nextInt();

        System.out.println("Enter Method type ADD/SUB/MULTIPLY/DIV/AVERAGE");
        char user_input = sc.next().charAt(0);






//        System.out.println("Enter Method type ADD/SUB/MULTIPLY/DIV/AVERAGE" );
//        String methodType =sc.nextLine();
//        methodType = methodType.toLowerCase();

        switch (user_input){

            case '+' :

                z=x+y;

                System.out.println("Addition of 2 numbers:\n"+z);

                break;

            case '-' :

                z=x-y;

                System.out.println("Subtraction of 2 numbers:\n"+z);

                break;

            case '*' :

                z=x*y;

                System.out.println("Multiplication of 2 numbers:\n"+z);

                break;

            case '/' :

                z=x/y;

                System.out.println("Division of 2 numbers:\n"+z);

                break;

            case 'a' :

                z=((x+y)/2);

                System.out.println("Average of 2 numbers:\n"+z);

                break;

            default:

                System.out.println("invalid method");

        }
        sc.close();
    }
}
