package Chapter4DAndD;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N\t\tN2\t\tN3\t\tN4");
        for (int n = 1; n <= 5; n++) {

            int nToThePowerOfTwo = n * n;
            int nToThePowerOfThree = n * n * n;
            int nToThePowerOfFour = n * n * n * n;

            System.out.printf("%d\t\t%d\t\t%d\t\t%d%n",n, nToThePowerOfTwo, nToThePowerOfThree, nToThePowerOfFour);
        }
    }
}