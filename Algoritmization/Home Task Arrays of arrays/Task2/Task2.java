public class Task2 {
    public static void main(String args[]) {
      int[][] arr = {
			{1,5,7,3,9,7},
			{8,3,2,7,8,2},
			{1,5,8,3,2,8},
			{7,3,5,7,9,3},
			{7,3,5,7,9,3},
			{7,3,5,7,9,3}
	  };
	  printMatrice(arr);
	  System.out.print("Diagonal numbers - ");
	  for(int i = 0, k = 0; i < arr.length; i++){
		  System.out.print(arr[i][k++]+" ");
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