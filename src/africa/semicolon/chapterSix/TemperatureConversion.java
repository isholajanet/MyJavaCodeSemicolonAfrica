package africa.semicolon.chapterSix;

public class TemperatureConversion {
    public static double calculateCelsius(double fahrenheit) {
        double celsius;
        celsius = 5.0 / (9.0 * (fahrenheit - 32));

        return celsius;
    }

    public static double calculateFahrenheit(int celsius) {
        double fahrenheit;

        fahrenheit = 9.0 / (5.0 * (celsius + 32));
        return fahrenheit;
    }
}
