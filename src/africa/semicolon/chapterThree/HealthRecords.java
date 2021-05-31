package africa.semicolon.chapterThree;

import java.time.LocalDate;

public class HealthRecords {
    private String firstName;
    private String lastName;
    private String gender;
    private Date myDateOfBirth;
    private int height;
    private int weight;
    private int maximumHeartRate;
    private int minimumTargetHeartRate;
    private int maximumTargetHeartRate;

    public HealthRecords(String firstName, String lastName, String gender, Date myDateOfBirth, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.myDateOfBirth = myDateOfBirth;
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

    public String getDateOfBirth() {
        return myDateOfBirth.getDay() + "/" + myDateOfBirth.getMonth() + "/" + myDateOfBirth.getYear();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    public int getAge(){
        return LocalDate.now().getYear() - myDateOfBirth.getYear();


    }


    public int getMaximumHeartRate() {
        maximumHeartRate = 220 - (LocalDate.now().getYear() - myDateOfBirth.getYear());
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

    public int getBMI() {
        return (weight * 703) / (height * height);
    }
}
