package ChallengesFromOtherSources.PracticingLoops;

public class Squares {
    public static void main(String[] args) {
        System.out.println("i       " + "Power " + "  i >> count");
        System.out.println("------------------------------");
        int i = 2;
        int count = 1;

        while (count <= 30) {
            System.out.println(i + "\t\t" + count  + "\t\t" + (int)Math.pow(i , count));
            count++;
        }
    }
}
