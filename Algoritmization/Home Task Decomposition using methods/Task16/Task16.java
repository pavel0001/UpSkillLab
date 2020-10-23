import java.lang.Math;
class Task16{
	public static void main(String[] args){
		int n = 3;
		print(n);
	}
	
	public static void print(int n){
		int bott = bottomBorder(n);
		int top = topBorder(n);
		int sum=0;
	for(int i = bott, z =0; i < top; i++){
			if(isSortNumber(i)){
				System.out.print(i+" ");
				sum += i;
				z++;
				if(z % 10 == 0) System.out.println("");
			}
		}
		System.out.println("\nsumma = "+sum+" chetnih numbers = "+howMuchChetnih(sum));
		
	}
	public static int topBorder(int n){
		int border = 1;
		for(int i = 0; i < n; i ++)
			border *=10;
		return border;
	}
	public static int bottomBorder(int n){
		int border = 1;
		for(int i = 0; i < n-1; i ++)
			border *=10;
		return border;
	}

	public static boolean isSortNumber(int n){
	while(n>0){
		if(n%2 == 0){
		return false;
		}
		n /= 10;
	}
	return true;
	}
	
	public static int howMuchChetnih(int n){
	int count=0;
	while(n>0){
		if(n%2 == 0){
		count++;
		}
		n /= 10;
	}
	return count;
	
	}
}