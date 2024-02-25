package ChapterThreeL;

import java.util.Scanner;

/*
Write an if statement that assigns 1 to x if y is greater than 0.
 */

public class CheckPoint2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value to y: ");
        int y = input.nextInt();
        int x = 0;

        if (y > 0){
            x = 1;
            System.out.println("x = " + x);
        }
    }
}
