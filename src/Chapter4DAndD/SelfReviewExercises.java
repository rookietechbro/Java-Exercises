package Chapter4DAndD;

public class SelfReviewExercises {
   /*
4.1 Fill in the blanks in each of the following statements:
    a) All programs can be written in terms of three types of control structures:  sequence, selection and iteration.
    b) The if...else statement is used to execute one action when a condition is true and another when that condition is false.
    c) Repeating a set of instructions a specific number of times is called counter-controlled iteration.
    d) When it’s not known in advance how many times a set of statements will be repeated, a sentinel value can be used to terminate the iteration.
    e) The sequential control structure is built into Java; by default, statements execute in the order
    they appear.
    f) Instance variables of types char, byte, short, int, long, float and double are all given
    the value 0 by default.
    g) If the increment operator is prefixed to a variable, first the variable is incremented by 1, then its new value is used in the expression.
    h) When the declaration int y = 5; is followed by the assignment y += 3.3; the value of y is 8.3 .

4.2 State whether each of the following is true or false. If false, explain why.
a) An algorithm is a procedure for solving a problem in terms of the actions to execute and the order in which they execute. TRUE
b) A set of statements contained within a pair of parentheses is called a block. TRUE
c) A selection statement repeats an action while a condition remains true. FALSE. An iteration statement does this.
A selection statement contains an expression which when true excutes and when false, nothing is done.
This is called a single-selection statement. While a double selection statement contains an expression that executes when true, else, another expression executes.
d) A nested control statement appears in the body of another control statement. TRUE
e) Java provides the arithmetic compound assignment operators +=, -=, *=, /= and %= for abbreviating assignment expressions. TRUE
f) The primitive types (boolean, char, byte, short, int, long, float and double) are poRtable across only Windows platforms. FALSE. They are portable across all platforms because of the JVM/JDK.
g) Specifying the order in which statements execute in a program is called program control. TRUE
h) The unary cast operator (double) creates a temporary integer copy of its operand. FALSE. Division between two integers will cause truncation of the answer and so,
a loss in precision. The double cast explicitly creates a temporary floating-point copy of variable total.
i) Instance variables of type boolean are given the value true by default. FALSE. By default, they are false.
j) Pseudocode helps you think out a program before attempting to write it in a programming language. TRUE

4.3 Write four different Java statements that each add 1 to integer variable x.
a. x = x + 1;
b. x += 1;
c. ++x;
d. x++;

4.4 Write Java statements to accomplish each of the following tasks:
a) Use one statement to assign the sum of x and y to z, then increment x by 1.
z = x + y;
x++;

b) Test whether variable count is greater than 10. If it is, print "Count is greater than 10".
int count;
if (count > 10) {
System.out.print("Count is greater than 10");

c) Use one statement to decrement the variable x by 1, then subtract it from variable total and store the result in variable total.
int total;
total -= --x;

d) Calculate the remainder after q is divided by divisor, and assign the result to q. Write this statement in two different ways.
q /= divisor;
q = q / divisor;

4.5 Write a Java statement to accomplish each of the following tasks:
a) Declare variable sum of type int and initialize it to 0.
int sum = 0;

b) Declare variable x of type int and initialize it to 1.
int x = 1;

c) Add variable x to variable sum, and assign the result to variable sum.
sum += x;

d) Print "The sum is: ", followed by the value of variable sum.
System.out.print("The sum is: " + sum);

4.6 Combine the statements that you wrote in Exercise 4.5 into a Java application that calculates and prints the sum of the integers
from 1 to 10. Use a while statement to loop through the calculation and increment statements. The loop should terminate when the value
of x becomes 11.
*/
   public static void main(String[] args) {
       int sum = 0;
       int x = 1;
       while (x <= 10){
           sum += x;
           x++;
       }
       System.out.print("The sum is: " + sum);
   }
}
/*
4.7 Determine the value of the variables in the statement product *= x++; after the calculation is performed.
Assume that all variables are type int and initially have the value 5.
Answer:
product will be 25
x will be 6

4.8 Identify and correct the errors in each of the following code segments—assume that all variables have been properly declared and initialized:
a)
 while (c <= 5) {
 product *= c;
 ++c;

 Correction:
 while (c <= 5) {
 product *= c;
 ++c;
 }

b)
 if (gender == 1) {
 System.out.println("Woman");
 }
 else; {
 System.out.println("Man");
 }

Correction:
if (gender == 1) {
 System.out.println("Woman");
 }
 else {
 System.out.println("Man");
 }

4.9 What is wrong with the following while statement?
 while (z >= 0) {
 sum += z;
 }

 Correction:
 An infinite loop is created here if the expression z >= 10 is true.
 To prevent this infinite loop, z has to be decremented so that eventually, it can get to 0 and the loop can end.
*/
