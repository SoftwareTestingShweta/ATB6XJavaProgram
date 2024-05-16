package arrays_homework;

import java.util.Scanner;

public class All_marks {

    public static void main(String[] args) {

        // Create a Program which takes arrays and print all the marks.



        Scanner sc = new Scanner(System.in);
        int [] marks = new int[4];

        System.out.println("Enter the sub1 marks --> ");
        marks [0] = sc.nextInt();
        System.out.println("Enter the sub2 marks --> ");
        marks [1] = sc.nextInt();
        System.out.println("Enter the sub3 marks --> ");
        marks [2] = sc.nextInt();
        System.out.println("Enter the sub4 marks --> ");
        marks [3] = sc.nextInt();


//        for (int i=0; i< marks.length ;i++) {
//            System.out.println("marks in sub : " + marks[i]);
//        }

        for (int i : marks)
        {
            System.out.println("marks in sub : " + i);
        }











    }
}
