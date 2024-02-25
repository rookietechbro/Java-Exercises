package Chapter3DAndD;

public class ComputerizationOfHealthRecords {
    public static void main(String[] args) {

    }
    private String firstName;
    private String lastName;
    private String gender;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private double height;
    private double weight;
    public final int CURRENT_YEAR = 2023;

    public ComputerizationOfHealthRecords(String firstName, String lastName, String gender, int dayOfBirth, int monthOfBirth, int yearOfBirth, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
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

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public int ageInYears() {
        int age = CURRENT_YEAR - yearOfBirth;
        System.out.printf("Age: %d", age);
        return age;
    }

    public int maximumHeartRate() {
        int heartRate;
        return heartRate = 220 - (CURRENT_YEAR - yearOfBirth);
    }

    public int targetHeartRateRange() {
        int targetHeartRateRangeMin = (50 * (220 - (CURRENT_YEAR - yearOfBirth))) / 100;
        int targetHeartRateRangeMax = (85 * (220 - (CURRENT_YEAR - yearOfBirth))) / 100;
        int targetHeartRange = targetHeartRateRangeMax - targetHeartRateRangeMin;
        return targetHeartRange;
    }

    public double BMI() {
        return (double) weight / (height * height);
    }

}