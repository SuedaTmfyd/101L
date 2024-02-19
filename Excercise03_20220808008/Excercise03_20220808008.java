package Excercise03_20220808008;
import java.util.Arrays;

public class Excercise03_20220808008 {
	public static void main (String args[]) {
	}
	
	//question1
	public static int getMax(int[] array) {	
		int best = Arrays.stream(array).max().getAsInt();
		System.out.println("Best score is: " + best);
		return best;
	}
	public static char[] grade(int[] students) {
		char[] grades = new char[students.length];
		int best = getMax(students);
		
		for(int j = 0; j < students.length; j++) {
			if(students[j] >= best - 10)
				grades[j] = 'A';
			else if(students[j] >= best - 20)
				grades[j] = 'B';
			else if(students[j] >= best - 30)
				grades[j] = 'C';
			else if(students[j] >= best - 40)
				grades[j] = 'D';
			else
				grades[j] = 'F';	
		}
		System.out.println("Grades of students are:");
        display(grades);
		return grades;
	}
	
	//question2
	public static int average(int[] array) {
		int sum = 0;
		int average = 0;
		for(int i = 0; i < array.length; i++)
			sum += array[i];
		average = (int)(sum / array.length);
		System.out.println("Average of numbers is: " + average);
		return average;
	}
	public static double average(double[] array) {
		int sum = 0;
		double average = 0;
		for(int i = 0; i < array.length; i++)
			sum += array[i];
		average = (double)(sum / array.length);
		System.out.println("Average of numbers is: " + average);
		return average;
	}
	
	//question3
	public static int random(int start, int end, int... exclude) {
		int n = randomInt(start, end);
			for(int j = 0; j < exclude.length; j++) {
				if(n == exclude[j]) {
					n = randomInt(start, end);
					j = -1;
				}	
			}
		System.out.println(n);
		return n;	
	}
	
	//question4
	public static int[] eliminateDuplicates(int[] array) {
		System.out.println("Generated numbers with duplicate values are: ");
        display(array);
        int count = 0;
        
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(j != i)
					if(array[j] == array[i])
						array[j] = -1;
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < 0)
				count++;	
		}
		
		int[] nonDuplicateNumbers = new int[array.length - count];
		int a = 0;
		for(int j = 0; j < array.length; j++) {
			if(array[j] > 0) {
				nonDuplicateNumbers[a] = array[j];
				a++;
			}
		}
		
		System.out.println("Non duplicate numbers");
        display(nonDuplicateNumbers);
		return nonDuplicateNumbers;
	}
	
	//question5
	public static void shuffle(int[] array) {
		 for(int i = 0;i < array.length; i++) {
			int j = (int)(Math.random() * array.length);
			swap(array, i, j);
		 }
	}
	public static boolean isSorted(int[] array) {
		shuffle(array);
		for(int i = 0;i < array.length - 1; i++) {
			if(array[i] < array[i+1])
				continue;
			else {
				System.out.println("Array is not sorted: ");
				display(array);
				return false;
			}
		}
		System.out.println("Array is sorted: ");
		display(array);
		return true;	
	}
	
	
	//question6
	 public static int[] lockers(boolean[] locker) {
		int lockerAmount = 0;
		int n = 100;
	    boolean[] lockers = new boolean[n+1];
	    int[] openLockers = new int[n+1];
	    
	    for(int i = 1; i <= n; i++) { //student
	    	for(int j = 1; j <= n; j++) //locker's number
	    		if(j % i == 0)
	    			openLockers[j] += 1;
	    }
	    for(int k = 1; k <= n; k++) {
		    if(openLockers[k] % 2 == 0)
		    	lockers[k] = false;
		    else
		    	lockers[k] = true;
	    }
	    
	    System.out.println("Open lockers are:");
	    
	    for(int s = 1; s <= n; s++)
	    	if(lockers[s]) {
	    		System.out.println(s);
	    		lockerAmount += 1;
	    	}
	    
	    System.out.println("for n == 100, open locker amount should be 10, open locker amount: " + lockerAmount);
	
	    
	    n = 1000;
	    lockerAmount = 0;
	    lockers = new boolean[n+1];
	    openLockers = new int[n+1];
	    
	    for(int i = 1; i <= n; i++) { //student
	    	for(int j = 1; j <= n; j++) //locker's number
	    		if(j % i == 0)
	    			openLockers[j] += 1;
	    } 
	    for(int k = 1; k <= n; k++) {
		    if(openLockers[k] % 2 == 0)
		    	lockers[k] = false;
		    else
		    	lockers[k] = true;
	    }
	    for(int s = 1; s <= n; s++)
	    	if(lockers[s])
	    		lockerAmount += 1;
	
	    System.out.println("for n == 1000, open locker amount should be 31, open locker amount: " + lockerAmount);
		
	    return openLockers;
	 }
	

	public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void display(double[] array) {
        for (double i : array) {
    System.out.printf("%.1f\t", i);
	}
	System.out.println();
	}
	
	public static void display(int[] array) {
	for (int i : array) {
	    System.out.printf("%d\t", i);
	}
	System.out.println();
	}
	
	public static void display(char[] array) {
	for (int i : array) {
	    System.out.printf("%c\t", i);
	}
	System.out.println();
	}
	
	public static int randomInt(int start, int end) {
	return start + (int) (Math.random() * (end - start + 1));
	}
	
	public static double randomDouble(double start, double end) {
	return start + Math.random() * (end - start + 1);
	}
	
	public static double round(double value, int places) {
	double scale = Math.pow(10, places);
	return Math.round(value * scale) / scale;
	}
}
