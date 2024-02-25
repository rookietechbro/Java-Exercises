package Chapter5DAndD;

/*
5.5 Describe the four basic elements of counter-controlled iteration.
a) for
Used if you know the number of times the looping should occur.
Looping should occur zero or more times. If the condition at the beginning of the loop is false, the loop will never execute.
b) while
Used for sentinel-controlled iterations and if you don't know in advance the number of times the loop should occur.
Looping should occur zero or more times. If the condition at the beginning of the loop is false, the loop will never execute.
c) do...while
Looping should occur at least once. Then if the condition in the while statement is true, it occurs more times.
d) enhanced for


5.6 Compare and contrast the while and for iteration statements.
a) The while iteration statement is used especially for sentinel-controlled loops while the for loop is used for counter-controlled loops.
b) The for iteration statement gives an expression that states the number of times the loop should happen while the while iteration statement can be used for almost all iterations but not the for loops.

5.7 If you need to execute the body of a loop at least once, would it be better to use a do…while
statement or a while statement?
Answer: A do...while

5.8 Compare and contrast the break and continue statements.
With the break statement, once executed, the switch is exited and the program continues from the first statement after the switch statement. While
with the continue statement, the statement(s) the loop does not execute however, the iteration statement continues until the condition in the header becomes false.

5.9 Find and correct the error(s) in each of the following segments of code:
a) while (i = 1; i <= 10, i+)
System.out.println(i);

Correction:
for (i = 1; i <= 10; i++)
System.out.println(i);

b) The following code should print whether an integer value is negative or zero:
 switch (value) {
 Case value < 0:
 System.out.println("Negative");
 case 0:
 System.out.println("Zero");
 }

Correction::

 switch (value < 0) {
 Case value:
 System.out.println("Negative");
 case 0:
 System.out.println("Zero");
 }

c) The following code should output the odd integers from 19 to 1:
for (int i = 19; i > 1; i =+ 1)
 System.out.println(i);

Correction:

for (int i = 19; i >= 1; i -= 1){
 System.out.println(i);
}

d) The following code should output the even integers from 1 to 50:
counter = 0;
do {
 System.out.println(counter + 1);
 counter += 2;
} while (counter <= 51);

Correction:

counter = 0;
do {
 System.out.println(counter + 1);
 counter += 2;
} while (counter < 51);


5.10 What does the following program do?

 */
public class Exercises5_5To5_10 {
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);

        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 5; j++)
                System.out.print('*');
            System.out.println("\n#####");
            } // end outer for loop
    } // end main
    }
/*Answer:
        ****
        #####
        ****
        #####

 */
/*
    int counter = 0;
        do {
                System.out.println(counter + 1);
                counter += 2;
                } while (counter < 51);
 */
