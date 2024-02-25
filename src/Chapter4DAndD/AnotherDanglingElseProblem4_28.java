package Chapter4DAndD;

public class AnotherDanglingElseProblem4_28 {
    public static void main(String[] args) {
        int x = 9;
        int y = 11;

        if (x < 10) {
            if (y > 10) {
                System.out.println("*****");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
            }
        }
        //Answer is ***** since both the first and second outputs are true.
        x = 11;
        y = 9;
        if (x < 10) {
            if (y > 10) {
                System.out.println("*****");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
            }
        }
        //No output since the first if statement is false.
    }
}
