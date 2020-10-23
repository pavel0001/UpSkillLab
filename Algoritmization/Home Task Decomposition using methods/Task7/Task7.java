import java.lang.Math;
class Task7{
	public static void main(String[] args){
		int a = 1;
		int b = 9;
	System.out.println(" Summ factorial numbers "+a+".."+b+" = "+factorial(a, b));
	}
	public static int factorial(int bottom, int top){
		int sum=0;
		for(int i = bottom; i <= top; i++){
			int tmp=i;
			for(int b = i-1; b>0 ; b--){
				tmp *= b;
			}
			sum += tmp;
		}
	return sum;

	} 
	public static int whoIsMin(int a, int b){
		if(a>b){
			return b;
		}
		return a;
	}


}