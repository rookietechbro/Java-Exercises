package Chapter3L;

import java.util.Scanner;

/*
3.32 Write a switch statement that displays Sunday, Monday, Tuesday, Wednesday,
Thursday, Friday, Saturday, if day is 0, 1, 2, 3, 4, 5, 6, accordingly.
 */
public class CheckPoint4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value between 0 & 6 to represent the day of the week: ");
        int dayOfTheWeek = input.nextInt();

        int Sunday = 0;
        int Monday = 1;
        int Tuesday = 2;
        int Wednesday = 3;
        int Thursday = 4;
        int Friday = 5;
        int Saturday = 6;


        switch (dayOfTheWeek){
            case 0: System.out.println("Sunday");break;
            case 1: System.out.println("Monday");break;
            case 2: System.out.println("Tuesday");break;
            case 3: System.out.println("Wednesday");break;
            case 4: System.out.println("Thursday");break;
            case 5: System.out.println("Friday");break;
            case 6: System.out.println("Saturday");break;
            default:
                System.out.println("Invalid Input.");

        }
    }
}