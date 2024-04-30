package If_loop_homework;

import java.util.Scanner;

public class VowelConso {

    public static void main(String[] args) {

        // Program to Check if a Character is a Vowel or a Consonant.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character and I will tell you it is vowel or consonant --> ");
        char ch = sc.next().charAt(0);

//        if (ch == 'a' || ch == 'A'){
//            System.out.println("It is vowel " + ch);
//        } else if (ch == 'e' || ch == 'E') {
//            System.out.println("It is vowel " + ch);
//        }else if (ch == 'i' || ch == 'I') {
//            System.out.println("It is vowel " + ch);
//        }else if (ch == 'o' || ch == 'O') {
//            System.out.println("It is vowel " + ch);
//        }else if (ch == 'u' || ch == 'U') {
//            System.out.println("It is vowel " + ch);
//        }else {
//            System.out.println("Given character is a consonant");
//        }

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("It is vowel " + ch);
        } else {
            System.out.println("Given character is a consonant");
        }

    }
}
