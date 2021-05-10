package chapterTwo;

import java.util.Scanner;
public class Cylinder{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double radius;
		double length;
		double area;
		double volume;
		System.out.print("Enter the radius and length of a cylinder: ");
		radius = input.nextDouble();
		length = input.nextDouble();
		area = radius * radius * 3.142;
		volume = area * length;
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	

	}
}