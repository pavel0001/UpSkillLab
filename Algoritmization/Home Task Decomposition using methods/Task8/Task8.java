import java.lang.Math;
class Task8{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9,10,11};
		int n = 3;
		print(a);
		foo(a);
		System.out.println("Summ three elements from n ="+n+" = "+summThree(a, n));
		

	}
	public static void foo(int[] a){
		if(a.length >=7){
		int counter=1;
		int[] result = new int[3];
		int r=0;
		for(int i = 1; i <7; i++){
			result[r] += a[i];
			if(counter%3 == 0) {
				i -= counter/3; 
				r++;
			}
			if(counter==9) break;
			counter++;
		}
		System.out.println("D[l] + D[2] + D[3] = "+result[0]);
		System.out.println("D[3] + D[4] + D[5] = "+result[1]);
		System.out.println("D[4] + D[5] + D[6] = "+result[2]);
		
		}
		else System.out.println("Array very small");
	}
public static int summThree(int[] a, int n){
int sum=0;
for(int i = n; i < n+3; i++){
	sum += a[i];
}
return sum;
}	
	public static void print(int[] a){
		for(int i : a)
			System.out.print(i+" ");
		System.out.println("");
	}
	public static int whoIsMin(int a, int b){
		if(a>b){
			return b;
		}
		return a;
	}


}