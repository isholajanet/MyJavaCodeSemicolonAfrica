package africa.semicolon.chapterFour;

import java.util.Scanner;

public class QuadraticEquation {
    private int quotientOfA;
    private int quotientOfB;
    private int quotientOfC;
    private double squareRoot;
    private double positiveEquation;
    private double negativeEquation;
    public QuadraticEquation(int quotientOfA, int quotientOfB, int quotientOfC){
        this.quotientOfA = quotientOfA;
        this.quotientOfB = quotientOfB;
        this.quotientOfC = quotientOfC;

    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter the value of a: ");
//        quotientOfA = input.nextInt();
//        System.out.println("Enter the value of b: ");
//        quotientOfB = input.nextInt();
//        System.out.println("Enter the value of c: ");
//        quotientOfC = input.nextInt();
        public double calculateQuadraticEquationFirstValue(int quotientOfA, int quotientOfB, int quotientOfC){

            int square = (quotientOfB * quotientOfB) - (4 * quotientOfA * quotientOfC);
         if (square >= 0) {
            squareRoot = Math.sqrt(square);

            positiveEquation = ((-quotientOfB + squareRoot) / (2 * quotientOfA));

         }
        return positiveEquation;

    }
    public double calculateQuadraticEquationSecondValue(int quotientOfA, int quotientOfB, int quotientOfC){
        int square = (quotientOfB * quotientOfB) - (4 * quotientOfA * quotientOfC);
        if (square >= 0) {
            squareRoot = Math.sqrt(square);

            negativeEquation = ((-quotientOfB - squareRoot) / (2 * quotientOfA));
        }

        return negativeEquation;
    }
}


