package ChallengesFromOtherSources.AssignmentOnLoops;

import java.util.Objects;
import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        String answer;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int firstNumber = input.nextInt();
            System.out.print("Enter another number: ");
            int secondNumber = input.nextInt();
            int sum = firstNumber + secondNumber;
            System.out.printf("Sum is %d.\n", sum);
            System.out.println("Do you wish to perform this operation again?");
            answer = input.next();
        }
        while (Objects.equals(answer, "Yes"));
    }
}
