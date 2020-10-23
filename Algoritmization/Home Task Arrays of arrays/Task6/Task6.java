import  java.lang.Math;
public class Task6 {
    public static void main(String args[]) {
		int n = 38;
      int[][] arr = new int[n][n];
	  
	  for(int c = 0; c < arr.length; c++){
		  for(int l = 0; l < arr[c].length; l++){
			  int tmp = 0;
			  if(c+1 <= n/2){
				//int tmp_square = (int) Math.sqrt(Math.pow((c-n/2),2));
				if(l >= c && l <= (n-1) - c){
				tmp = 1;	
				}
			  }
			  else if(c+1 > n/2) {
				if(l+1 >= (n-c) && l <= c){
				tmp = 1;	
				}
			  }
			  arr[c][l] = tmp;
		  }
	  }
	  printMatrice(arr); // Print our matrice
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