import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
     public static void main(String[] args) throws IOException {
		int n = 10;
		
		int a;//to
		int b;// from
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[n][n];

		  for(int c = 0; c < arr.length; c++){
			  for(int l = 0; l < arr[c].length; l++){
				  arr[c][l] = l;
			  }
		  }
		boolean flag = true;
		printMatrice(arr); // Print our matrice
		do{
			System.out.print("Enter a: ");
			a = Integer.parseInt(reader.readLine());
			System.out.print("Enter b: ");
			b = Integer.parseInt(reader.readLine());
			if(a >= 0 && b >= 0 && a != b && a < n && b < n ){
				flag = false;
			}
		}
		while(flag);
	
      
	  
		changeColumn(arr,a,b);
		printMatrice(arr);
		
    }
	public static void printMatrice(int[][] a){
		for(int i = 0; i < a.length; i++ ){
			for(int e: a[i])
				System.out.print(e+" ");
			System.out.println(" ");
		}
		System.out.println("-------------------------------------");
	}
	public static void changeColumn(int[][] arr, int a, int b){
		for(int c = 0; c < arr.length; c++){
			int tmp = arr[c][a];
			arr[c][a] = arr[c][b];
			arr[c][b] = tmp;
	  }
	}
	
	
}