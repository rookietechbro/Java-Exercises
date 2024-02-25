package ProjectsByOnyii1;

import java.util.Scanner;

public class DaysOfTheWeek2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int todaysDay = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int extraDays= input.nextInt();
        int futureDay = (todaysDay + extraDays) % 7;

        switch (todaysDay) {
            case 0 -> System.out.print("Today is Sunday and the future day is ");
            case 1 -> System.out.print("Today is Monday and the future day is ");
            case 2 -> System.out.print("Today is Tuesday and the future day is ");
            case 3 -> System.out.print("Today is Wednesday and the future day is ");
            case 4 -> System.out.print("Today is Thursday and the future day is ");
            case 5 -> System.out.print("Today is Friday and the future day is ");
            case 6 -> System.out.print("Today is Saturday and the future day is ");
        }

        switch (futureDay) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
        }

    }

}

