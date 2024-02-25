package Chapter5DAndD;

public class DiamondPrintingProgram {
    public static void main(String[] args) {
        String sign = "  *";
        for (int count = 0; count < 5; count += 1) {
            System.out.println(sign);
            sign += ("*" + "*");
            if (count > 5) {

            }
        }
    }
}