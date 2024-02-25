package ChapterThreeL;

/*      a. How do you generate a random integer i such that 0 <= i < 20?
        b. How do you generate a random integer i such that 10 <= i < 20?
        c. How do you generate a random integer i such that 10 <= i <= 50?
        d. Write an expression that returns 0 or 1 randomly.


public class GeneratingRandomIntegers {
    public static void main(String[] args) {
        // b
     double f = Math.random()/Math.nextDown(1.0);
     double randomNumber;
        randomNumber = 10 * (1.0 - f) + 20 * f;
        System.out.println(randomNumber);
    }
}

//b.
public class GeneratingRandomIntegers {
    public static void main(String[] args) {
        int i = 10 + (int)(Math.random() * 10);
        System.out.print(i);
    }
}

//c
public class GeneratingRandomIntegers {
    public static void main(String[] args) {
        int i = 10 + (int)(Math.random() * 41);
        System.out.print(i);
    }
}
//d.
public class GeneratingRandomIntegers {
    public static void main(String[] args) {
        int i = (int)(Math.random() * 2);
        System.out.print(i);
    }
}
*/
//a.
public class GeneratingRandomIntegers {
    public static void main(String[] args) {
        int i = (int)(Math.random() * 20);
        System.out.print(i);
    }
}