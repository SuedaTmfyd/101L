package lab;

import java.util.Scanner;

public class Lab03 {
	public static void main (String[] args) {
		//211022 programminglab lesson
			
		Scanner inp = new Scanner(System.in);
		
		//question1
		
	System.out.println("Enter Point 1 (latitude and longitude) in degrees: ");
		double x1 = Math.toRadians(inp.nextDouble());
		double y1 = Math.toRadians(inp.nextDouble());
	System.out.println("Enter Point 2 (latitude and longitude) in degrees: ");
		double x2 = Math.toRadians(inp.nextDouble());
		double y2 = Math.toRadians(inp.nextDouble());
	
		double radius = 6371.01; //km
		
		double distance = radius * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1 - y2));

		
		System.out.printf("The distance between two points is: %.2f", distance); //int=d float=f string=s %buraya demek(noktadan sonra 2 tane float
		
		
	
		//question2
	
		
		System.out.println("Enter A, B, C ,D or F");
		char grade = inp.next().charAt(0);
		
		if(!Character.isLetter(grade)) {
			System.out.println("Error");
		}
		else {
			if(Character.isLowerCase(grade)) {
				grade = Character.toUpperCase(grade);
			}
			if(grade == 'E' || grade > 'F') {
				System.out.println("Error");
			}
			else {
				int value = 'E' - grade;
				if (grade == 'F')
					value = 0;
				System.out.printf("Numeric value for grade %c is %d", grade, value); //c=character d=integer--- float ya da double için=f
			}
		}
		
		//quesiton3
		System.out.println("Enter major and status: ");
		char major = inp.next().charAt(0);
		char number = inp.next().charAt(1);
		
		
		if(!(major == 'M' || major == 'C' || major == 'I') || (number < '1' && number > '4')) {
			System.out.println("Invalidinput");
		}
		else {
			String output = ""; //" string demek
			if(major == 'M') {
				output = "Mathematics";
			}
			else if(major == 'C') {
				
			}
			else if(major == 'I') {
				
			}
			
			output +=" ";
			if (number == '1') {
				output += 
			}
			
			
		System.out.println("Student is " + output);
		}
		
		//question4
		System.out.println("Enter 2 names: ");
			String name1 = inp.next();
			String name2 = inp.next();
			
		if(name1.equals(name2)) { //stringler object olduğu için = kullanılır//stringlerin equals metodu compare metodu kullanır
			System.out.println("Names are same");
		}
		else {
			System.out.println("Names are different");
		}
		
		System.out.println(name1 + " has " + name1.length());
		System.out.println(name2 + " has " + name2.length());
		
		System.out.println(name1 + "  " + name1.length());
		
		
		//question5
		System.out.println("Enter string1: ");
		String string1 = inp.next();
		System.out.println("Enter string2: ");
		String string2 = inp.next();
		
		
			
		
		
			
		
		

		
		
		
		
		inp.close();
	}

}
