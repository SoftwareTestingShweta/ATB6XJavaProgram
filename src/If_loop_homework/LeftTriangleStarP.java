package If_loop_homework;

public class LeftTriangleStarP {
    public static void main(String[] args) {


        int num = 5;

        for (int x = 1; x<=5; x++){
            for(int y=x; y<=5; y++){
                System.out.print(" ");
            }
         for (int z =1; z<=x ; z++) {
             System.out.print(" *");
         }
            System.out.println();
        }
    }
}
