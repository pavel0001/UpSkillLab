class Task1{
	public static void main(String[] args){
	
	int a = 124;
	int b = 512;
	System.out.println("Dano: a = "+a+" b = "+b);
	System.out.println("NOD = "+nod(a,b));
	System.out.println("NOK = "+nok(a,b));
	


	}
	public static int nod(int a, int b){
		for(int i = whoIsMin(a,b); i > 1; i--){
			if(a%i == 0 && b%i == 0){
				return i;
			}
		}
		return 1;
	}
	public static int nok(int a, int b){
		int max = whoIsMin(a,b);
		boolean flag = true;
		while(flag){
			if(max%a == 0 && max%b == 0){
				flag = false;
				return max;
			}
			max += max;
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