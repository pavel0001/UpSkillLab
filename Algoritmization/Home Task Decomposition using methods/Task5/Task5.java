import java.lang.Math;
class Task5{
	public static void main(String[] args){
	
	int[] a = {3,6,2,65,238,12,8,34,234,76,232,76,87,224,123};
	int[] b = {1,2,3,4,5,6,7,8,9};

	System.out.println("Dano: a = ");
	printArr(a);
	System.out.println(" Secend max number - "+secendMaximum(a));
	
	System.out.println("Dano: b = ");
	printArr(b);
	System.out.println(" Secend max number - "+secendMaximum(b));

	


	}
	public static int secendMaximum(int[] a){
		int[] tmp = a.clone();
		for(int i = 0; i< a.length; i++){
			for(int b = i; b < a.length-1; b++){
				if(a[b]>a[b+1]){
					int tmp_s = a[b];
					a[b] = a[b+1];
					a[b+1] = tmp_s;
				}
			}
		}
		return tmp[tmp.length-2];

	} 
	public static void printArr(int[] a){
			for(int q: a)
				System.out.print(q+" ");
			System.out.println("");
		
	}


}