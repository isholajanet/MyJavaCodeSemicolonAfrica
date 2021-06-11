package africa.semicolon.chapterFour.deitelExercises;

import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double currentWorldPopulation;
        double growthRate = 0.011;
        double worldPopulation;
        System.out.println("Enter the current world population: ");
        currentWorldPopulation = input.nextDouble();
        for(int count = 1; count <= 5; count++){
            worldPopulation = currentWorldPopulation * growthRate;
            currentWorldPopulation = currentWorldPopulation + worldPopulation;

            System.out.printf("The world population of the %d year is %d" , count, currentWorldPopulation);
        }


    }
}
