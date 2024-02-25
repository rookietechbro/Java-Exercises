package Chapter4DAndD;

import java.util.Scanner;

/*
4.36 (Creating a Comparator) Write an application that works as a comparator. Your program
should read two numbers from the user and print 0 if they are equal to each other, 1 if the first
number is greater, and –1 if the second number is greater.
 */
public class CreatingAComparator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberOne = input.nextInt();
        System.out.print("Enter a number: ");
        int numberTwo = input.nextInt();

        if(numberOne == numberTwo){
            System.out.println(0);
        }
        if(numberOne > numberTwo){
            System.out.println(1);
        }
        if(numberOne < numberTwo){
            System.out.println(-1);
        }
    }
}
