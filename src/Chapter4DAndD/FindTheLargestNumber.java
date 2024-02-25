package Chapter4DAndD;

import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers.");
        System.out.println();
        int largestNumber = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter number " + count + ": ");
            int number = input.nextInt();

            if(number > largestNumber){
                largestNumber = number;
            }
        }
            System.out.println("The largest number is " + largestNumber);
    }
}
