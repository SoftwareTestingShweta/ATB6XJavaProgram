package ex_23042024;

import java.util.Scanner;

public class Lab073 {

    public static void main(String[] args) {
        // Even and Odd Number
        // 7 - odd , 4 - even
        // num%2 == 0 -> even
        // else it is a odd

//        2 | 11| 5 - Q| |
//            10 |
//                1- R

  //      int num = 12;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and I will tell you is it odd or even num --> ");
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }





    }
}
