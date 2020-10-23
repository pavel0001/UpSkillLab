import java.lang.Math;

public class Task11 {
     public static void main(String[] args) {
		int[][] arr = new int[10][20];
		for(int c = 0; c<arr.length; c++){
			for(int s = 0; s<arr[c].length; s++){
				arr[c][s] = (int)(Math.random()*15);
			}
		}
			//printMatrice(arr); // Print our matrice
printMatriceIf(arr);
		
    }
	public static void printMatrice(int[][] a){
		for(int i = 0; i < a.length; i++ ){
			for(int e: a[i])
				System.out.print(e+" ");
			System.out.println(" ");
		}
		System.out.println("-------------------------------------");
	}
	public static void printMatriceIf(int[][] a){
		for(int i = 0; i < a.length; i++ ){
			int counter=0;
			for(int e: a[i]){
				System.out.print(e+" ");
				if(e==5) counter++;
			}
			if(counter >= 3) System.out.print(" number 5 has in cell number "+i+" -> "+counter+" times");
			System.out.println(" ");
		}
		System.out.println("-------------------------------------");
	}

	
	
}