package africa.semicolon.chapterThree;

import java.time.LocalDate;

public class HeartRate {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private int maximumHeartRate;
    private int minimumTargetHeartRate;
    private int maximumTargetHeartRate;


    public HeartRate(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void displayName() {

        System.out.println(firstName+ ' '+ lastName);
    }


    public String getDateOfBirth(){
        return dateOfBirth.getDay() + "/" + dateOfBirth.getMonth() + "/" + dateOfBirth.getYear();
    }

    public int getAge(){
        return LocalDate.now().getYear() - dateOfBirth.getYear();


    }


    public int getMaximumHeartRate() {
        maximumHeartRate = 220 - (LocalDate.now().getYear() - dateOfBirth.getYear());
        return maximumHeartRate;
    }


    public int getMinimumTargetHeartRate() {
        minimumTargetHeartRate = (50 * maximumHeartRate) / 100;
        return minimumTargetHeartRate;

    }

    public int getMaximumTargetHeartRate() {
        maximumTargetHeartRate = (85 * maximumHeartRate)/ 100;
        return maximumTargetHeartRate;
    }

    public void displayTargetHeartRate() {
        System.out.printf("The target heart rate is in between %d and %d ", minimumTargetHeartRate, maximumTargetHeartRate);
    }
}
