package africa.semicolon.chapterSix;

public class PerfectNumbers {
    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) {


        }
    }

    public static String getFactor(int number) {
        int factor = 1;
        String factors = "";
        while (factor < number) {
            if (number % factor == 0) {
                factors = factors + factor + " ";

            }
            factor++;
        }
        return factors;
    }

    public static int sumOfFactors(int number) {
        int factor = 1;
        int totalFactor = 0;
        while (factor < number) {
            if (number % factor == 0) {
                totalFactor = factor + totalFactor;
            }
            factor++;
        }
        return totalFactor;
    }

    public static boolean isPerfect(int number) {
        return number == sumOfFactors(number);
    }
}
