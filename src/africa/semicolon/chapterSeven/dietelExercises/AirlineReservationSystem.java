package africa.semicolon.chapterSeven.dietelExercises;
import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
//import java.security.SecureRandom;
import java.util.Scanner;

public class AirlineReservationSystem {
    private FlightType flightType;
    private int seat;
    private SecureRandom random = new SecureRandom();
    private Boolean[] seatList = {false,false,false,false,false,false,false,false,false,false};
    private Boolean isSeatTaken = false;
    public void setFlightType(int input) {
        if(input == 1){
            flightType = FlightType.FIRST_CLASS;
        }else if(input == 2){
            flightType = FlightType.SECOND_CLASS;
        }
    }

    public FlightType getFlightType() {
        return flightType;
    }
    public void setSeat(){
        if(flightType == FlightType.FIRST_CLASS){
            seat = 1 + random.nextInt(5);
        }else if(flightType == FlightType.SECOND_CLASS){
            seat = 6 + random.nextInt(5);
        }
    }

    public int getSeat() {
        return seat;
    }

    public String displayBoardingPass() {
        return "Flight Type: " + flightType + "\nSeat Number: " + seat;
    }

    public Boolean[] getSeatList() {
        return seatList;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void setSeatList(){
        for(int i = 0; i <= seatList.length-1; i++){
            if(i == seat){
                seatList[i-1] = true;
                isSeatTaken = true;
            }
        }
    }
    public Boolean isSeatTaken(){
        return isSeatTaken;
    }

}
