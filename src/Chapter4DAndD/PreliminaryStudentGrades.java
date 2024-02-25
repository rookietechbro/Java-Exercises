package Chapter4DAndD;

public class Preliminaries {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter score: ");
        int studentGrade = input.nextInt();

        if (studentGrade >= 90) {
            System.out.println("A");
        }
        else if (studentGrade >= 80) {
            System.out.println("B");
        }
        else if (studentGrade >= 70) {
            System.out.println("C");
        }
        else if (studentGrade >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
