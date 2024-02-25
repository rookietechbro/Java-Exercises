package Chapter4DAndD;
/*
4.35 (Write a Java statement) What will be the value of x after executing the following Java
statement? Assume that value of x is 5 before the execution.
x += x++ - 5;

Answer:
5 += 5 - 5;
5 += 0;
5
Answer is 5.
 */
public class WriteAJavaStatement {
    public static void main(String[] args) {
        int x = 5;
        System.out.printf("The answer is %d.",x += x++ - 5 );
    }
}
