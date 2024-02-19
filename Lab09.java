package lab;

public class Lab09 {
	public static void main (String[] args) {
//		System.out.println(factorial(5));
//		System.out.println(recfibonacci(5));
//		System.out.println(recreverse("abcd"));
//		triangle(7);
	}
	
	//que1
	public static int factorial (int n) {
		if(n<=1)
			return 1;
//		else if(n==1)
//			return 1;
//		else
			return (n * factorial(n-1));
	}
	
	//que2
	public static int iterfibonacci (int n) {
		int a = 0;
		int b = 1;
		int temp = 0;
		for(int i = 0; i < n; i++) {
			temp = a+b;
			a = b;
			b = temp;
		}
		return a; 	
	}
	
	public static int recfibonacci (int n) {
		if (n<=1)
			return n;
		
		return recfibonacci(n-1) + recfibonacci(n-2);
	}
	
//	public static String palindrome(String word) {
//		if(!(word.charAt(0)  = word.charAt(word.length()-1)))
//			return "t";
//		
//		return 
//	}
//	
//	
//	public static int iterGCD(int a, int b) {
//		int x = 0;
//		if(a<b)
//			while( b% x != 0||)
//		else
//			
//	}
	
	public static String recreverse(String a) {
		if(a.length() == 1)
			return a;
		
		return recreverse(a.substring(1)) + a.charAt(0);	
	}
	
	public static int occurence(String a, char b) {
		if(a.length() == 0) {
			return 0;
		}
		int count = 0;
		if(a.charAt(0) == b) {
			a = a.substring(1, a.length());
			count++;
		}
		return count;
	}
	
	public static int generate(int max, int min, int... c) {
		int x = (int)(Math.random() * (max-min+1) + min);
		for(int i : c)
			if(i == x) {
				generate(max, min, c);
			}
		
		return x;
		
	}
	
	public static void triangle(int n) {
		if(n==0)
			return;
		for(int i = 1; i < n; i++)
			System.out.print("*");
		System.out.println();
		triangle(n-1);
		
	}
	
	
	
	
}
