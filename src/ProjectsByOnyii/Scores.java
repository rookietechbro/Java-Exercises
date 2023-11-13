package ProjectsByOnyii;

import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count;
        int[] scores = new int[10];

        for(count = 0; count < 10; count++ ) {

            System.out.print("Enter a number: ");
            scores[count] = input.nextInt();

        }

    }

}
