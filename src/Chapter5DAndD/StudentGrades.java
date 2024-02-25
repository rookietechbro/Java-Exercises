package Chapter5DAndD;

import java.util.Scanner;

/*
5.17 (Student Grades) A group of five students earned the following grades: Student 1, ‘A’; student 2, 'C'; student 3, ‘B’; student 4, ‘A’ and student 5, ‘B’. Write an application that reads a series
of pairs of numbers as follows:
a) student name
b) student letter grade
Your program should use a switch statement to determine how many students got a grade of ‘A’,
how many got a grade of ‘B’, how many got a grade of ‘C’, and how many got a grade of ‘D’. Use a
loop as needed to input the five student grades, and then finally display the results
 */
public class StudentGrades {
    public static void main(String[] args) {
        int gradeACount = 0;
        int gradeBCount = 0;
        int gradeCCount = 0;

        Scanner input = new Scanner(System.in);
        for (int studentCount = 1; studentCount <= 5; studentCount++) {
            System.out.print("Enter your name: ");
            String studentName = input.next();
            System.out.print("Enter your grade in Capital letters ONLY: ");
            String grade = input.next();
            System.out.printf("Student's Name: %s%nStudent's Grade: %s%n", studentName, grade);
            switch (grade) {
                case "A" -> gradeACount++;
                case "B" -> gradeBCount++;
                case "C" -> gradeCCount++;
            }
            System.out.println();
        }
        System.out.println("Total number of students with 'A' grade: " + gradeACount);
        System.out.println("Total number of students with 'B' grade: " + gradeBCount);
        System.out.println("Total number of students with 'C' grade: " + gradeCCount);

    }
}
