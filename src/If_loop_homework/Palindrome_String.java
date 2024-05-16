package If_loop_homework;

import java.util.Scanner;

public class Palindrome_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word and I will tell you it is palindrome string or not --> ");
        String text = sc.next();

        String org_str = text;

         String rev = "";
        int len = text.length();

        for (int i=len-1; i>=0 ; i--)
        {
            rev = rev + text.charAt(i);
        }

        if(rev.equals(org_str))
        {
            System.out.println("Palindrome " + org_str);
        }else {
            System.out.println("Normal " + org_str);
        }


        System.out.println("*************************************");

        // with using reverse() function

//        StringBuilder sb = new StringBuilder(org_str);
//        String rev = sb.reverse().toString();
//
//        if (rev.equalsIgnoreCase(org_str)){
//            System.out.println("It is palindrome " +rev);
//        }else {
//            System.out.println("Not a Palindrome " + rev);
//        }

    }

}