public class Task4 {
    public static void main(String args[]) {
		int n = 14;
      int[][] arr = new int[n][n];
	  
	  for(int c = 0; c < arr.length; c++){
		  for(int l = 0; l < arr[c].length; l++){
			  int tmp;
			  if((c+1)%2 != 0){
				  tmp = l+1;
			  }
			  else{
				  tmp = n-l;
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