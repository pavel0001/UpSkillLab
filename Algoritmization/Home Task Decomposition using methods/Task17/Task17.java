import java.lang.Math;
class Task17{
	public static void main(String[] args){
		int n = 111;
		System.out.println(n+" need "+print(n)+" times minus himself sum \nwhat would take 0");
	}
	
	public static int print(int n){
		int count=0;
		while(n>0){
			n -= sumNumbers(n);
			count++;
		}
		return count;
		
	}


	public static int sumNumbers(int n){
		int sum=0;
	while(n>0){
		sum += n%10;
		n /= 10;
	}
	return sum;
	}
	
}