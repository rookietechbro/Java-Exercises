package Chapter4DAndD;
/*
) Write an application that uses only the output statements to display the checkerboard pattern that follows.
A System.out.println method call with no arguments causes the program to output a single newline character.
[Hint: Iteration statements are required.]
 */
public class CheckerboardPatternOfAsterisks {
    public static void main(String[] args) {
        for (int count = 0; count < 4; count++) {
            for (int count1 = 0; count1 < 8; count1++) {
                System.out.print("* ");
                System.out.print(" ");
            }
            System.out.println();
            for (int count2 = 0; count2 < 8; count2++) {
                System.out.print(" ");
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}