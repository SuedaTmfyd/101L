package lab;

import java.util.Scanner;

public class Lab02 {
	public static void main(String[] args) {
		//lab02
		//071022 programminglab lesson
		
		Scanner input = new Scanner(System.in);
		
	System.out.println("Enter a number: ");
		double number = input.nextDouble();
	
		if (number > 0)
			System.out.println("Number is positive");
		else if (0 > number)
			System.out.println("Number is negativer");
		else if (number ==  0)
			System.out.println("Number is zero");
		
		
		
		//
		System.out.println("a: b: c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double r1, r2;
			r1 = (-b + Math.pow(b*b - 4*a*c , 0.5)) / -2*a;
			
			r2 = (-b - Math.pow(b*b - 4*a*c , 0.5)) / -2*a;
			
		if (b*b - 4*a*c > 0)
			System.out.println(r1 + r2);
		else if (0 > b*b - 4*a*c)
			System.out.println("There is no real roots");
		else if (b*b - 4*a*c == 0)
			System.out.println(r1);

		
		//
		System.out.println("Enter age: ");
		double age = input.nextDouble();
		
		if(10>age){
			System.out.println("Enter Height: ");
			double Height = input.nextDouble();
			if(Height >= 120) {
				System.out.println("Child can ride bike!");
			}
			else {
				System.out.println("Child is not allowed to ride.");
			}
		}		
		else {
			System.out.println("Child can ride bike!");
		}
				
		
		//
		int pcsnumber = 1 + (int)(Math.random() * ((3 - 1) + 1));
		
		
		System.out.println("Please enter 1,2 or 3.");
		int usersnumber = input.nextInt();
			if(usersnumber >= 4 || 0 >= usersnumber) {
				System.out.println("Please enter 1,2 or 3!!!!");
			}
			else if(usersnumber>0 && 4>usersnumber) {
		if(pcsnumber == 1 && usersnumber == 1)
			System.out.println("Play again!");
		if(pcsnumber == 1 && usersnumber == 2)
			System.out.println("Winner is User!");
		if(pcsnumber == 1 && usersnumber == 3)
			System.out.println("Winner is PC!");
		if(pcsnumber == 2 && usersnumber == 2)
			System.out.println("Play again!");
		if(pcsnumber == 2 && usersnumber == 3)
			System.out.println("Winner is User!");
		if(pcsnumber == 3 && usersnumber == 3)
			System.out.println("Play again!");
			}
			
		
		//
			System.out.println("Enter Final: Midterm: FirstQuiz: SecondQuiz:");
			double Final = input.nextDouble();
			double midterm = input.nextDouble();
			double quiz1 = input.nextDouble();
			double quiz2 = input.nextDouble();
			
			if(Final>90) {
				System.out.println("Final's grade is A");
			}
			else if(Final>80) {
				System.out.println("Final's grade is B");
			}
			else if(Final>70 ) {
				System.out.println("Final's grade is C");
			}
			else if(Final>60 ) {
				System.out.println("Final's grade is D");
			}
			else if(Final>50){
				System.out.println("Final's grade is E");
			}
			
			
			
			
			if(midterm>90) {
				System.out.println("Midterm's grade is A");
			}
			else if(midterm>80) {
				System.out.println("Midterm's grade is B");
			}
			else if(midterm>70 ) {
				System.out.println("Midterm's grade is C");
			}
			else if(midterm>60 ) {
				System.out.println("Midterm's grade is D");
			}
			else if(midterm>50){
				System.out.println("Midterm's grade is E");
			}
			
			
			
			if(quiz1>90) {
				System.out.println("First Quiz's grade is A");
			}
			else if(quiz1>80) {
				System.out.println("First Quiz's grade is B");
			}
			else if(quiz1>70 ) {
				System.out.println("First Quiz's grade is C");
			}
			else if(quiz1>60 ) {
				System.out.println("First Quiz's grade is D");
			}
			else if(quiz1>50){
				System.out.println("First Quiz's grade is E");
			}
			
			
			
			if(quiz2>90) {
				System.out.println("Second Quiz's grade is A");
			}
			else if(quiz2>80) {
				System.out.println("Second Quiz's grade is B");
			}
			else if(quiz2>70 ) {
				System.out.println("Second Quiz's grade is C");
			}
			else if(quiz2>60 ) {
				System.out.println("Second Quiz's grade is D");
			}
			else if(quiz2>50){
				System.out.println("Second Quiz's grade is E");
			}

		
		
		input.close();
		
		
		
		
		
	}
}
