import java.lang.Math;
class Task14{
	public static void main(String[] args){
		int k = 1000000;
		System.out.println("All Armstrong's number from 1 to "+k+" :");
		print(k);
	}
	
	public static void print(int k){
	for(int i = 1, t=0; i <= k; i++){
			if(isNumberArmstrongs(i)){
				System.out.print(i +" ");
				t++;
				if(t%10 == 0){
					System.out.println("");
				}
			}
		}
		
	}
	public static boolean isNumberArmstrongs(int a){
		if(sumNumberInPow(a) == a){
			return true;
		}
		return false;
	}
	public static int sumNumberInPow(int a){
		int sum=0;
		int howMuch = howMuchNumber(a);
		for(int i =0; i < howMuch; i++){
			sum += Math.pow((a%10),howMuch);
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
}