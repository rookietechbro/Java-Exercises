package ChapterThreeL;

/*
*3.6 (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
let the user enter weight, feet, and inches. For example, if a person is 5 feet and 10
inches, you will enter 5 for feet and 10 for inches. Here is a sample run:

Enter weight in pounds: 140
Enter feet: 5
Enter inches: 10
BMI is 20.087702275404553
Normal

Body Mass Index (BMI) is a measure of health based on height and weight. It can be calculated
by taking your weight in kilograms and dividing it by the square of your height in
meters. The interpretation of BMI for people 20 years or older is as follows:

BMI                      Interpretation
BMI < 18.5               Underweight
18.5 ≤ BMI < 25.0        Normal
25.0 ≤ BMI < 30.0        Overweight
30.0 ≤ BMI               Obese

BMI = weight (lb) ÷ height^2 (inches) * 703.
 */

import java.util.Scanner;

public class HealthApplicationBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter feet: ");
        int feet = input.nextInt();
        System.out.print("Enter inches: ");
        int inches = input.nextInt();

        int height = (feet * 12) + inches;

        double BMI = weight / (height * height) * 703;
        System.out.println("BMI is "+ BMI);

        if (BMI < 18.5){
            System.out.print("Underweight");
        }
        else if (BMI >= 18.5 && BMI < 25.0){
            System.out.print("Normal");
        }
        else if (BMI >= 25.0 && BMI < 30.0){
            System.out.print("Overweight");
        }
        else if (BMI >= 30.0){
            System.out.print("Obese");
        }

    }
}
