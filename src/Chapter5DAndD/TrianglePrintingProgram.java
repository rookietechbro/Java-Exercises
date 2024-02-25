package Chapter5DAndD;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
        String sign = "* ";
//
//        for (int count = 0; count < 10; count++){
//                System.out.println(sign);
//            sign += "* ";
//        }
//
//        for (int count = 0; count < 10; count++) {
//            for (int index = 0; count > index; index++) {
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }
//        System.out.println();
//
//        for (int count = 0; count < 10; count++) {
//            for (int index = 10; index > count; index--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int count = 0; count < 10; count++) {
            for (int count1 = 0; count1 < count; count1++) {
                System.out.print(" ");

            }
            System.out.print("");
            for (int counter = count; counter < 10; counter++) {

                System.out.print("*");
            }
            System.out.println();
        }

    }
}