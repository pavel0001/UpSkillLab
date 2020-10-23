class Task2{
	public static void main(String[] args){
	
	int a = 128;
	int b = 512;
	int c = 1024;
	int d = 256;
	System.out.println("Dano: a = "+a+" b = "+b+" c = "+c+" d = "+d);
	System.out.println("NOD = "+nod(a,b,c,d));

	


	}
	public static int nod(int a, int b, int c, int d){
		for(int i = whoIsMin(whoIsMin(a,b),whoIsMin(c,d)); i > 1; i--){
			if(a%i == 0 && b%i == 0 && c%i == 0 && d%i == 0){
				return i;
			}
		}
		return 1;
	}

	public static int whoIsMin(int a, int b){
		if(a<b){
			return a;
		}
		return b;

}
}