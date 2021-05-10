package chapterTwo;

import java.util.Scanner;
import java.lang.Math.*;
	public class QuestionEleven{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int radius;
			double diameter;
			double circumference;
			double area;
			System.out.print("Enter the radius of the circle ");
			radius = input.nextInt();
			diameter = 2 * radius;
			circumference = 2 * Math.PI * radius;
			area = Math.PI * radius * radius;
			System.out.printf("Diameter is %f%n", diameter);
			System.out.printf("Circumference is %f%n", circumference);
			System.out.printf("Area is %f%n", area);
			
		}
	}