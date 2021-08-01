package africa.semicolon.chapterSeven.dietelExercises;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
//import java.security.SecureRandom;
import java.util.Scanner;

public class AirlineReservationSystem {
    public static void main(String[] args) {
        BigDecimal bigDecimal;
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int seatGiven = 0;
        Boolean[] seatAssigned = new Boolean[10];
            System.out.println("Enter your preferred option: ");
            int seatChoice = input.nextInt();
            if (seatChoice == 1) {
                seatGiven = 1 + random.nextInt(5);
            } else if (seatChoice == 2) {
                seatGiven = 6 + random.nextInt(5);
            }
            if (seatGiven >= 1 && seatGiven <= 5) {
                System.out.println("Seat assigned is " + seatGiven);
                System.out.println("First-Class");
                for (int i = 0; i < seatAssigned.length; i++) {
                    seatAssigned[seatGiven - 1] = true;
                }

            } else {
                System.out.println("Seat assigned is " + seatGiven);
                System.out.println("Economy section");
                for (int i = 0; i < seatAssigned.length; i++) {
                    seatAssigned[seatGiven - 1] = true;
                }
            }


        System.out.println(Arrays.toString(seatAssigned));



    }

}
