package Chapter4DAndD;

public class ExercisesTenToSixteen {
    /*
    4.10 Compare and contrast the if single-selection statement and the while iteration statement.
How are these two statements similar?
1. They both have conditional expressions that must either be true before their statements can execute.

How are they different?
1. The if statement is a selection statement while the while statement is an iteration statement.

4.11 Explain what happens when a Java program attempts to divide one integer by another.
(a) What happens to the fractional part of the calculation?
A loss of precision due to truncation occurs as int will present only the whole number in the answer.

(b) How can you avoid that outcome?
By casting the expression with the unary double cast operator (double).

4.12 Describe the two ways in which control statements can be combined.
(a) By control stacking i.e. starting a control statement at the exit point of another control statement.
(b) By control nesting i.e. placing a control statement in the body of another control statement.

4.13 What type of repetition would be appropriate for obtaining an input from the user until the
user indicates there is no more input to provide?
Answer:Sentinel-Controlled iteration.
What type would be appropriate for calculating the factorial of 5?
Answer: Counter-controlled iteration.
Briefly describe how each of these tasks could be performed.
In sentinel-controlled iteration, an if statement defines a value which should be typed by the user if they want to end inputs.
While in a counter-controlled iteration, the number of times, which is known prior, is regulated by an increment or decrement statement.

4.14 If integers x and y are set to 7 and 3, what is the value of x after x = y++ and x = ++y?
Answer:
(a) The value of x after x = y++ is 3
(b) The value of x after x = ++y is 4

4.15 Identify and correct the errors in each of the following pieces of code. [Note: There may be more than one error in each piece of code.]
    a) if (age >= 65);
        System.out.println("Age is greater than or equal to 65");
       else
        System.out.println("Age is less than 65)";

 Correction:
       if (age >= 65){
        System.out.println("Age is greater than or equal to 65");
        }
       else{
        System.out.println("Age is less than 65");
        }

     b) int x == 1, total == 0;
        while (x <= 10) {
        total ++x;
        System.out.println(x);

 Correction:
      int x = 1, total = 0;
      while (x <= 10){
      System.out.println(x);
      total ++x;
      }

      c) while (x <= 100)
      total += x;
      ++x;

   Correction:
      while (x <= 100){
      total += x;
      ++x;
      }

     d) while (y =! 0)
     {
     System.out.println (y);

     Correction:
       while (y =! 0){
     System.out.println(y);
     }
}

 /*
4.16
What does the following program print?
Exercise 4.16: Mystery.java
    */

    public static class Mystery {
        public static void main(String[] args) {
            int x = -2;
            int total = 0;

            while (x <= 10) {
                int y = x + 2;
                x++;
                total += y;
                System.out.printf("Y is: %d and total is %d\n", y, total);
            }// end while

        }// end main
    } // end class Mystery
}
    /*
 Answer:
 Y is 12 and total is 78

     */

