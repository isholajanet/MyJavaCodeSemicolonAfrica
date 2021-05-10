package chapterTwo;

import java.util.Scanner;
	public class SeventhQuestion{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			int a;
			int b;
			int c;
			int d;
			int e;
			System.out.print("Enter the value of a ");
			a = input.nextInt();
			System.out.print("Enter the value of b ");
			b = input.nextInt();
			System.out.print("Enter the value of c ");
			c = input.nextInt();
			System.out.print("Enter the value of d ");
			d = input.nextInt();
			System.out.print("Enter the value of e ");
			e = input.nextInt();
			if ((a>b) && (a>c) && (a>d) && (a>e)){
				System.out.println("a is the largest integer in the group");
			}
			if ((a<b) && (a<c) && (a<d) && (a<e)){
				System.out.println("a is the smallest integer in the group");
			}
			if ((b>a) && (b>c) && (b>d) && (b>e)){
				System.out.println("b is the largest integer in the group");
			}
			if ((b<a) && (b<c) && (b<d) && (b<e)){
				System.out.println("b is the smallest integer in the group");
			}
			if ((c>a) && (c>b) && (c>d) && (c>e)){
				System.out.println("c is the largest integer in the group");
			}
			if ((c<a) && (c<b) && (c<d) && (c<e)){
				System.out.println("c is the smallest integer in the group");
			}
			if ((d>a) && (d>b) && (d>c) && (d>e)){
				System.out.println("d is the largest integer in the group");
			}
			if ((d<a) && (d<b) && (d<c) && (d<e)){
				System.out.println("d is the smallest integer in the group");
			}
			if ((e>a) && (e>b) && (e>c) && (e>d)){
				System.out.println("e is the largest integer in the group");		
			}
			if ((e<a) && (e<b) && (e<c) && (e<d)){
				System.out.println("e is the lowest integer in the group");
			}
			
		}
	}