package chapterTwo;

import java.util.Scanner;
public class FlipNumber2{
	public static void main(String[] args){
		int attempt;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number ");
	attempt = input.nextInt();
	if(attempt == 0){
		System.out.print(1);
	}
	if(attempt == 1){
		System.out.print(0);
	}
		 
	} 

}