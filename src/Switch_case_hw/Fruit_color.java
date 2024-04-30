package Switch_case_hw;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fruit_color {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruit name and i will tell you that fruit color --> ");

        String fruit = sc.next();
        fruit = fruit.toUpperCase();

        switch (fruit){

            case "APPLE","STRAWBERRY" -> System.out.println("RED");
            case "BANANA","LEMON","PINEAPPLE","MANGO" -> System.out.println("YELLOW");
            case "GRAPES","WATERMELON","KIWI","GUAVA" -> System.out.println("GREEN");
            case "PAPAYA","ORANGE" -> System.out.println("ORANGE");
            default -> System.out.println("This fruit is out of box");
        }
    }
}
