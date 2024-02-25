package ProjectsByOnyii;
public class HeartRates {

    private String firstName;
    private String lastName;
    private String birthDay;
    private String birthMonth;
    private int birthYear;
    public final int CURRENTYEAR = 2023;

    public HeartRates(String firstName, String lastName, String birthDay, String birthMonth, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int calculateAndReturnAPersonsAge() {
        int age = CURRENTYEAR - birthYear;
        return  age;
    }


//        public void minimumHeartRateCalculation() {
//            int minimumHeartRate = 220 - age;
//            System.out.printf("Your minimum heart rate is %d", minimumHeartRate);
//    }
}
