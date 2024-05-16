package arrays_homework;

import java.util.Arrays;

public class Double_array {

    public static void main(String[] args) {

        // Create a Program to double an array and store it also. {1,2,3} -> {2,4,6}

        int[] a = {1,2,3};
        int[] newArray = new int[a.length];

        for (int i=0; i<a.length ; i++)
        {
            newArray[i] = a[i] * 2;
          //  System.out.println(a[i]*2);
        }

        System.out.println("Original array: " + Arrays.toString(a));
        System.out.println("Doubled array: " + Arrays.toString(newArray));
    }
}
