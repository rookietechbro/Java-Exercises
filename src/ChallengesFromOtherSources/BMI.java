package ChallengesFromOtherSources;

/*
Body Mass Index (BMI) is a measure of health based on height and weight. It can be calculated
by taking your weight in kilograms and dividing it by the square of your height in
meters. The interpretation of BMI for people 20 years or older is as follows:

BMI < 18.5 Underweight
18.5 ≤ BMI < 25.0 Normal
25.0 ≤ BMI < 30.0 Overweight
30.0 ≤ BMI Obese

Write a program that prompts the user to enter a weight in pounds and height in inches and
displays the BMI. Note that one pound is 0.45359237 kilograms and one inch is 0.0254
meters.

 */

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextInt();
        System.out.print("Enter your height in inches: ");
        double height = input.nextInt();

        //Since 1 pound = 0.45359237kilograms
        //and 1 inch = 0.0254meters

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        //bmi = weight / (height * height)

        double weightForBmi = weight * KILOGRAMS_PER_POUND;
        double heightForBmi = height * METERS_PER_INCH;

        double bmi = weightForBmi / (heightForBmi * heightForBmi);

        System.out.printf("BMI is %.17f.\n",bmi);
        System.out.println("BMI is " + bmi);

        if (bmi < 18.5){
            System.out.println("Underweight!");
        }
        if (bmi >= 18.5 && bmi < 25.0){
            System.out.println("Normal.");
        }
        if (bmi > 25.0 && bmi < 30.0){
            System.out.println("Overweight!");
        }
        if (bmi > 30.0){
            System.out.println("Obese!");
        }
    }
}
