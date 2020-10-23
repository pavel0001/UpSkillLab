import static  java.lang.Math.pow;
import static  java.lang.Math.sin;
public class Task7 {
    public static void main(String args[]) {
		int n = 8;
      double[][] arr = new double[n][n];
	  int counter=0;
	  for(int c = 0; c < arr.length; c++){
		  for(int l = 0; l < arr[c].length; l++){
			  arr[c][l] = sin((pow(c,2)-pow(l,2))/n);
			  if(arr[c][l]>0)
				  counter++;
		  }
	  }
	  printMatrice(arr); // Print our matrice
	  System.out.println("Elements > 0: "+counter);
    }
	public static void printMatrice(double[][] a){
		for(int i = 0; i < a.length; i++ ){
			for(double e: a[i])
				System.out.print(e+" ");
			System.out.println(" ");
		}
		System.out.println("-------------------------------------");
	}
	
	
}