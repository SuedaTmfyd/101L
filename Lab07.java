package lab;

public class Lab07 {
	public static void main(String[] args) {
		String[] array = {"aa", "mn", "kl"};
		display(array);
		
		String[][] array2 = {
				{"aa", "bb"}, 
				{"cc"}
				};
		display2d(array2);
		
		
		//random(A, E);
		int[] array5 = {1, 2, 3, 4, 5, 6};
		swap(array5, 2, 5);	
		
	}
	
	//que0.a
	public static void display(String[] array) {
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + "     ");
	}
	
	//que0.b
	public static void display2d(String[][] array2) {
		for(int i = 0; i < array2.length; i++) {
			System.out.println();
			for(int j = 0; j < array2[i].length; j++)
				System.out.print(array2[i][j] + "     ");
		}
	}
	
	//que1
	public static int sum(int[][] array3) {
		int sum = 0;
		for(int i = 0; i < array3.length; i++) {
			for(int j = 0; j < array3[i].length; j++)
				sum += j;
		}
		return sum;	
	}
	
	//que2
	//public static char random(char start, char end) {
		
	//}
	
	public static void check(char[] array) {
		
	}
	
	
	//que3
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		System.out.println(array);
	}
	
	//que4
	public static int[][] generateMatrix(int m, int n){
		for(int i = 0; i < m; i++)
			for(int j = 0; j < n; j++)
				
	}
	
	
	
	
}
