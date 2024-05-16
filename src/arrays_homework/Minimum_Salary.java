package arrays_homework;

public class Minimum_Salary {
    public static void main(String[] args) {


        int [] a = {20,30,80,10,45,90,12};
        int min = a[0];

        for (int i=0; i< a.length; i++)
        {
            if (a[i] < min)
            {
                min = a[i];
            }
        }
        System.out.println(" min number is : " + min);
    }
}


