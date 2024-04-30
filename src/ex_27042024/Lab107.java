package ex_27042024;

import java.util.Scanner;

public class Lab107 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any table and i will tell you table of that no --> ");
        int num = sc.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x"  + i  + " = " + (num*i));
        }
        // ! =

    }
}
