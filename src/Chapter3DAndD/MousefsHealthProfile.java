package Chapter3DAndD;

import java.util.Scanner;

public class ComputerizationOfMousefsHealthRecord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = input.next();
        System.out.print("Enter your last name: ");
        String lastName = input.next();
        System.out.print("Enter your gender: ");
        String gender = input.next();
        System.out.print("Enter your day of birth: ");
        int dayOfBirth = input.nextInt();
        System.out.print("Enter the numeric representation of your month of birth, e.g., 1 (for January): ");
        int monthOfBirth = input.nextInt();
        System.out.print("Enter your year of birth: ");
        int yearOfBirth = input.nextInt();
        System.out.print("Enter your height: ");
        double height = input.nextDouble();
        System.out.print("Enter your weight: ");
        double weight = input.nextDouble();

        HealthProfile mousefsHealthRecord;
        mousefsHealthRecord = new HealthProfile(
                input.next(), input.next(), input.next(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextDouble(), input.nextDouble());
        System.out.println(mousefsHealthRecord);

        System.out.printf("Hello %s, %nFirstName: %s%nLastname: %s%nGender: %s%n", input.next(), input.next(), input.next(), input.next());
        System.out.printf("Date Of Birth: %d:%d:%d", input.nextInt(), input.nextInt(), input.nextInt());
        System.out.printf("%nHeight: %.1f%nWeight: %.1f",input.nextDouble(), input.nextDouble());
    }
}

//    ComputerizationOfHealthRecords mousefsHealthRecord = new ComputerizationOfHealthRecords(
//            input.next(), input.next(), input.next(), input.nextInt(),
//            input.nextInt(), input.nextInt(), input.nextDouble(), input.nextDouble());

//   System.out.printf("Hello %s, %nFirstName: %s%nLastname: %s%nGender: %s%n", firstName, firstName, lastName, gender);
//        System.out.printf("Date Of Birth: %d:%d:%d", dayOfBirth, monthOfBirth, yearOfBirth);
//        System.out.printf("%nHeight: %.1f%nWeight: %.1f", height, weight);