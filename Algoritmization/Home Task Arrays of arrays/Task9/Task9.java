import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {
     public static void main(String[] args) throws IOException {
		int n = 10;
		
		
		int[][] arr = new int[n][n];
		int[] sum_col = new int[n];

		  for(int c = 0; c < arr.length; c++){
			  for(int l = 0; l < arr[c].length; l++){
				  arr[c][l] = c*l;
				  sum_col[c] += arr[c][l];
			  }
		  }
		
		printMatrice(arr); // Print our matrice
		int max=sum_col[0];
		int index =0;
		for(int i =0; i<sum_col.length; i++){
			System.out.print(sum_col[i]+" ");
			if(sum_col[i]>max) {
				max = sum_col[i];
				index = i;
			}
			
		}
		System.out.print("<--- Sum for each columns. Max from this --> "+max+" in column number -> "+index);
		
		
		

		
    }
	public static void printMatrice(int[][] a){
		for(int i = 0; i < a.length; i++ ){
			for(int e: a[i])
				System.out.print(e+" ");
			System.out.println(" ");
		}
		System.out.println("-------------------------------------");
	}

	
	
}