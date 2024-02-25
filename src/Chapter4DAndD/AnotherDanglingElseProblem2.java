package Chapter4DAndD;

public class AnotherDanglingElseProblem2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;

        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");

            } else {
                System.out.println("#####");
            }
            System.out.println("$$$$$");
            System.out.println("&&&&&");

        }
        System.out.println("\n");

        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");

            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");

            }
        }
        System.out.println(" ");

        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");

            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
            }
            System.out.println("&&&&&\n\n");

        }

         y = 7;
        if (y == 8) {
            if (x == 5) {
            }
            System.out.println("@@@@@");
        }else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");

        }
    }
}
