package Chapter3L;

public class CheckPoint3 {
    public static void main(String[] args) {
        //3.18
        //Assuming that x is 1, show the result of the following Boolean expressions.
        //(true) && (3 > 4)
        //!(x > 0) && (x > 0)
        //(x > 0) || (x < 0)
        //(x != 0) || (x == 0)
        //(x >= 0) || (x < 0)
        //(x != 1) == !(x == 1)

        //Solution
        // boolean okay = true;
        //int one = 3;
        //int two = 4;
        //int x = 1;

        //System.out.print((true) && (3 > 4));
        //System.out.println(!(x > 0) && (x > 0));
        //System.out.println((x > 0) || (x < 0));
        //System.out.println((x != 0) || (x == 0));
        //System.out.println((x >= 0) || (x < 0));
        //System.out.println((x != 1) == !(x == 1));

        //3.19
        //(a) Write a Boolean expression that evaluates to true if a number stored in variable
        //num is between 1 and 100. (b) Write a Boolean expression that evaluates to true if
        //a number stored in variable num is between 1 and 100 or the number is negative.

        //Solution 3.19a
        // Scanner input = new Scanner(System.in);
        //System.out.print("Enter a number between 0 & 100: ");
        //int number = input.nextInt();
        // System.out.print(number >= 1 && number <= 100);

        //3.19b
        // System.out.print("Enter a negative number between -1 & -100: ");
        //int number = input.nextInt();
        //System.out.print(number >= 1 || number <= 100 || number <= 1 || number>= 100);

        //3.20(a) Write a Boolean expression for (x - 5) < 4.5. (b) Write a Boolean expression
        //for (x - 5) > 4.5.


        //let int x = 1;
        //int x = 1;
        //boolean y = ((x -5) < 4.5);
        //boolean z = ((x -5) > 4.5);

        //System.out.println(y);
        //System.out.print(z);

        //3.21 Assume that x and y are int type. Which of the following are legal Java expressions?
        //x > y > 0 (Illegal)
        //x = y && y (Illegal)
        //x /= y  (
        //x or y    (Illegal)
        //x and y   (Illegal)
        //(x != 0) || (x = 0)   (Legal)

        //3.22 Are the following two expressions the same?
        //a. x % 2 == 0 && x % 3 == 0
        //b. x % 6 == 0
        //Answer: No.

        //3.23 What is the value of the expression x >= 50 && x <= 100 if x is 45, 67, or 101?
        // if x = 45, expression is false
        // if x = 67, expression is true
        // if x = 45, expression is false

        //Suppose, when you run the following program, you enter the input 2 3 6 from the
        //console. What is the output?
        //public class Test {
        //public static void main(String[] args) {

        //java.util.Scanner input = new java.util.Scanner(System.in);
        //double x = input.nextDouble();
        //double y = input.nextDouble();
        //double z = input.nextDouble();

        //System.out.println("(x < y && y < z) is " + (x < y && y < z));
        //System.out.println("(x < y || y < z) is " + (x < y || y < z));
        //System.out.println("!(x < y) is " + !(x < y));
        //System.out.println("(x + y < z) is " + (x + y < z));
        //System.out.println("(x + y > z) is " + (x + y > z));


//assuming x = 1, y = 2 and z = 3;
// true
// true
// false
// false
// false

        /*
        //3.25 Write a Boolean expression that evaluates to true if age is greater than 13 and less
        //than 18.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an age: ");
        int age = input.nextInt();

        boolean results = (age > 13 && age < 18);
            System.out.println(results + "\n");


        //3.26 Write a Boolean expression that evaluates to true if weight is greater than
        //50 pounds or height is greater than 60 inches.

        System.out.print("Enter a weight: ");
        int weightOne = input.nextInt();

        System.out.print("Enter a height: ");
        int heightOne = input.nextInt();

        boolean result = (weightOne > 50 || heightOne > 60);
            System.out.println(result + "\n");


        //3.27 Write a Boolean expression that evaluates to true if weight is greater than
        //50 pounds and height is greater than 60 inches.

        System.out.print("Enter a weight: ");
        int weightTwo = input.nextInt();

        System.out.print("Enter a height: ");
        int heightTwo = input.nextInt();

        boolean resultTwo = (weightTwo > 50 && heightTwo > 60);
            System.out.println(resultTwo + "\n");

        //3.28 Write a Boolean expression that evaluates to true if weight is greater than
        //50 pounds and height is greater than 60 inches.

        System.out.print("Enter a weight: ");
        int weightThree = input.nextInt();

        System.out.print("Enter a height: ");
        int heightThree = input.nextInt();

        boolean resultThree =  (weightThree > 50 ^ heightThree > 60);
            System.out.println(resultThree);

         */
        }
}