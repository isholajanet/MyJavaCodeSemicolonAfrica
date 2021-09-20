package africa.semicolon.chapterEight.EmergencyResponse;

public class Caller {
    private String address;
    private String phoneNumber;
    private String emergencyNature;

    public Caller(String address, String phoneNumber, String emergencyNature){
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emergencyNature = emergencyNature;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmergencyNature() {
        return emergencyNature;
    }

    public void setEmergencyNature(String emergencyNature) {
        this.emergencyNature = emergencyNature;
    }
}
