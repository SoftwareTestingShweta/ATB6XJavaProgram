package Switch_case_hw;

import java.util.Scanner;

public class KK_prog {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age and I will tell you who is he/she-->");
        int age = sc.nextInt();

        switch (age){

            case 33 -> System.out.println("She is Shruti");
            case 30 -> System.out.println("She is Shweta");
            case 42 -> System.out.println("He is Shrikant");
            case 32 -> System.out.println("He is Rahul");
            case 9 -> System.out.println("She is Kavya");
            case 0 -> System.out.println("He is Krishang");
            default -> System.out.println("I don't know who is he/she");

        }

    }
}
