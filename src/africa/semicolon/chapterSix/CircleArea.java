package africa.semicolon.chapterSix;

public class CircleArea {
    public static double calculateAreaOf(double radius) {
        double area;

        area = Math.PI * (Math.pow(radius,2));

        return Math.floor(area + 0.5);
    }
}
