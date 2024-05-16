package If_loop_homework;

import java.util.Scanner;

public class Count_lengthOfString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string and I will tell you its length ");
        String s = sc.next();

        int count = 0;

        for (int i =0; i<s.length(); i++){
            count = count + 1;
        }

        System.out.println("Length of string is --> " + count);
    }
}
