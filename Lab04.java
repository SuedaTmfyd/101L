package lab;

import java.util.Scanner;

public class Lab04 {
	public static void main (String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		System.out.println(getPentagonalNumber(n));
		
		int i = inp.nextInt();
		System.out.println(sumDigits(i));
		
		
		
		
		
	}
	
		//quation1
		public static int getPentagonalNumber(int n) {
			return n * (3 * n -1) / 2;
		}
		
		//question2
		public static int sumDigits(long n) {
			int sum = 0;
			while(n != 0) {
				sum += n % 10;
				n /= 10;
			}
				return sum;
		}
		
		//question3
		public static int reverse(int number) {
			int reversed = 0;
			while (number!= 0) {
				reversed *= 10;
				reversed += number % 10;
				number /= 10;	
			}
			return reversed;
		}
		
		public static boolean isPalindrome(int number) {
			return number == reverse(number);
		}
		
		
		//question4
		public static void displaySortedNumbers(double num1, double num2, double num3) {
//			double num0 = 0;
//			if(num1<num2 && num1<num3) {
//				if(num2<num3)
//					sorted = num1 + "<" + num2 + "<" + num3;
//				else
//					sorted = num1 + "<" + num3 + "<" + num2;
//			}
//			else if(num2<num1 && num2<num3) {
//				if(num1<num3)
//					sorted = num2 + "<" + num1 + "<" + num3;
//				else
//					sorted = num2 + "<" + num3 + "<" + num1;
//			}
//			else {
//				if(num1<num2)
//					sorted = num1 + "<" + num1 + "<" + num2;
//				else
//					sorted = num1 + "<" + num2 + "<" + num1;
//			}
//			return sorted;
//		}
			
			double max = Math.max(Math.max(num3, num2), Math.max(num3, num1));
			double min = Math.min(Math.min(num3, num2), Math.min(num3, num1));
			double middle = num1 + num2 + num3 - (max + min);
			System.out.printf("%f < %f < %f", min, middle, max );
		}
		
		
		//question5
		public static void Fibonacci(int n) {
			int num1 = 0, num2 = 0;
			System.out.println(num1 + num2);
			for(int i = 0; i<=n; i++) {
				int nextNum = num1 + num2;
				num1 = nextNum;
				System.out.println(nextNum);
			}
			
			
			//question6
			public static void Primes(int num) {
				for(int i =2; i<(num/2+1); i++) {
					if(num %i == 0) {
						return false;
					}
				}
				return true;
			}
			
			public static boolean isPrime
			
			
			
			
		inp.close();
		}	
}
