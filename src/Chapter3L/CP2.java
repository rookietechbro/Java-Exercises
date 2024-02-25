package ChapterThreeL;

import java.util.Scanner;

public class CP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("State the number: ");
        int number = input.nextInt();

       // if (number % 2 == 0) {
            //even = true;
            // else
            //even = false;
        //}

       //boolean even
           //     = number % 2 == 0;
     //   System.out.println(even + ".");

        if (number % 2 == 0)
            System.out.println
                    (number + " is even");
        else if (number % 5 == 0)
            System.out.println
                    (number + " is multiple of 5");
    }
}
