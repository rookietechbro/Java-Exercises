package Chapter3L;

import java.util.Scanner;

/*      1. Generate two single-digit integers into number1 and number2.
        2. If number1 < number2, swap number1 with number2.
        3. Prompt the student to answer, "What is number1 – number2?"
        4. Check the student’s answer and display whether the answer is correct.

 */
public class GeneratingRandomNumbers {
    public static void main(String[] args) {
        int numberOne = (int) (Math.random() * 10);
        int numberTwo = (int) (Math.random() * 10);

        int numberThree;

        if (numberOne < numberTwo) {
            numberThree = numberOne;
            numberOne = numberTwo;
            numberTwo = numberThree;
        }

        System.out.print("What is " + numberOne + "-" + numberTwo + "?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        int result = numberOne - numberTwo;

        if (result == answer) {
            System.out.println("You are Correct!");
        }
        else {
            System.out.println("You are INCORRECT!");
            System.out.println("The correct answer is " + result);
        }
    }
}