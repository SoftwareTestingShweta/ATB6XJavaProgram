package ex_04052024;

import java.util.Arrays;

public class Lab136 {

    public static void main(String[] args) {
        int[] arrays = {30,40,50};
        int[] arrays2 = new int[3];

        for (int i = 0; i < arrays.length ; i++) {
            arrays2[i] = arrays[i]*2;

        }

        System.out.println("Printing Arrays!!");
        for (int i = 0; i < arrays2.length ; i++) {
            System.out.println(arrays2[i]);
        }

        System.out.println("Old array is --> " + Arrays.toString(arrays));
        System.out.println("New array is --> " + Arrays.toString(arrays2));

        // Integer.MIN_VALUE




        // Horizontal Arrays

        // Double the Arrays question?





    }
}
