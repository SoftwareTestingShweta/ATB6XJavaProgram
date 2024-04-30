package If_loop_homework;

import java.util.Scanner;

public class Leap_year {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year and i will tell you it is leap year or not !! ");

        int year = sc.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0 ))){
            System.out.println("Year is leap year " + year);
        }
            else {
            System.out.println("Normal year " + year);
        }


    }
}
