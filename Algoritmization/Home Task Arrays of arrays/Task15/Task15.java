import java.lang.Math;

public class Task15 {
     public static void main(String[] args) {
		int m = 10;
		int n = 6;
		int[][] arr = new int[m][n];
		for(int c = 0; c<arr.length; c++){
			for(int s = 0; s<arr[c].length; s++){
				arr[c][s] = (int)(Math.random()*35);
			}
		}
			printMatrice(arr); // Print our matrice
			transformMatrice(arr);
			printMatrice(arr);

		
    }
	public static void printMatrice(int[][] a){
		for(int i = 0; i < a.length; i++ ){
			for(int e: a[i]){
				if(e<10) System.out.print("  "+e+" ");
				else System.out.print(e+" ");
			}
			System.out.println(" ");
		}
		System.out.println("-------------------------------------");
	}
	public static void transformMatrice(int[][] arr){
		int max = findMaximum(arr);
		for(int i = 0; i < arr.length; i++){
			for(int b = 0; b < arr[i].length; b++){
				if(arr[i][b] % 2 != 0) arr[i][b] = max;
			}
		}
	}
	public static int findMaximum(int[][] arr){
		int max=arr[0][0];
		for(int i = 0; i < arr.length; i++){
			for(int b = 0; b < arr[i].length; b++){
				if(arr[i][b] > max) max = arr[i][b];
			}
		}
		return max;
	}


	
	
}