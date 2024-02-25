package ChallengesFromOtherSources.Others;

import java.util.Scanner;

/*      1. Generate two single-digit integers into number1 and number2.
        2. If number1 < number2, swap number1 with number2.
        3. Prompt the student to answer, "What is number1 – number2?"
        4. Check the student’s answer and display whether the answer is correct.

 */
public class GeneratingRandomNumbers {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        if (number1 < number2) {
            int number3 = number1;
            number1 = number2;
            number2 = number3;
        }

        System.out.printf("What is %d - %d?\n", number1, number2);
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        int result = number1 - number2;

        if (result == answer) {
            System.out.println("Correct!\nWell done Champ!");
        }
        else {
            System.out.println("Incorrect!");
            System.out.printf("Your answer should be %d.\nBetter luck next time!", result);
        }
    }
}