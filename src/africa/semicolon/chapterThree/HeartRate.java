package africa.semicolon.chapterThree;

public class HeartRate {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;


    public HeartRate(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public Date displayDateOfBirth(){
        return dateOfBirth;
    }



}
