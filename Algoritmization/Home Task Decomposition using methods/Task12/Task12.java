import java.lang.Math;
class Task12{
	public static void main(String[] args){
		int k = 12;
		int n = 200;
		
		int[] arr = makeArray(k, n);
		System.out.println("Array, when sum each number equals: "+k+" \nand number small than n: "+n);
		print(arr);
		
		

		

	}
	public static int[] makeArray(int k, int n){
		int[] tmp = new int[n];
		int counter=0;
		for(int i = 0, t =0; i < tmp.length; i++){
			if(sumNumbers(i) == k){
			tmp[t++] = i;
			counter++;
			}
		}
		int[] tmp2  = new int[counter];
		for(int i =0; i<tmp2.length; i++){
			tmp2[i] = tmp[i];
		}
		return tmp2;
	}
	public static int sumNumbers(int a){
		int sum=0;
		while(a>0){
			sum += a%10;
			a /= 10;
		}
		return sum;
	}
	public static int howMuchNumber(int n){
		int counter=0;
		while(n>0){
			n /= 10;
			counter++;
		}
		return counter;
	}
		public static void print(int[] a){
		for(int i : a)
			System.out.print(i+" ");
		System.out.println("");
	}
}