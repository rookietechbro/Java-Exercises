package PracticingLoops;

public class Squares {
    public static void main(String[] args) {
        System.out.println("i       " + "Power " + "  i >> count");
        System.out.println("____________________");
        int i = 2;
        double count = 1;

        while (count <= 30) {
            System.out.println(i + "\t\t" +(int)count  + "\t\t" + (int)Math.pow(i , count));
            count++;
        }
    }
}
