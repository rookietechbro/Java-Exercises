package Chapter5DAndD;
/*
5.1 Fill in the blanks in each of the following statements:
a) Typically, for statements are used for counter-controlled iteration and while statements for sentinel-controlled iteration.
b) The do…while statement tests the loop-continuation condition after executing the loop’s body; therefore, the body always executes at least once.
c) The switch statement selects among multiple actions based on the possible values of an integer variable or expression, or a String.
d) The continue statement, when executed in an iteration statement, skips the remaining statements in the loop body and proceeds with the next iteration of the loop.
e) The && operator (with short-circuit evaluation) can be used to ensure that two conditions are both true before choosing a certain path of execution.
f) If the loop-continuation condition in a for header is initially false, the program does not execute the for statement’s body.
g) Methods that perform common tasks and do not require objects are static methods.

5.2 State whether each of the following is true or false. If false, explain why.
a) The default case is required in the switch selection statement. False. It's a nice-to-have and not a must-have because not having it does not cause a compilation error.
b) The break statement is required in the last case of a switch selection statement. False.  It's a nice-to-have and not a must-have because not having it does not cause a compilation error.
c) The expression ((x > y) && (a < b)) is true if either x > y is true or a < b is true. False. For the short-circuit && operator, both operands must be true.
d) An expression containing the || operator is true if either or both of its operands are true. True
e) The comma (,) formatting flag in a format specifier (e.g., %,20.2f) indicates that a value should be output with a grouping separator. True
f) To test for a range of values in a switch statement, use a hyphen (–) between the start
and end values of the range in a case label.
g) Listing cases consecutively with no statements between them enables the cases to perform the same set of statements. True

5.3 Write a Java statement or a set of Java statements to accomplish each of the following tasks:
a) Sum the odd integers between 1 and 99, using a for statement. Assume that the integer
variables sum and count have been declared.

 */
public class PreliminaryExercises {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (; count <= 99 ;count++ ) {
            if (count % 2 != 0) {
                sum += count;
            }
        }
            System.out.print("Total is: " + sum);
    }
}
//Answer is 2500