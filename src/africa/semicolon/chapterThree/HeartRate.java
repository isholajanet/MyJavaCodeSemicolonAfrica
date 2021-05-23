package africa.semicolon.chapterThree;




public class HeartRate {
    private String firstName;
    private String lastName;
    private Date dateOfBirth = new Date();

    public HeartRate(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public HeartRate(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Date getDate() {
        return dateOfBirth;
    }

    public void setDate(int month, int day, int year) {
        dateOfBirth.setDay(day);
        dateOfBirth.setMonth(month);
        dateOfBirth.setYear(year);
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

    public void DisplayName() {
        System.out.println(firstName+ ' '+ lastName);
    }

    @Override
    public String toString() {
        return "HeartRate{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth.displayDate() +
                '}';
    }
}
