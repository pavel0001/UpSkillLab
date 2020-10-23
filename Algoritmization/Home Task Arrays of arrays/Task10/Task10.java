import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
     public static void main(String[] args) throws IOException {
		int[][] arr = {
			{1, 2,3, 4, 5, 6},
			{1,-4,3, 4, 5, 6},
			{1, 2,8, 4, 5, 6},
			{1, 2,3,-6, 5, 6},
			{1, 2,3, 4,-12,6},
			{1, 2,3, 4, 5, 6}
		};
		
			printMatrice(arr); // Print our matrice
			System.out.println("Elements >0 in main diagonal: ");
		  for(int c = 0; c < arr.length; c++){ 
				  int elem = arr[c][c];
				  if(elem>0){
					  System.out.print("elem["+c+"]["+c+"] = "+ elem+"; ");
				  }
		  }
		
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