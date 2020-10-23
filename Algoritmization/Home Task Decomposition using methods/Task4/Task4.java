import java.lang.Math;
class Task4{
	public static void main(String[] args){
	
	int[][] a = {
		{-25,5},
		{10,0},
		{-100,-2},
		{8,3}
	};

	System.out.println("Dano: a = ");
	printArr(a);
	System.out.println(longerCoord(a));

	


	}
	public static String longerCoord(int[][] a){
		int[] max = new int[2];
		double longest =0;
		for(int i = 0; i < a.length; i++){
			for(int b = i; b< a.length; b++){
			int x = a[i][0];
			int y = a[i][1];
			int xx = a[b][0];
			int yy = a[b][1];
			double tmp = Math.sqrt(Math.pow((x-xx),2)+ Math.pow((y-yy),2));
			if(longest< tmp){
				longest = tmp;
				max[0] = i;
				max[1] = b;
			}
			}
		}
		return "Max length with next point: (x: "
		+a[max[0]][0]+" y: "
		+a[max[0]][1]+" ) and (x: "
		+a[max[1]][0]+" y: "
		+a[max[1]][1]+" )";
	} 
	public static void printArr(int[][] a){
		for(int[] i: a){
			for(int q: i){
				System.out.print(q+" ");
			}
			System.out.println("");
		}
	}


}