package africa.semicolon.chapterFour.deitelExercises;

import java.util.Scanner;

public class GasMileage {
    private static int UserInput;
    private static int milesDriven;
        private static int gallons;
        private static double totalMilesDriven;

    public GasMileage(int milesDriven, int gallons) {
        this.milesDriven = milesDriven;
        this.gallons = gallons;
    }

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public void setGallons(int gallons) {
        this.gallons = gallons;
    }

    public int getGallons() {
        return gallons;
    }

    public double milesPerGallon() {
        double milesPerGallon = milesDriven / (gallons * 1.0);
        return  milesPerGallon;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = 1;
        System.out.println("Enter 1 to signify that tank is full and -1 to stop");
        UserInput = input.nextInt();
        System.out.print("Enter the miles driven: ");
        milesDriven = input.nextInt();
        System.out.print("Enter gallons used for the trip: ");
        gallons = input.nextInt();
        while(UserInput != -1){
            milesDriven += milesDriven;
            gallons += gallons;
//            System.out.println("Is there gas in the car? ");
//            UserInput = input.nextInt();
            System.out.print("Enter the miles driven: ");
            milesDriven = input.nextInt();
            System.out.print("Enter gallons used for the trip: ");
            gallons = input.nextInt();
            System.out.println("Is there gas in the car? ");
            UserInput = input.nextInt();
        }
        totalMilesDriven = milesDriven / gallons;
        System.out.println("The total miles driven per gallon for each tankful is " + totalMilesDriven);
    }
}
