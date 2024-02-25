package Chapter4DAndD;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
//        System.out.println("Year\t\tAnticipated World Population   Year End Numerical Increase");
        System.out.println("Year\t\t\tAnticipated World Population\t\tYear End Numerical Increase");

        double worldPopulationRateIn2022 = 0.83;
        int year = 0;
        long currentWorldPopulation = 7_975_105_156L;
        for (int count = 0; count < 75; count++) {

            long anticipatedWorldPopulationNumber = (long) (currentWorldPopulation * (Math.pow((1 + (worldPopulationRateIn2022 / 100)), count)));
            long yearEndWorldPopulationNumericalIncrease = anticipatedWorldPopulationNumber - currentWorldPopulation;
            year++;

           System.out.println(year + "\t\t\t\t" + anticipatedWorldPopulationNumber + "\t\t\t\t\t\t\t" + yearEndWorldPopulationNumericalIncrease);
//           System.out.printf("%-4d%18s%30d%n", year, anticipatedWorldPopulationNumber, yearEndWorldPopulationNumericalIncrease);
        }
    }
}