import java.lang.Math;
class Task13{
	public static void main(String[] args){
		int n = 2000;
		

		System.out.println("All numbers blizneci from: "+n+" to "+2*n);
		print(n);
		
		

		

	}
		public static void print(int n){
		for(int i = n, t =0; i <= 2*n; i++){
			if(isNumberNatural(i) && isNumberNatural(i+2)){
				System.out.print("["+i+" ; "+(i+2)+"] ");
				t++;
				if(t%10 == 0){
				System.out.println("");
			}
			}
			
		}
			

	}
	public static boolean isNumberNatural(int a){
		for(int i = 2; i< a; i++){
			if(a%i == 0){
				return false;
			}			
		}
		return true;
	}
}