import java.lang.Math;

public class Task14 {
     public static void main(String[] args) {
		 int m = 10;
		 int n = 10;
		int[][] arr = initMatrice(m,n);
		
			printMatrice(arr); // Print our matrice

		
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
	public static int[][] initMatrice(int m, int n){
			int[][] arr = new int[m][n];
			int count=0;
			for(int i = 0; i < arr[0].length; i++){
				
				while(true){
					count++;
					int counter=0;
					for(int a = 0; a < arr.length; a++){
						if(counter < i){
							arr[a][i] = (int)(Math.random()*2);
							if(arr[a][i] == 1) counter++;
						}
						else {
							arr[a][i] = 0;
						}
					}
					if(counter == i) {
						break;
					}
				}
			}
			System.out.print("Cicles will run "+count+" times \n");
			
			return arr;
	}

	
	
}