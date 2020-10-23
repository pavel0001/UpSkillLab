public class Task3 {
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
	  printColumn(3,arr);
	  printLine(2,arr);
	  
    }
	public static void printMatrice(int[][] a){
		for(int i = 0; i < a.length; i++ ){
			for(int e: a[i])
				System.out.print(e+" ");
			System.out.println(" ");
		}
		System.out.println("-------------------------------------");
	}
	public static void printColumn(int column, int[][] matrix){
		System.out.println("Printing column "+column+" ...");
		for(int c = 0; c < matrix.length; c++){
			if(matrix[c].length > column){
			System.out.println(matrix[c][column]);
			}
		}
		System.out.println("Column number "+column+" printed");
	}
	
	public static void printLine(int line, int[][] matrix){
		System.out.println("Printing line "+line+" ...");
		for(int l = 0; l < matrix.length; l++){
			System.out.print(matrix[line][l]+" ");
		}
		System.out.println("\nLine number "+line+" printed");
	}
	
}