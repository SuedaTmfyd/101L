package quiz2;

public class Quiz2_20220808008 {
	public static void main(String[] args) {
	}
	
	public static int[] eliminateDuplicates(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[j] == array[i])
					array[j] = -1;
			}
		}
		int a = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < 0)
				a++;	
		}
		int n = 0;
		int[] nonDuplicate = new int[array.length-a];
		for(int k = 0; k < array.length; k++) {
			if(array[k] > 0) {
				nonDuplicate[n] = array[k];
				n++;
			}
		}
		return nonDuplicate;
	}
	
	
	public static int[] getClosestPoints(double[][] array, int index) {
		double[] distance = new double[array.length];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(i != index)
				distance[i] = Math.sqrt(Math.pow(array[i][j], 2)-Math.pow(array[index][j], 2));
			}
		}
		int count = 0;
		for(int i = 1; i < distance.length; i++) {
			if(distance[i-1] == distance[i])
				count++;
		}
		int[] minDistance = new int[array.length - count];
		double a = distance[0];
		int b = 0;
		for(int k = 1; k < distance.length; k++) {
			if(a > distance[k])
				a = distance[k];
			else if(a == distance[k]) {
					minDistance[b] = k;
					b++;
			}
		}
		return minDistance;
	}
	
	
	public static int[] employeeWorkingHours(int[][] array) {
		int[] totalHours = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				totalHours[i] += array[i][j];
			}
		}
		
		int temp = 0;
		for(int k = 1; k < totalHours.length; k++) {
			if(totalHours[k-1] < totalHours[k]) {
				temp = totalHours[k-1];
				totalHours[k-1] = totalHours[k];
				totalHours[k] = temp;
			}	
		}
		return totalHours;
	}
	
	public static int random(int min, int max, int[] exclude) {
		int num = 0;
		num = (int)(Math.random()*max);
		for(int k = 0; k < exclude.length; k++) {
			if(num == exclude[k]) {
				num = (int)(Math.random()*max);
				continue;
			}	
		}
		return num;
	}
}
