package Chapter3L;

import java.util.Scanner;

/*
*3.5 (Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display
the future day of the week. Here is a sample run:
 */
public class FindFutureDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int todayDay = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int numberOfDaysAfter = input.nextInt();
        int futureDay = (numberOfDaysAfter + todayDay) % 7;


        switch(todayDay) {
                case 0:
                System.out.print("Today is Sunday ");
                break;
                case 1:
                System.out.print("Today is Monday ");
                break;
                case 2:
                System.out.print("Today is Tuesday ");
                break;
                case 3:
                System.out.print("Today is Wednesday ");
                break;
                case 4:
                System.out.print("Today is Thursday ");
                break;
                case 5:
                System.out.print("Today is Friday ");
                break;
                case 6:
                System.out.print("Today is Saturday ");
                break;
        }

        switch (futureDay) {
            case 0 -> System.out.println("and the future day is Sunday");
            case 1 -> System.out.println("and the future day is Monday");
            case 2 -> System.out.println("and the future day is Tuesday");
            case 3 -> System.out.println("and the future day is Wednesday");
            case 4 -> System.out.println("and the future day is Thursday");
            case 5 -> System.out.println("and the future day is Friday");
            case 6 -> System.out.println("and the future day is Saturday");
        }
    }
}
