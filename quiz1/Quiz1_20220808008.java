package quiz1;

import java.util.Scanner;

public class Quiz1_20220808008 {

	
	public static void main(String[] args) {
		
		
			//question4
		double Width = 4.5;
		double Height = 7.9;
		double hipotenius = (Width * Width + Height * Height);
			System.out.println("Area of the triangle is " + ((Width * Height) / 2));
			System.out.println("Perimeter of the triangle is " + (Width + Height + Math.sqrt(hipotenius)));
			
			
			//question5
		System.out.println("Enter side lenght: ");
			Scanner input = new Scanner(System.in);
			
		double side = input.nextDouble();
			System.out.println("Area of the hexagon is " + ((3* Math.sqrt(3)) / 2 ) * side * side);
			
			
			//question6
		System.out.println("Enter Drive Distance:  , Miles Per Galon:  , Price Per Galon:  ");
		
		double DriveDistance = input.nextDouble();
		double MilesPerGallon = input.nextDouble();
		double PricePerGallon = input.nextDouble();
		
		double cost = (DriveDistance / MilesPerGallon) * PricePerGallon;
		
		System.out.println("The cost of the trip is " + cost);
		
		int CostInLiras = (int)(cost * 18.59);
		
		System.out.println("Cost in Liras is " + CostInLiras);
		
		
			//question7
		int Jake = (int)(1 + (Math.random()) * 6);
		int Mike = (int)(1 + (Math.random()) * 6);
		
		if (Jake == Mike) {
			System.out.println("Their numbers are equal.");
		}
		else {System.out.println("Their numbers are not equal.");
		}
		
		
			//question8
		System.out.println("Enter a number between (-5,5).");
		double number = input.nextDouble();
		
		if (number>5 || -5>number) {
			System.out.println("Not in range.");
		}
		
		if (number%2==1 || 0>number) {
			System.out.println(number * number);
		}
		else System.out.println(Math.sqrt(number));
		
		
		
		
			//question9
		System.out.println("Enter a number.");
			double Positives = 0;
			double Negatives = 0;
			
			
		
		
			
		
			//question10
		System.out.println("Enter a number 4 to 9");
			String question = input.nextLine();
		
		
		
		
		input.close();
	}
}
