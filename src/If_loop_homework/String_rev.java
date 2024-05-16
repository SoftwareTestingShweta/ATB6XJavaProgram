package If_loop_homework;

public class String_rev {

    // Program for String reverse

    public static void main(String[] args) {

        String s = "ABCDE";
        String rev = "";

        for (int i = s.length()-1 ; i>=0 ; i--){

            rev = rev + s.charAt(i);
        }

        System.out.println("rev string is --> " + rev);
    }



}
