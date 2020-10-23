import java.lang.Math;

public class Task16 {
     public static void main(String[] args) {
		 int n = 21;
		int[][] arr = initMatriceRandom(n);// it's work if(n %3 == 0)
		
			printMatrice(arr); // Print our matrice
			System.out.println(isItMagic(arr));

		
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
	public static int[][] initMatriceFormula(int n){
		int[][] arr = new int[n][n];
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = 1+((i+j-1+((n-1)/2))*n)*n+((i+2*j+2)*n);
			}
		}
		return arr;
	}
	public static int[][] initMatriceRandom(int n){
			int[][] arr = new int[3][3];
			int[][] tmp_arr = new int[n][n];
			int counter=0;
			while(true){
				counter++;
			for(int i = 0; i < arr[0].length; i++){
					for(int a = 0; a < arr.length; a++){
						arr[i][a] = (int)(Math.random()*(9));
					}
				}
				if(isItMagic(arr)){
					break;
				}
			}
			if(n%3 == 0){
				for(int i = 0; i < tmp_arr.length; i++){
					for(int a = 0; a < tmp_arr[i].length; a++){
						tmp_arr[i][a] = arr[i%3][a%3];
					}
				}
			}
			System.out.println("Magic matrice complited. Make iteration - "+counter);
			return tmp_arr;
	}
	public static boolean	isItMagic(int[][] arr){
		int sum=0;
		for(int i = 0; i < arr.length; i++)
			sum += arr[0][i];
		
		for(int i = 0 ; i< arr.length; i++){
			int tmp=0;
			for(int a = 0; a< arr[i].length; a++){
				tmp += arr[i][a];
			}
			if(tmp != sum) return false;
		}
		for(int i = 0 ; i< arr[0].length; i++){
			int tmp=0;
			for(int a = 0; a< arr.length; a++){
				tmp += arr[a][i];
			}
			if(tmp != sum) return false;
		}
		int tmp_di=0;
		for(int i = 0; i < arr.length; i++){
			tmp_di += arr[i][i];
		}
		if(tmp_di != sum){
			return false;
		}
		tmp_di = 0;
		for(int i = arr.length-1, a = 0; i >= 0; i--){
			tmp_di += arr[i][a++];
		}
		if(tmp_di != sum){
			return false;
		}
		return true;
		
	}

	
	
}