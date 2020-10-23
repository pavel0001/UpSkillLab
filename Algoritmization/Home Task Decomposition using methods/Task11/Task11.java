import java.lang.Math;
class Task11{
	public static void main(String[] args){
		int n = 2147483;
		int t = 32542342;

		System.out.println("From n: "+n+" and t: "+t+", \nmore numbers has:"+whereIsMoreNumber(n, t));

		

	}
	public static int whereIsMoreNumber(int n, int t){
		if(howMuchNumber(n) > howMuchNumber(t)){
			return n;
		}
		return t;
	}
	public static int howMuchNumber(int n){
		int counter=0;
		while(n>0){
			n /= 10;
			counter++;
		}
		return counter;
	}
}