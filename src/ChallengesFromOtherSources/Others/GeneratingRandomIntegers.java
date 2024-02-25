package ChallengesFromOtherSources.Others;

/*      a. How do you generate a random integer i such that 0 <= i < 20?
        b. How do you generate a random integer i such that 10 <= i < 20?
        c. How do you generate a random integer i such that 10 <= i <= 50?
        d. Write an expression that returns 0 or 1 randomly.

 */
public class GeneratingRandomIntegers {
    public static void main(String[] args) {
       //a.
        System.out.println((int) (Math.random() * 20));
       //d.
        System.out.println((int) (Math.random() * 2));
    }
}