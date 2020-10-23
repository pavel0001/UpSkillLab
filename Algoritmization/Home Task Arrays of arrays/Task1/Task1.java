public class Task1 {
    public static void main(String args[]) {
      int[][] arr = {
			{1,5,7,3,10,7,9,3,2,2},
			{8,3,2,7,8,2,7,4,2,8},
			{1,5,8,3,2,8,0,5,2,1},
			{7,3,5,7,9,3,6,2,3,2},
	  };
	  printMatrice(arr);
	  for(int c = 0; c<arr[0].length; c++){
		  
			  if(c!=0 && c%2 == 0){
				  if(arr[0][c] > arr[arr.length-1][c]){
				  for(int i = 0; i<arr.length; i++){
					  System.out.print(arr[i][c]+" ");
					}
					System.out.println("");
				  }
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