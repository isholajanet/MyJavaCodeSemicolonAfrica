package africa.semicolon.chapterSix;

public class Hypotenuse {
    public static double calculateHypotenuse(double opposite, double adjacent) {
        double hypotenuse = 0;
        hypotenuse = Math.sqrt(Math.pow(opposite, 2) + Math.pow(adjacent, 2));

        return hypotenuse;
    }
}
