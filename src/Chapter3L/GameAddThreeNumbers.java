package Chapter3L;

/*
(Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
two integers and prompts the user to enter the sum of these two integers.
Revise the program to generate three single-digit integers and prompt the user to
enter the sum of these three integers.
 */

import java.util.Scanner;

public class GameAddThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = input.nextInt();

        int firstDigit = number / 100;
        int secondDigit = (number % 100) / 10;
        int thirdDigit = number % 10;

        System.out.printf("What is %d + %d + %d? \nAnswer: ", firstDigit, secondDigit, thirdDigit);
        int userAnswer = input.nextInt();

        int correctAnswer = firstDigit + secondDigit + thirdDigit;

        if (userAnswer == correctAnswer){
            System.out.println("You are CORRECT!");
        }
        else {
            System.out.println("That's INCORRECT!\nBetter luck next time!");
        }
    }
}