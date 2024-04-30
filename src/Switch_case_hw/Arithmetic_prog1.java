package Switch_case_hw;

import java.util.Scanner;

public class Arithmetic_prog1 {

    public static void main(String[] args) {

        int x, y, z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers:");
        x = sc.nextInt();
        y = sc.nextInt();

        // Consume the newline character
        sc.nextLine();

        System.out.println("Enter Method type ADD/SUB/MULT/DIV/AVG:");
        String methodType = sc.nextLine().toUpperCase();

//          String methodType = sc.nextLine();
//          System.out.println("Enter Method type ADD/SUB/MULT/DIV/AVG:");
//          methodType = methodType.toUpperCase();


        switch (methodType) {

            case "ADD":
                z = x + y;
                System.out.println("Addition of 2 numbers: " + z);
                break;

            case "SUB":
                z = x - y;
                System.out.println("Subtraction of 2 numbers: " + z);
                break;

            case "MULT":
                z = x * y;
                System.out.println("Multiplication of 2 numbers: " + z);
                break;

            case "DIV":
                if (y != 0) {
                    z = x / y;
                    System.out.println("Division of 2 numbers: " + z);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;

            case "AVG":
                z = (x + y) / 2;
                System.out.println("Average of 2 numbers: " + z);
                break;

            default:
                System.out.println("Invalid method");
        }
    }
}
