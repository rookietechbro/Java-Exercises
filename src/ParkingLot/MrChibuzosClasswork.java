package ParkingLot;

import java.util.Scanner;

public class MrChibuzosClasswork {
    enum GeoPoliticalZones {
        SOUTHEAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
        SOUTHSOUTH("Akwa-Ibom", "Bayelsa", "Cross_River", "Delta", "Edo", "Rivers"),
        SOUTHWEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"),
        NORTHCENTRAL("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
        NORTHEAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
        NORTHWEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa", "Zamfara");

        private String[] namesOfStates;

        GeoPoliticalZones(String... namesOfStates) {
            this.namesOfStates = namesOfStates;
        }
        public String[] getTheNameOfTheState(){
            return namesOfStates;
        }

        public static void main(String[] args) {
            Scanner state = new Scanner(System.in);
            System.out.println("Enter your state: ");
            String theState = state.next();

            System.out.println("Your State is ");
        }

    }
}