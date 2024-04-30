package Switch_case_hw;

import java.util.Scanner;

public class Arithmetic_prog2 {

    public static void main(String[] args) {

        int x,y,z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two numbers --> ");

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("enter the operation which you want to perform");

        String operation = sc.next();
        operation = operation.toUpperCase();


        switch (operation){

            case "ADD" :
                z = x + y;
                System.out.println("Addition of 2 numbers is :" + z);
                break;
            case "SUB" :
                z = x - y;
                System.out.println("Subtraction of 2 numbers is :" + z);
                break;
            case "MULTI" :
                z = x * y;
                System.out.println("Multiplication of 2 numbers is :" + z);
                break;
            case "DIV" :
                z = x / y;
                System.out.println("Division of 2 numbers is :" + z);
                break;
            case "AVG" :
                z = (x + y) / 2;
                System.out.println("Average of 2 numbers is :" + z);
                break;
            default:
                System.out.println("Operation is invalid");
        }
            sc.close();
    }
}
