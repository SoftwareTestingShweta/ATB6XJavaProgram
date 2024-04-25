package ex_18042024;

public class Lab049 {

    public static void main(String[] args) {
//        int a = 10;
//        System.out.println(++a + a++ + a++);
        //  Part ->  A -> ++a , Exp1 = 11 , a = 11
        //  Part ->  B -> a++ , Exp2 = 11 , a = 12
        //  Part ->  C -> a++, Exp3 = 12 , a = 13

        // op ->  exp1+ exp2+exp3
        // a ? = 13

        int a =5;
//
//        System.out.println(a++ + a++ + ++a + a++ +a++ + ++a); //47
//        System.out.println(a); //11

          System.out.println(a-- + ++a + --a + a++ +a-- +--a + ++a); //
          System.out.println(a);

//        int b = 6;
//
//        System.out.println(++b + ++b + b++ + ++b + b++ + ++b);
//        System.out.println(b);




    }
}
