package lab;
import java.util.Scanner;
public class Lab06 {
	public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	
	//que1
	public static void displayer(int[] array) {
		for (int i : array)
			System.out.println(i+ " ");
	}
	
	//que2
	public static int generateNum(int n, int min, int max) {
		int max;
		int min;
		int[] num = new int[n];
		for (int i = 0; i < array.length; i++)
			array[i] = min + (int)Math.random() * (max - min);
	}
	
	//que3
	public static void searcher(int[] array, int n) {
		for( int i = 0; i < array.length; i++)
			if (n == array[i])
				return i+1;
		
		return -1;
	}
	
	//que4
	public static void findValue(int[] array) {
		
		int[] counterArray = new int [];
		for (int i = 0; i < array.length; i++)
			counterArray[array[i]]++;
		
	}
	
	public static void max(int[] array) {
		int max = Integer.MAX_VALUE;
		for(int i : array) {
			if(i > max)
		}
	}
	
	//que5
	public static void reverseArray(int[] array) {
		int[] reverse = new int[];
		for(int i = array.length - 1; i = 0; i--) {
			for(int j = 0; i < array.length; j++) {
				reverse[j] = array[i];
			}
		}
	}
	
	//que6
	
	
	}
}
