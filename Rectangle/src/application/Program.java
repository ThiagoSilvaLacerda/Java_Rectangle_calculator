package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
	
	public static void main (String args[]) {
	
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner (System.in);
		
		Rectangle x = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		x.Width = input.nextDouble();
		x.Height = input.nextDouble();
		
		System.out.printf("AREA= %.2f%n", x.Area());
		System.out.printf("PERIMETER= %.2f%n", x.Perimeter());
		System.out.printf("DIAGONAL= %.2f%n", x.Diagonal());
		
		input.close();
	
	}

}
