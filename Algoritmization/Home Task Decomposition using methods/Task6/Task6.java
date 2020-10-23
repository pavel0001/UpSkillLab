import java.lang.Math;
class Task6{
	public static void main(String[] args){
	
	int a = 29;
	int b = 7;
	int c = 14;

	System.out.println("Dano: a = "+a+" b = "+b+" c = "+c);
	System.out.println(" Is This number mutually simple?  - "+simple(a,b,c));


	


	}
	public static boolean simple(int a, int b, int c){
		int min = whoIsMin(a,whoIsMin(b,c));
		for(int i = min; i > 1; i--){
			if(a%i == 0 && b%i == 0 && c%i==0){
				return false;
			}
		}
		return true;

	} 
	public static int whoIsMin(int a, int b){
		if(a>b){
			return b;
		}
		return a;
	}


}