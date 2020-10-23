import java.lang.Math;

public class Task13 {
     public static void main(String[] args) {
		int[][] arr = new int[10][20];
		for(int c = 0; c<arr.length; c++){
			for(int s = 0; s<arr[c].length; s++){
				arr[c][s] = (int)(Math.random()*15);
			}
		}
			printMatrice(arr); // Print our matrice
			sortMatriceWithParam(arr, 0); // 1 po vozrastaniyu 0 po ubivaniyu
			printMatrice(arr);
		
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
	public static void sortMatriceWithParam(int[][] arr, int param){ // param 0 or 1 
			for(int i = 0; i < arr[0].length; i++){
				for( int a = 0; a < arr.length; a++){
					for(int b = 0; b < arr.length-1; b++){
						if(param == 1){
							if(arr[b][i] > arr[b+1][i]){
								int tmp = arr[b][i];
								arr[b][i] = arr[b+1][i];
								arr[b+1][i] = tmp;
							}
						}
						else {
							if(arr[b][i] < arr[b+1][i]){
								int tmp = arr[b][i];
								arr[b][i] = arr[b+1][i];
								arr[b+1][i] = tmp;
							}
						}
					}
				}
			}
	}

	
	
}