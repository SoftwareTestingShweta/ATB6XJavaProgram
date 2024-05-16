package arrays_homework;

public class Max_salary {

    public static void main(String[] args) {

        // Find the max salary in the input arrays {30,50,60,90,10,999, 100}

        int [] salary = {30,50,60,90,10,999,100};
        int maxSalary  = salary[0];

//        for (int i=0; i<salary.length; i++)
//        {
//            if (salary[i] > maxSalary )
//            {
//               maxSalary = salary[i];
//            }
//
//        }

        for (int i : salary)
        {
            if (i > maxSalary){

                maxSalary = i;
            }
        }

        System.out.println("The max salary is --> " + maxSalary );
    }
}
