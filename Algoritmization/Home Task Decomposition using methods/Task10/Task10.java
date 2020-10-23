import java.lang.Math;
class Task10{
	public static void main(String[] args){
		int n = 2147483647;
		int[] tmp = arrayFromN(n);
		print(tmp);

		

	}
	public static int[] arrayFromN(int n){
		boolean flag = true;
		int[] tmp = new int[howMuchNumber(n)];
		for(int i = tmp.length-1; i >= 0; i--){
		tmp[i] = n%10;
		n /= 10;
		}
		
	return tmp;		
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