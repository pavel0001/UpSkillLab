

public class Task1
{
	public static void main(String[] args) {

	    int k = 5;
	    int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[] b = {16,16,16,16,16};
		System.out.print("   We have 2 array: a: ");
		printArr(a);
		System.out.print("\n                       and b: ");
		printArr(b);
		System.out.print("\nAfter compare a + b :");
		a = compareArr(a, b, k);
		printArr(a);
	    
	    
	    
	    
}
public static void printArr(int[] arr){
	for(int i : arr)
		System.out.print(i+" ");
}
public static int[] compareArr(int[] a, int[] b, int k){
	int[] tmp = new int[a.length+b.length];
		for(int i =0,aa=0, bb = 0; i < tmp.length; i++){
			if(i > (k-1) && i <= (k-1+b.length)){
			tmp[i] = b[bb++];
			}
			else{
				tmp[i] = a[aa];
				aa++;
			}
			
		}
		return tmp;
}
}
