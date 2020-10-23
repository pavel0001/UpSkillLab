import java.lang.Math;
class Task15{
	public static void main(String[] args){
		int n = 4;
		print(n);
	}
	
	public static void print(int n){
		int bott = bottomBorder(n);
		int top = topBorder(n);
	for(int i = bott, z =0; i < top; i++){
			if(isSortNumber(i)){
				System.out.print(i+" ");
				z++;
				if(z % 10 == 0) System.out.println("");
			}
		}
		
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
	int tmp=10;
	while(n>0){
		if(n%10 < tmp){
		tmp = n%10;
		}
		else return false;
		n /= 10;
	}
	return true;
	}
}