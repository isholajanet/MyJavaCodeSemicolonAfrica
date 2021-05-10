package chapterTwo;

import java.util.Scanner;
public class Conversion{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double celsius;
		double fahrenheit;
		System.out.print("Enter a degree in Celsius: ");
		celsius = input.nextDouble();
		fahrenheit = (9.0 / 5) * celsius + 32;
		System.out.println(celsius+ " celsius is " +fahrenheit+  " fahrenheit");

	}
}